import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static List<Node>[] edge = new ArrayList[n];
    static int[] arr = new int[n-1];
    static boolean[] visit = new boolean[n];
    static int[] used = new int[n];
    static int[] parent = new int[n];


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
        used[0] = 1;
        bfs();


        for (int i=0; i<n-1; i++){
            System.out.println(arr[i]);
        }
    }

    public static void bfs(){
        Queue<Integer> q = new ArrayDeque<>();
        ((ArrayDeque<Integer>) q).push(0);
//        visit[0] = true;
        while (!q.isEmpty()){
            int tmp = 0;
            int u = q.poll();
            int tmp_idx = 0;
            for (Node next : edge[u]){
                if (used[next.node]!=1){
                    tmp++;
                    used[next.node] = 1;
                    if (tmp==parent[u]){
                        tmp++;
                    }
                    arr[edge[u].get(tmp_idx).idx] = tmp;
                    parent[next.node] = tmp;
                    ((ArrayDeque<Integer>) q).push(next.node);
                }
                tmp_idx++;
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
