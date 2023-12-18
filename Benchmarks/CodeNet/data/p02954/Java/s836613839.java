import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = reader.readLine();
            int N = S.length();

            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = 1;
            }

            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'R') {
                    if (S.charAt(i + 1) == 'R') {
                        C[i + 2] += C[i];
                        C[i] = 0;
                    }
                }
            }

            for (int i = N - 1; i >= 0; i--) {
                if (S.charAt(i) == 'L') {
                    if (S.charAt(i - 1) == 'L') {
                        C[i - 2] += C[i];
                        C[i] = 0;
                    }
                }
            }

            StringBuilder ans = new StringBuilder();
            ans.append(C[0]);
            for (int i = 1; i < N; i++) {
                ans.append(" ").append(C[i]);
            }

            System.out.println(ans.toString());
        }
    }

}
