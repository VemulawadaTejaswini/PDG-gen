import java.io.*;

public class Main {
    public static void main(String[] args) {
        long N = (long)Math.pow(10, 10000);
        long n = N;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String buf = in.readLine();
            StringBuilder sb = new StringBuilder(buf);
            for (;n > 0; --n) {
                boolean found = false;
                int len = sb.length();
                for (int i = 0; i < len - 1; ++i) {
                    if (sb.charAt(i) == 'S' && sb.charAt(i + 1) == 'T') {
                        sb.delete(i, i + 2);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    break;
                }
            }
            System.out.println(sb.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}