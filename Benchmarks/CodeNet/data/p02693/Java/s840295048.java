import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for(int i = A; i <= B; i++) {
            if(i % K == 0) {
                System.out.println("OK");
                return;
            }
        }


        System.out.println("NG");
    }
}