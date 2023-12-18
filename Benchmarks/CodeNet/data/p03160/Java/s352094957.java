//package cf;
import java.io.*;
import java.util.*;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int p=1000000007;
    static int dp[]=new int[100000];
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        FastReader sc=new FastReader();
        int tc=sc.nextInt();
        int ar[]=new int[tc];
        for(int i=0;i<tc;i++)
            ar[i]=sc.nextInt();
        int dp1[]=new int[tc];
        dp1[0]=0;
        //dp1[1]=Math.abs(ar[1]-ar[0]);
        for(int i=1;i<tc;i++)
        {
            dp1[i]=Math.min((Math.abs(ar[i]-ar[i-1]))+dp1[i-1],i-2<0?Integer.MAX_VALUE:(Math.abs(ar[i]-ar[i-2])+dp1[i-2]));
        }
      //  System.out.println(Arrays.toString(dp1));

        //Arrays.fill(dp,-1);

        //System.out.println(frog(ar,0)+" "+Arrays.toString(dp));

        out.write(dp1[tc-1]+"");
        out.flush();
    }
    public static  int frog(int ar[],int i)
    {
        if(i==ar.length-1)
            return 0;
        if(i>=ar.length)
            return Integer.MAX_VALUE;
        if(dp[i]!=-1)
            return dp[i];

        int r1=Math.abs(ar[i]-ar[i+1])+frog(ar,i+1);
        int r2=i+2>=ar.length?Integer.MAX_VALUE:(Math.abs(ar[i]-ar[i+2])+frog(ar,i+2));

            dp[i]=Math.min(r1,r2);
            //System.out.println(i+" "+dp[i]+" "+frog(ar,i+1));
            return dp[i];
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
