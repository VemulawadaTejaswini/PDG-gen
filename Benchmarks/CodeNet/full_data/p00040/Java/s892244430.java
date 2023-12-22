import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            boolean[] isLower = new boolean[line.length];
            for (int j = 0; j < isLower.length; j++) {
                isLower[j] = (line[j] != ' ');
            }

            int alpha = 1;

            decrypt: while (true) {
                for (int beta = 1; beta <= 25; beta++) {
                    for (int j = 0; j < line.length; j++) {
                        if (isLower[j]) {
                            sb.append((char) ((alpha * (line[j] - 'a') + beta) % 26 + 'a'));
                        } else {
                            sb.append(' ');
                        }
                    }
                    if (sb.toString().indexOf("this") + sb.toString().indexOf("that") != -2) {
                        break decrypt;
                    }
                    sb = new StringBuilder();
                }

                alpha += ((alpha + 2) % 13 == 0) ? 4 : 2;
            }

            System.out.println(sb.toString());
            sb = new StringBuilder();
        }

    }
}
