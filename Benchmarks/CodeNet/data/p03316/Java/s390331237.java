import java.util.Scanner;

public class Main {
    static int N;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int n = N;
        int sum = 0;

        while (0 < N) {
            sum += N % 10;
            N /= 10;
        }

        if(n % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }


    public static void main(String args[]) {
        init();
    }
}
