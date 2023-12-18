import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        if(S.length() + 1 != T.length()) {
            System.out.println("No");
            return;
        }
        if(S.equals(T.substring(0, S.length()))) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");


    }
}
