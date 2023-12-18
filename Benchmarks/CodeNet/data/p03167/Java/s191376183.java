
//package cf;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static int mod=1000000007;
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        FastReader sc=new FastReader();

        int h=sc.nextInt();
        int w=sc.nextInt();
        int dp[][]=new int[h+1][w+1];
        char ar[][]=new char[h][w];
        for(int i=0;i<=h;i++) {
            Arrays.fill(dp[i],-1);
        }
            for(int i=0;i<h;i++)
        {
            String s=sc.nextLine();
            ar[i]=s.toCharArray();
        }
        System.out.println(grid(ar,0,0,h,w,dp));

        // StringBuilder sb=new StringBuilder();
        //   out.write(sb.toString());
        out.flush();
    }

    private static int grid(char[][] ar, int i, int j, int h, int w, int[][] dp) {
        if(i==h-1&&j==w-1)
            return 1;
        if(i>=h||j>=w)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int right=(i+1<h&&ar[i+1][j]!='#'?grid(ar,i+1,j,h,w,dp):0)%mod;
        int down=(j+1<w&&ar[i][j+1]!='#'?grid(ar,i,j+1,h,w,dp):0)%mod;
        dp[i][j]=(right+down)%mod;
        return dp[i][j];
    }


    ///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
