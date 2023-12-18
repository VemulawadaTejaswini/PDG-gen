import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int K = array[1];

            String str = reader.readLine();
            boolean[] S = new boolean[N];
            for (int i = 0; i < N; i++) {
                S[i] = str.charAt(i) == 'L';
            }

            int L = 1;
            int R = 0;
            for (int i = N - 1; i > 0; i--) {
                if (S[0] == S[i]) {
                    R = i;
                    break;
                }
            }

            int k;
            for (k = 0; k < K; k++) {
                boolean t = false;
                for (int l = L; l <= R; l++) {
                    if (S[0] != S[l]) {
                        L = l;
                        break;
                    }

                    if (l == R) {
                        t = true;
                    }
                }

                if (t) {
                    break;
                }

                for (int r = R; r >= L; r--) {
                    if (S[0] != S[r]) {
                        R = r;
                        break;
                    }
                }

                int M = (L + R) / 2 - L;
                for (int i = 0; i <= M; i++) {
                    t = S[L + i];
                    S[L + i] = !S[R - i];
                    S[R - i] = !t;
                }

                //                StringBuilder sb = new StringBuilder();
                //                for (int i = 0; i < N; i++) {
                //                    sb.append(S[i] ? 'L' : 'R');
                //                }
                //                System.out.println(sb.toString());
            }

            int fuku = 0;
            if (k == K) {
                for (int i = 0; i < N; i++) {
                    if (S[i] && i > 0 && S[i - 1]) {
                        fuku++;
                    }
                    if (!S[i] && i < N - 1 && !S[i + 1]) {
                        fuku++;
                    }
                }
            } else {
                fuku = N - 1;
            }

            System.out.println(fuku);
        }
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

}
