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
            int[] arr=new int[n];
            Map<Integer,Integer> bmx=new HashMap<>();
            Map<Integer,Integer> apy=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
                bmx.putIfAbsent(i-arr[i],0);
                bmx.put(i-arr[i],bmx.get(i-arr[i])+1);
                apy.putIfAbsent(i+arr[i],0);
                apy.put(i+arr[i],apy.get(i+arr[i])+1);
            }
            int ans=0;
            for(int i=0;i<n;i++){
                Integer v=apy.get(i-arr[i]);
                if(v!=null){
                    ans+=v;
                }
            }
            out.println(ans);
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
