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
            int n=scan.nextInt();
            int m=scan.nextInt();
            int[] arr=new int[n];
            boolean[] ans=new boolean[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++){
                int u=scan.nextInt()-1;
                int v=scan.nextInt()-1;
                if(arr[u]<=arr[v]){
                    ans[u]=true;
                }if(arr[v]<=arr[u]){
                    ans[v]=true;
                }
            }
            int v=0;
            for(int i=0;i<n;i++){
                if(!ans[i]){
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
