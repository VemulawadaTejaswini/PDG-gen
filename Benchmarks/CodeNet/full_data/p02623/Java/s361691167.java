import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            st = null;
            return str;
        }

        public void resetST() {
            st = null;
        }
    }

    public static void main(String[] args) {
        FastReader sc =new FastReader();
        int n= sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n+m];
        int k= sc.nextInt();
        for(int i=0;i<n+m;i++)
        {
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        int count = 0;
        long sum=0;
        for(int i=0;i<n+m;i++)
        {
            sum+=a[i];
            if(sum<=k)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
	// write your code here
    }
}
