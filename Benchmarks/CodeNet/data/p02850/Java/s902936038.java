import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static List<Node>[] edge = new ArrayList[n];
    static int[] arr = new int[n-1];
    static boolean[] visit = new boolean[n];


    public static void main(String[] args){

        for (int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }

        for (int i=0; i<n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            edge[a].add(new Node(b, i));
            edge[b].add(new Node(a, i));
        }

        int k = 1;

        for (int i=0; i<n; i++){
            k = Math.max(k, edge[i].size());
        }

        System.out.println(k);
        arr[0] = 1;
        bfs();

        for (int i=0; i<n-1; i++){
            System.out.println(arr[i]);
        }
    }

    public static void bfs(){
        Queue<Node> q = new ArrayDeque<>();
        ((ArrayDeque<Node>) q).push(new Node(0, -1));
//        visit[0] = true;
        while (!q.isEmpty()){
            int tmp = 0;
            Node u = q.poll();
            for (int i=0; i<edge[u.node].size(); i++){
                int v = edge[u.node].get(i).node;
                int index = edge[u.node].get(i).idx;
                if (visit[v]) continue;

//                if (u.idx==-1 || index==-1) {
//                    ++tmp;
//                    continue;
//                }

//                if (arr[u.idx]==++tmp){
//                    ++tmp;
//                }
                int tmp2 = u.idx;
                if (tmp2==-1) ++tmp2;
                if (arr[tmp2]==tmp+1){
                    ++tmp;
                }


                arr[index] = ++tmp;
                visit[v] = true;
                ((ArrayDeque<Node>) q).push(new Node(v, index));
            }
        }
    }

    public static class Node{
        int node;
        int idx;
        public Node(int n, int i){
            this.node = n;
            this.idx = i;
        }
    }

}
