import java.io.*;

import java.math.BigInteger;
import java.util.*;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {

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

        for(int j=0;j<n;j++)
        {
            if(hm.get(j+a[j]+1)==null)
            hm.put(j+a[j]+1,1);
            else
                hm.put(j+a[j]+1,hm.get(j+a[j]+1)+1);
            if(hm1.get((j+1)-a[j])==null)
                hm1.put(((j+1)-a[j]),1);
            else
                hm1.put(((j+1)-a[j]),hm1.get((j+1)-a[j])+1);

        }
        long res=0;
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(hm1.get(entry.getKey())!=null)
            res+=entry.getValue()*hm1.get(entry.getKey());
        }
        System.out.println(res);


    }
}







