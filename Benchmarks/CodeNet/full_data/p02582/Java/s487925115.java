
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        int count = 0;

        for (int i = 0 ; i < S.length ; i++) {
            if (S[i] == 'R') {
                count++;
            } else {
                count = 0;
            }
        }

        System.out.println(count);

    }
}
