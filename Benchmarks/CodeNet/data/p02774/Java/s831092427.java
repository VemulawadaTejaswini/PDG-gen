import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
        int n = obj.nextInt(),k = obj.nextInt(); long arr[] = new long[n+1];
        for(int i=1;i<=n;i++) arr[i] = obj.nextLong();
        int count=0;
        ArrayList<Long> data = new ArrayList<>();
        for(int i=count+1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
                data.add(arr[i]*arr[j]);
            count++;
        }
        Collections.sort(data);
        System.out.println(data.get(k-1));
    }
}

