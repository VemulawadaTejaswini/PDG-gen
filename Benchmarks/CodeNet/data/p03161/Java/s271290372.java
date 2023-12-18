
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
    static int k=0;
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        FastReader sc=new FastReader();
        int tc=sc.nextInt();

        k=sc.nextInt();
        int ar[]=new int[tc];
        for(int i=0;i<tc;i++)
            ar[i]=sc.nextInt();
        int dp1[]=new int[tc];
        dp1[0]=0;
        //dp1[1]=Math.abs(ar[1]-ar[0]);
        for(int i=1;i<tc;i++)
        {
     //       dp1[i]=Math.min((Math.abs(ar[i]-ar[i-1]))+dp1[i-1],i-2<0?Integer.MAX_VALUE:(Math.abs(ar[i]-ar[i-2])+dp1[i-2]));
        }
      //  System.out.println(Arrays.toString(dp1));

        Arrays.fill(dp,-1);

      //  System.out.println(frog(ar,0,1)+" "+Arrays.toString(dp));

        out.write(""+frog(ar,0,1));
        out.flush();
    }
    public static  int frog(int ar[],int i,int k1)
    {
        if(k1>k)
        {
            return Integer.MAX_VALUE;
        }
       // if(i+k1>ar.length-1)
         //   return 0;
        if(i>=ar.length-1)
            return 0;
        if(dp[i]!=-1)
            return dp[i];

        //int r1=Math.abs(ar[i]-ar[i+1])+frog(ar,i+1);
        //int r2=i+2>=ar.length?Integer.MAX_VALUE:(Math.abs(ar[i]-ar[i+2])+frog(ar,i+2));
     //   int res=Integer.MAX_VALUE;
     //   for(int in=1;in+i<ar.length;in++)
         //   {
       //         res=Math.min(Math.abs(ar[i]-ar[i+in])+frog(ar,i+in),res);

           //     System.out.println(i+" "+dp[i]+" "+res);
            //}
      //  System.out.println((i+k1)+" ");

        int r2=i+k1>ar.length-1?Integer.MAX_VALUE:(Math.abs(ar[i]-ar[i+k1])+frog(ar,i+k1,k1));
        int r3=frog(ar,i,k1+1);
       // System.out.println(i+" "+dp[i]+" "+r2+"  "+r3);

        dp[i]=Math.min(r2,r3);
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
