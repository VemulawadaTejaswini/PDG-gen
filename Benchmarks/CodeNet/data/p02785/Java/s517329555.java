import java.io.*;

import java.math.BigInteger;
import java.util.*;

import java.util.ArrayList;

import java.util.Scanner;


class Main {

    /*static class FastReader {
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
    public static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }*/

    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            int hn=sc.nextInt();
            int m=sc.nextInt();
            int h[]=new int[hn];
            int s=0;
            for(int j=0;j<hn;j++)
            {
                h[j]=sc.nextInt();
            }
            Arrays.sort(h);
            if(hn<=m)
                System.out.println(0);
            else
            {
                long ans=0;
                for(int j=0;j<hn-m;j++)
                    ans+=h[j];
                System.out.println(ans);
            }

        }
    }


