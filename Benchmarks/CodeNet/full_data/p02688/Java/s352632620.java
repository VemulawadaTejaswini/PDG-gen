//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int t=1;
        //t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int k=scan.nextInt();
            int[] f=new int[n];
            for(int i=0;i<k;i++){
                int d=scan.nextInt();
                for(int j=0;j<d;j++){
                    int di=scan.nextInt();
                    f[di-1]++;
                }
            }
            int v=0;
            for(int i=0;i<n;i++){
                if(f[i]==0){
                    v++;
                }
            }
            out.println(v);
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
