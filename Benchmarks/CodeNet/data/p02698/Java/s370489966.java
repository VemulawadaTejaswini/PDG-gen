import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i = 0 ; i < N ; i++){
            a[i] = sc.nextInt();
        }

        ArrayList<LinkedList<Integer>> children = new ArrayList<>(N);
        for(int i = 0 ; i < N ; i++){
            children.add(new LinkedList<Integer>());
        }
        for(int i = 0 ; i < N-1 ; i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            children.get(u).add(v);
            children.get(v).add(u);
        }

        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<Integer> f = new ArrayList<>();
        f.add(-1);
        queue.add(new Pair(0, f));
        boolean[] visited = new boolean[N];
        for(int i = 0 ; i < N ; i++){
            visited[i] = false;
        }
        visited[0] = true;
        int[] length = new int[N];

        while (!queue.isEmpty()){
            Pair now = queue.removeFirst();
            int pos = getPlace(now.dp, a[now.n]);
            if(pos == now.dp.size()){
                now.dp.add(a[now.n]);
            }else{
                now.dp.set(pos, a[now.n]);
            }
            length[now.n] = now.dp.size()-1;
            if(children.get(now.n).size() == 1){
                int next = children.get(now.n).removeFirst();
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(new Pair(next, now.dp));
                }
            }else {
                while (!children.get(now.n).isEmpty()) {
                    int next = children.get(now.n).removeFirst();
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(new Pair(next, new ArrayList<Integer>(now.dp)));
                    }
                }
            }
        }

        StringBuilder strb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            strb.append(length[i]);
            strb.append("\n");
        }

        System.out.println(strb.toString());
    }

    static int getPlace(ArrayList<Integer> dp, int v){
        int ok = 0;
        int ng = dp.size();
        while(ng - ok > 1){
            int tmp = (ok + ng)/2;
            if(dp.get(tmp) < v){
                ok = tmp;
            }else{
                ng = tmp;
            }
        }
        return ng;
    }
}

class Pair{
    int n;
    ArrayList<Integer> dp;

    private void of(int n, ArrayList<Integer> dp) {
        this.n = n;
        this.dp = dp;
    }
    Pair(int n, ArrayList<Integer> dp){
        this.of(n, dp);
    }
    Pair(Pair p){
        this.of(p.n, p.dp);
    }
}