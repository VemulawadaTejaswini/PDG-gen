import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveD();
    }

    private void solveD() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {

            char[] arr = br.readLine().toCharArray();
            int[] result = new int[arr.length];

            int nl = -1;
            int nr = -1;
            for (int i = 0; i < arr.length; i++) {
                char directrion = arr[i];

                if (directrion == 'R') {
                    if (i > nl) {
                        for (int j = i; j < arr.length; j++) {
                            if (arr[j] == 'L') {
                                nl = j;
                                break;
                            }

                        }
                    }

                    boolean isOdd = (nl - i) % 2 == 0;
                    result[isOdd ? nl : nl - 1] += 1;
                    continue;
                } else {

                    if (i > nr) {
                        for (int j = i; j >= 0; j--) {
                            if (arr[j] == 'R') {
                                nr = j;
                                break;
                            }
                        }
                    }

                    boolean isOdd = (nr - i) % 2 == 0;
                    if (isOdd) {
                        result[nr] += 1;
                    } else {
                        result[nr + 1] += 1;
                    }
                }

            }

            for (int i = 0; i < result.length - 1; i++) {
                pw.print(result[i] + " ");
            }
            pw.println(result[result.length - 1]);
            pw.flush();
        } catch (IOException e) {

        }
    }
}
