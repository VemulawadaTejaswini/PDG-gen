import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader input = new FastReader();
        int n = input.nextInt();
        long[] arr = new long[n];
        for(int i = 0;i < n;i++){
            arr[i] = input.nextLong();
        }
        Arrays.sort(arr);

        BigInteger a1 = BigInteger.valueOf(arr[0]);
        BigInteger k = new BigInteger("1000000000000000000");

        for(int i = 1;i < n;i++){
            BigInteger b1 = BigInteger.valueOf(arr[i]);
            a1 = a1.multiply(b1);
            if(a1.compareTo(k) == 1){

                System.out.println(-1);
                return;
            }
        }
        System.out.println(a1);
    }
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
                catch (IOException e)
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
}
