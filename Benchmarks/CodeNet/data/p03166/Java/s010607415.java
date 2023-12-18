import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int M = in.nextInt();
   
    List<Integer>[] graph = new ArrayList[N+1];
    Queue<int[]> q = new LinkedList();
    
    for(int i = 1; i <= N; i++) {
        graph[i] = new ArrayList();
        q.offer(new int[]{i,0});
    }
    
    for(int i = 0; i < M; i++) {
        int u = in.nextInt();
        int v = in.nextInt();
        graph[u].add(v);
    }
    


   
    int ans = Integer.MIN_VALUE;
    
   while(!q.isEmpty()) {
       int[] pair = q.poll();
       int u = pair[0];
       int d = pair[1];
       ans = Math.max(ans, d);
       for(int v : graph[u]) {
           q.offer(new int[]{v, d+1});
       }
   }
    
    System.out.println(ans);
  }
  
}