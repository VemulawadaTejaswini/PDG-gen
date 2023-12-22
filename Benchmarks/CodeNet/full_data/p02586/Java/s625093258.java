import java.util.*;
import java.io.*;
import java.math.*;

class Main
{
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] grid = new int[R][C];

        for (int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            int v = Integer.parseInt(st.nextToken());
            grid[r][c] = v;
        }

        long[][] dp = new long[R][C];

        {
            PriorityQueue<Integer> pq = new PriorityQueue();
            pq.offer(0);
            pq.offer(0);
            pq.offer(0);
            int curSum = 0;
            for (int i=0; i<C; i++) {
                if (grid[0][i]>pq.peek()) {
                    curSum = curSum - pq.poll() + grid[0][i];
                    dp[0][i] = curSum;
                    pq.offer(grid[0][i]);
                }
            }
        }

        for (int i=1; i<R; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue();
            pq.offer(0);
            pq.offer(0);
            pq.offer(0);
            int curSum = 0;
            dp[i][0] = dp[i-1][0]+grid[i][0];
            for (int j=1; j<C; j++) {
                dp[i][j] = dp[i-1][j]+grid[i][j];
                if(dp[i][j]<dp[i][j-1]-pq.peek()+grid[i][j]) {
                    dp[i][j] = dp[i][j-1]-pq.poll()+grid[i][j];
                    pq.offer(grid[i][j]);
                }
            }
        }
        //     out.println();

        // for (int i=0; i<R; i++) {
        //     for (int j=0; j<C; j++) {
        //         out.print(grid[i][j]+" ");
        //     }
        //     out.println();
        // }
        //     out.println();

        // for (int i=0; i<R; i++) {
        //     for (int j=0; j<C; j++) {
        //         out.print(dp[i][j]+" ");
        //     }
        //     out.println();
        // }
        //     out.println();

        out.println(dp[R-1][C-1]);

        out.close();
    }

    

}
