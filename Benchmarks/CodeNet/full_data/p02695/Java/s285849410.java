//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    static int sum;
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        sum=0;
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int m=scan.nextInt();
            int q=scan.nextInt();
            qs[] arr=new qs[q];
            for(int i=0;i<q;i++){
                arr[i]=new qs(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
            }
            int[] f=new int[n+1];
            f[0]=1;
            gene(n,f,arr,1,m);
            out.println(sum);
        }
        out.flush();
        out.close();
    }
    static void gene(int n,int[] f,qs[] arr,int i,int m){
        if(i==n+1){
            int temp=0;
            for(int j=0;j<arr.length;j++){
                if(f[arr[j].b]-f[arr[j].a]==arr[j].c){
                    temp+=arr[j].d;
                }
            }
            sum=Math.max(sum,temp);
            return;
        }
        for(int j=f[i-1];j<=m;j++){
            f[i]=j;
            gene(n,f,arr,i+1,m);
        }
    }
    static class qs{
        int a;
        int b;
        int c;
        int d;
        qs(int a,int b,int c,int d){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
        }
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
