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
       int m=sc.nextInt();
       int a[]=new int[n+1];
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int j=1;j<=n;j++)
           {
           a[j]=sc.nextInt();
           hm.put(j,1);
       }
       for(int j=0;j<m;j++)
       {
           int x=sc.nextInt();
           int y=sc.nextInt();
           if(a[x]>a[y])
           {
               if(hm.get(y)!=null)
                   hm.remove(y);
           }
           else if(a[x]<a[y])
           {
               if(hm.get(x)!=null)
                   hm.remove(x);
           }
           else
           {
               if(hm.get(y)!=null)
                   hm.remove(y);
               if(hm.get(x)!=null)
                   hm.remove(x);
           }
       }
       //System.out.println(hm);
       System.out.println(hm.size());


    }
}







