import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
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
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        int n = obj.nextInt(),u = obj.nextInt();
        double arr[] = new double[n];
        for(int i=0;i<n;i++)
        {
            double k = obj.nextDouble();
            arr[i] = (k*(k+1)/2)/k;
        }
        double max = Double.MIN_VALUE;
        for(int i=0;i<=n-u;i++)
        {
            double l = 0;
            for(int j=i;j<=i+u-1;j++)
                l+=arr[j];
            if(l>max)
                max = l;
        }
        System.out.printf("%.12f",max);
    }
}
