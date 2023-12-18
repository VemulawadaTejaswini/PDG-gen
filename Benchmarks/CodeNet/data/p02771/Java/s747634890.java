import javax.swing.*;
import java.util.*;
import java.io.*;


public class Main {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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


    }
    public class pair {
        int a;
        int b;

        pair(int p, int q) {
            a = p;
            b = q;
        }
        public int hashCode() {
            return new Integer(a).hashCode() * 31 + new Integer(b).hashCode();
        }
    }

    public static int gcd(int a, int b) {
        if (a == 1 || b == 1)
            return 1;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        return gcd(b % a, a);
    }






    public static void main(String[] args) {
        FastReader s=new FastReader();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==b && a!=c && b!=c)
            System.out.println("YES");
        else if(a==c && a!=b && b!=c)
            System.out.println("YES");
        else if(b==c && b!=a && c!=a)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    public static boolean palindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
                continue;
            else
            {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str)
    {
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i] = str.charAt(str.length()-i-1);
        }
        String str1 = String.valueOf(arr);
        return str1;

    }




}







