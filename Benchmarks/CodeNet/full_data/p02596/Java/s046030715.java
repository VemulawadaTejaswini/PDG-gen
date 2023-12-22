import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        int number = Integer.parseInt(line);

        if (number % 2 == 0) {
            System.out.println("-1");
            return;
        }

        long seven = 7;
        int count = 1;
        while (seven > 0) {
            if (seven % number == 0) {
                System.out.println(count);
                return;
            }
            count++;
            seven = seven * 10 + 7;
        }
        System.out.println("-1");
    }
}
