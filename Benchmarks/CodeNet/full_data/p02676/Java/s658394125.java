import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();
        if(S.length() > K) {
            S = S.substring(0,K) + "...";

        }
        System.out.println(S);
    }
}