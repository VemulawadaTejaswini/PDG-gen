import java.io.*;

import java.math.BigInteger;
import java.util.*;

import java.util.ArrayList;

import java.util.Scanner;


public class main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    static final int mod = 1000000007;

    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

       int a[]=new int[n];
       for(int j=0;j<n;j++)
           a[j]=sc.nextInt();

       HashMap<Integer,Integer>hm=new HashMap<>();
        HashMap<Integer,Integer>hm1=new HashMap<>();
        int b[]=new int[n];
        int c[]=new int[n];
        for(int j=0;j<n;j++)
        {
            b[j]=(j+1)+a[j];
            c[j]=(j+1)-a[j];
        }
        for(int j=0;j<n;j++)
        {
            hm.put(b[j],hm.getOrDefault(b[j],0)+1);
        }
        long res=0;

        for(int j=0;j<n;j++)
        {
            if(hm.get(c[j])!=null)
                res+=hm.get(c[j]);
        }

        System.out.println(res);


    }
}







