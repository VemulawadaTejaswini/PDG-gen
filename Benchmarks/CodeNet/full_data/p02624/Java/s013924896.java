import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static class FastReader{
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
    public static int lowerBound
            (Integer[] array, int length, int value) {
        int l = 0;
        int r = length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (value < array[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
    public static void main(String [] args)  {
       // int T = sc.nextInt();while (T--!=0)
        {
            solve();
        }
    }
//    public  static  long div(long n ){
//        int cn=0;
//        for (int i = 1; i * i<=n ; i++) {
//            if(n%i==0){
//                cn++;
//            }
//        }
//        cn*=2;
//
//        long sqr = (long)Math.sqrt(n);
//        if(sqr*sqr==n) cn--;
//        return cn;
//
//    }
    static long div (long n)
    {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                if (n / i == i)
                    cnt++;

                else
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }
    public static void solve()  {
//////////////////////////////////////////////////////////////////////
       int n =sc.nextInt();
      long sum=0;
        for (int i =1; i <=n ; i++) {
            sum+=div(i)*i;
        }
        System.out.println(sum);
///////////////////////////////////////////////////////////////////////
    }

}