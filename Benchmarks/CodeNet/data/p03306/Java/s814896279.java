import java.util.*;

public class Main {
    static int n, m;
    static ArrayList<Integer[]>[] g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<Integer[]>();
        }
        for(int i=0; i<m; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int s = sc.nextInt();
            g[u].add(new Integer[]{v, s});
            g[v].add(new Integer[]{u, s});
        }
        sc.close();

        long min = 0, max = 1000000007;
        while(max - min > 1){
            long mid = (max + min) / 2;
            if(bfs(mid)){
                min = mid;
            }else{
                max = mid;
            }
        }
        System.out.println(min);
    }

    public static boolean bfs(long s){
        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        que.add(0);
        long[] num = new long[n];
        Arrays.fill(num, -1);
        num[0] = s;

        while(!que.isEmpty()){
            Integer cur = que.poll();
            for(int i=0; i<g[cur].size(); i++){
                Integer[] next = g[cur].get(i);
                if(num[next[0]] == -1){
                    if((num[next[0]] = next[1] - num[cur]) <= 0){
                        return false;
                    }
                    que.add(next[0]);
                }else{
                    if(num[next[0]] != next[1] - num[cur]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}