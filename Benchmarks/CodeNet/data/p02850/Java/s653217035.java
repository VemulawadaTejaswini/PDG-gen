import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static List<Integer>[] edge = new ArrayList[n];
    static int[] arr = new int[n];
    static boolean[] visit = new boolean[n];


    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        List<Integer>[] edge = new ArrayList[n];

        if (n==2){
            System.out.println(1);
            System.out.println(1);
            return;
        }

        for (int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }

        for (int i=0; i<n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            edge[a].add(b);
            edge[b].add(a);
        }

        int k = 1;

        for (int i=0; i<n; i++){
            k = Math.max(k, edge[i].size());
        }

        System.out.println(k);
        arr[0] = 1;
        bfs();

        System.out.println(arr[0]);
        for (int i=1; i<n-1; i++){
            System.out.println(arr[i]);
        }
//        int[] arr = new int[n-1];
    }

    public static void bfs(){
        Queue<Integer> q = new ArrayDeque<>();
        ((ArrayDeque<Integer>) q).push(0);
        visit[0] = true;
        int tmp = 1;
        while (!q.isEmpty()){
            tmp = 1;
            int u = q.poll();
            for (int i=0; i<edge[u].size(); i++){
                int v = edge[u].get(i);
                if (visit[v]) continue;
                arr[v] = ++tmp;
                visit[v] = true;
                ((ArrayDeque<Integer>) q).push(v);
            }
        }
    }

}