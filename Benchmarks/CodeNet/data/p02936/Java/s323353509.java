import java.util.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static boolean[] visited = new boolean[n];
    static int[] value = new int[n];
    static List<Integer>[] edge = new ArrayList[n];



    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int q = sc.nextInt();
//        int[] value = new int[n];
//        List<Integer>[] edge = new ArrayList[n];

        for (int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }

        Node[] nodes = new Node[n];
        for (int i=0; i<n; i++) nodes[i] = new Node();

        for (int i=0; i<n-1; i++){
            int v = sc.nextInt()-1;
            int u = sc.nextInt()-1;
            edge[v].add(u);
            edge[u].add(v);
        }

        for (int i=0; i<q; i++){
            int s = sc.nextInt()-1;
            int v = sc.nextInt();
            value[s] += v;
        }

        dfs(0, 0l);



//        List<Integer> l = new ArrayList<>();
//        Queue<Integer> l = new ArrayDeque<>();

//        l.add(0);
//
//        while (!l.isEmpty()){
//            int a = ((ArrayDeque<Integer>) l).pollFirst();
//            for (int c: edge[a]){
//                value[c] += value[a];
//                l.add(c);
//            }
//        }

        for (int i=0; i<n; i++){
            System.out.print(value[i]+" ");
        }
    }

    private static void dfs(int u, long cnt){
        visited[u] = true;
        value[u] += cnt;
        for (int v: edge[u]){
            if (!visited[v]){
                dfs(v, value[u]);
            }
        }

    }

    public static class Node{
        static List<Node> adj = new ArrayList<>();
        static int offset;
        static int cnt;
    }

}
