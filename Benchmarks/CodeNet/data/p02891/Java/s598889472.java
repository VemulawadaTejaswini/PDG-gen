import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = reader.readLine();
            long K = Long.parseLong(reader.readLine());

            int a = 0;
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(i - 1)) {
                    a++;
                    i++;
                }
            }

            boolean b = false;
            if (S.charAt(S.length() - 1) == S.charAt(0)) {
                if (S.charAt(S.length() - 1) != S.charAt(S.length() - 2)) {
                    b = true;
                }
            }

            long ans = a * K;
            if (b) {
                ans += K - 1;
            }

            System.out.println(ans);
        }
    }

}
