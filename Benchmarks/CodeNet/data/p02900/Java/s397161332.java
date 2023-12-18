import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main{
    static class FastReader
    {
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

    public static int cnt = 1;

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        Main main = new Main();
        //Scanner sc = new Scanner(System.in);
        long a = in.nextLong() , b = in.nextLong();
        a = main.GCD(a,b);
        factorial(a);
        System.out.print(cnt);
     }

     public static void factorial(long a){
        if( a%2 == 0 ){
            cnt++;
        }
        while( a%2 == 0 ){
            a /= 2;
        }
         if( a%3 == 0 ){
             cnt++;
         }
         while( a%3 == 0 ){
             a /= 3;
         }
         for(long i = 5 ; i*i <= a ; i += 2 ){
             if(a%i == 0 ){
                 cnt++;
                 while( a%i == 0 ){
                     a /= i;
                 }
             }
         }
         if( a > 2 ){
             cnt++;
         }
     }

    private long GCD(long a, long b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
}

