import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
class index {
        long curritems;
        long currweight;
    public index(){}
}
    class Main
    {
         static long max(long a, long b) { return (a > b)? a : b; }
        static long knapSack(int W, int wt[], long val[], int n)
        {
            int i, w;
            long K[][] = new long[n+1][W+1];

            for (i = 0; i <= n; i++)
            {
                for (w = 0; w <= W; w++)
                {
                    if (i==0 || w==0)
                        K[i][w] = 0;
                    else if (wt[i-1] <= w)
                        K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                    else
                        K[i][w] = K[i-1][w];
                }
            }

            return K[n][W];
        }
    public static void main(String[] args)throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        long [] val = new long[number];
        int [] wts = new int[number];
        int maxweight= Integer.parseInt(st.nextToken());
        for(int i = 0;i <number;i++){
            st=new StringTokenizer(br.readLine());
            wts[i]=Integer.parseInt(st.nextToken());
            val[i]=Long.parseLong(st.nextToken());
        }

        out.println(knapSack(maxweight,wts,val,val.length));
        out.flush();
    }
}