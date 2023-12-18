import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;
import java.util.TreeSet;
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
        long a = obj.nextLong(),b = obj.nextLong();
        if( b==1 || a==b) {System.out.println(0); return;}
        else if(a==1||a%2!=0 && b%2==0) {System.out.println(1); return;}
        TreeSet<Long> set = new TreeSet<>();
        while (!set.contains(a))
        {
            set.add(a);
            a = Math.abs(a-b);
        }
        System.out.println(set.first());
    }
}
