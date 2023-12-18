//package com.karancp;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;


 class Main {
    public static void main(String args[])
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader z = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        task solver =new task();
        solver.solve(z,out);
        out.close();
    }

    static class task
    {

        static long gcd(long a,long b)
        {
            if(b==0)return a;
            else return gcd(b,a%b);
        }
        static long lcm(long a,long b)
        {
            long pp=a*b;
            long bb=gcd(a,b);
            long res =pp/bb;
            return res;
        }
        static int max(int a,int b)
        {
            return Math.max(a,b);
        }
        static int min(int a,int b)
        {
            return Math.min(a,b);
        }





        public static void solve(InputReader pp, PrintWriter out) {
         Scanner z=new Scanner(System.in);
         double n=z.nextDouble();
         double k=z.nextDouble();
         double ans=0.000000000000;
         double p=0.5000000000;
         int i;
            DecimalFormat df =new DecimalFormat("#.###############");
         for(i=1;i<=n;i++)
         {
             if(i>=k){
              ans+=(1/n);
             }
            else{ double kk=(k/(i*1.00));
             //kk=Math.ceil(kk);
             kk=Math.log(kk)/Math.log(2);
             kk=Math.ceil(kk);
             int pow=(int)kk;
             ans+=(((1.0)/n)*(Math.pow(p,pow)));}
             //out.println(ans);
         }
         out.print(df.format(ans));
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }

    }



}