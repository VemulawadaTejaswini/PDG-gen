import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();

        for(int i = 0; i < N; i++) {
            System.out.print(S.charAt(i));
            System.out.print(T.charAt(i));
        }
    }
}
