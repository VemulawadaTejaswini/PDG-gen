import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int H1 = fastReader.nextInt();
        int M1 = fastReader.nextInt();
        int H2 = fastReader.nextInt();
        int M2 = fastReader.nextInt();
        int K = fastReader.nextInt();
        int minutes = (H2 * 60 + M2) - (H1 * 60 + M1);
        System.out.println(minutes - K);
    }


}