    import java.io.*;
    import java.util.*;
    import static java.lang.System.out;
     
    class Main{
      public static void main(String[] args) throws IOException{
        BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
     
        String[] str2 = br.readLine().split(" ");
        int[] a = new int[N+1];
        for(int i=1; i <= N; i++)
          a[i] = Integer.parseInt(str2[i-1]);
        
        //
        int ans = 0;
        if(a[1] != 1)
          ans++;
     
        boolean[][] graph = new boolean[N+1][N+1];
        for(int i=2; i <= N; i++)
          graph[a[i]][i] = true;
     
     
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
     
        int[] dp = new int[N+1];
        
        while(!q.isEmpty()){
          int nowi = q.poll();
     
          if(dp[nowi] > K){
            ans++;
            for(int i=1; i <= N; i++){
              if(graph[nowi][i]){
                q.add(i);
                dp[i] = 2;
              }
            }
          }
          else{
            for(int i=1; i <= N; i++){
              if(graph[nowi][i]){
                q.add(i);
                dp[i] = dp[nowi] + 1;
              }
            }
          }
        }
        br.close();
        out.println(ans);
      }
    }