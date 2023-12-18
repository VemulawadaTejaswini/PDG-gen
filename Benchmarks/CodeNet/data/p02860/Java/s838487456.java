import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        if (S.length() % 2 == 1) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < S.length() / 2; i++) {
            if (S.charAt(i) != S.charAt((S.length() / 2) + i)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
