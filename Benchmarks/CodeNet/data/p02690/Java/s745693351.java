//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            long x=scan.nextInt();
            int aa=1;
            int bb=0;
            int si=1;
            boolean flag=false;
            for(int i=1;i<=120;i++){
                long a=(long)Math.pow(i,5);
                long b=a-x;
                if(b<0){
                    si=-1;
                }
                b=Math.abs(b);
                for(int j=0;j<=120;j++){
                    if(b==(long)Math.pow(j,5)){
                        aa=i;
                        bb=j*si;
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            out.println(aa+" "+bb);
        }
        out.flush();
        out.close();
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
