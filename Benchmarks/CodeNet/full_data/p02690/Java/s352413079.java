import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            long x = reader.nextLong();
            long a, b;
            a = b = 0;
            boolean found = false;

            for (int i = -1000; i <= 1000; i++) {
                long aValue = (long) Math.pow((long) i, (long) 5);
                for (int j = -1000; j <= 1000; j++) {
                    long bValue = (long) Math.pow((long) j, (long) 5);
                    if (aValue - bValue == x) {
                        a = i;
                        b = j;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            log.write(a + " " + b + "\n");
            log.flush();
            log.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
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

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}