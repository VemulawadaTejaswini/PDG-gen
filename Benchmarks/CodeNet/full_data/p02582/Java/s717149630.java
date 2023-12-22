import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        // length=3前提なのでfor回さない
        if (S[1] == 'S') {
            if (S[0] == 'R' || S[2] == 'R') {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            if (S[0] == 'R' && S[2] == 'R') {
                System.out.println(3);
                return;
            }
            if (S[0] == 'R' || S[2] == 'R') {
                System.out.println(2);
                return;
            }
        }
    }
}
