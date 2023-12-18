
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
        int a = obj.nextInt(),b = obj.nextInt();
        int c = obj.nextInt(),k = obj.nextInt();
        int sum = 0;
        while(a--!=0 && k--!=0)
            sum++;
        if(k==0)
        {
            System.out.println(sum);
            return;
        }
        while (b--!=0 && k--!=0);
        if(k==0)
        {
            System.out.println(sum);
            return;
        }
        while (c--!=0 && k--!=0)
            sum--;
        System.out.println(sum);
    }
}
