import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
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
    public static void main(String [] args) {
      //  int T = sc.nextInt();while (T--!=0)
        {
            solve();
        }
    }
    public static void solve(){
///////////////////////////////////////////////////////////////////////////////////////////
          int n = sc.nextInt();
          int k = sc.nextInt();
          int [] arr = new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        long sum=0;
        for (int i = 0; i <k ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
////////////////////////////////////////////////////////////////////////////////////////////
    }

}