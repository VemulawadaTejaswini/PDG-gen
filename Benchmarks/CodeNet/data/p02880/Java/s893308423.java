import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        String ans = "No";

        for (int i = 1; i <= 9; i++) {
            if (N % i == 0) {
                int a = N / i;
                if (a >= 1 && a <= 9) {
                    ans = "Yes";
                    break;
                }
            }
        }

        System.out.println(ans);

    }

}

