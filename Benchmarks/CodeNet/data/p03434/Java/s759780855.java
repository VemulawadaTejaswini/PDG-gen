import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int an[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            an[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (an[j] > an[j + 1]) {
                    int tmp = an[j];
                    an[j] = an[j + 1];
                    an[j + 1] = tmp;
                }
            }
        }
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                alice += an[i];
            } else {
                bob += an[i];
            }
        }

        System.out.println(alice - bob);
        scanner.close();
    }
}
