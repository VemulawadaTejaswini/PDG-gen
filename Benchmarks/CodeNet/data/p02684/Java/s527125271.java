import javax.print.attribute.HashAttributeSet;
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
        BigInteger k=sc.nextBigInteger();

        int a[]=new int[n];
        for(int j=0;j<n;j++)
            a[j]=sc.nextInt();
        BigInteger nn=new BigInteger(Integer.toString(n));


        BigInteger m=k.mod(nn);
        String mo=m.toString();

        int mo1=Integer.parseInt(mo);
        int ans=1;
        for(int j=0;j<n;j++)
        {
            ans=a[ans-1];

        }
        for(int j=0;j<mo1;j++)
        {
            ans=a[ans-1];

        }

        System.out.println(ans);




    }
}







