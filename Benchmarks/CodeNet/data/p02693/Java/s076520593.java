import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        boolean flag = false;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "OK" : "NG");


    }
}
