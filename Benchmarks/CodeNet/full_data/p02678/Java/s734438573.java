import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    static int parent[]; 

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
        int M = nextInt();
     
        parent = new int [N+1];
 
           
        ArrayList<Integer> matrix [] = new ArrayList [N+1];

        for (int x=1; x<=N; x++) {
            matrix[x] = new ArrayList<Integer>();
        }

        for (int x=1; x<M; x++) {
            int one = nextInt();
            int two = nextInt();
            matrix[one].add(two);
            matrix[two].add(one);
        }
    
        bfs(matrix, 1);
        
        boolean flag = true;
        for (int x=1; x<=N; x++) {
            if(parent[x] == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
            for (int x=2; x<=N; x++) {
                System.out.println(parent[x]);
            }
        }
        else{
            System.out.println("No");
        }
        
    
    }
        
    public static boolean bfs (ArrayList [] matrix,  int start) {
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int x=0; x<matrix[cur].size(); x++) {
                int now = (int) matrix[cur].get(x);
                if(parent[now]==0){
                    parent[now] = cur;
                    queue.add(now);
                }
            }
        }
        return false;
    }
    
      
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}