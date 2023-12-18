import java.util.*;

class Main {

    static final Scanner in = new Scanner(System.in);

    static int N, M;
    static List<Integer>[] adj;
    static int[] dist;
    static boolean[] visited;

    static int dfs(int x){
        // System.out.println("x = "+x);
        visited[x] = true;

        for(int y : adj[x]){
            dist[x] = Math.max(dist[x],1+dfs(y));
        }
        return dist[x];
    }

    public static void main(String[] args) {
        N = in.nextInt();
        M = in.nextInt();
        adj = new ArrayList[N];
        dist = new int[N];
        visited = new boolean[N];

        for(int i = 0;i < N;i++)    
            adj[i] = new ArrayList<>();
        
        for(int i = 0;i < M;i++){
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            adj[x].add(y);
        }    
        
        for(int i = 0;i < N;i++)
            if(!visited[i])
                dfs(i);

        // for(int i = 0;i < N;i++)
        //     System.out.print(dist[i]+" ");
        // System.out.println();            
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i < N;i++){
            ans = Math.max(dist[i],ans);
        }

        System.out.println(ans);

        

    }

}
