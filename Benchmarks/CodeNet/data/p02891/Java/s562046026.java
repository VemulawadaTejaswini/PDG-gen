import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = reader.readLine();
            int K = Integer.parseInt(reader.readLine());

            long a = 0;
            char[] C = S.toCharArray();
            for (int i = 1; i < C.length; i++) {
                if (C[i] == C[i - 1]) {
                    a++;
                    C[i] = (char) (C[i] - 32);
                }
            }

            if (K == 1) {
                System.out.println(a * K);
            } else {
                long b = 0;
                C = (S + S).toCharArray();
                for (int i = 1; i < C.length; i++) {
                    if (C[i] == C[i - 1]) {
                        b++;
                        C[i] = (char) (C[i] - 32);
                    }
                }

                long ans = b * (K / 2) + a * (K % 2);

                if (C[C.length - 1] == C[0]) {
                    ans += K / 2 - 1;
                }

                System.out.println(ans);
            }
        }
    }

}
