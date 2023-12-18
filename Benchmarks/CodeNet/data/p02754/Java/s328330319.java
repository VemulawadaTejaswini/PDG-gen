import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();//b
        long B = scanner.nextLong();//r
        long sum = A+B;
        if(sum == 0) {
            System.out.println(0);
            return;
        }
        long a = N / sum;
        long sumA = a * A;
        long c = Math.min(N % sum, A);
        System.out.println(sumA + c);
    }
}
