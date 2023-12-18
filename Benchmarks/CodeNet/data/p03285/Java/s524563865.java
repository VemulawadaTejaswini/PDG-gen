import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = scanner.nextInt();

        String res = "NO";
        if (N % 4 == 0) res = "YES";
        else if (N % 7 == 0) res = "YES";
        else {
            for (int i = 1; i <= N/7; i++) {
                if ((N - 7 * i) % 4 == 0) {
                    res = "YES";
                    break;
                }
            }
        }

        bufferedWriter.write(res);

        bufferedWriter.close();
        scanner.close();
    }
}