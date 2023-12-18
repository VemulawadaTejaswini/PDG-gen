import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if(B % A == 0) {
            System.out.println(A + B);
            return;
        }
        System.out.println(B - A);

    }
}