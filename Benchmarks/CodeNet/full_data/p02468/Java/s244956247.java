import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            line = br.readLine();
            st = new StringTokenizer(line);
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            for (int i = 1; i < n; i++) {
                m = m * m;
                if (m >= 1000000007) {
                    m = m % 1000000007;
                }
            }
            System.out.println(m);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}