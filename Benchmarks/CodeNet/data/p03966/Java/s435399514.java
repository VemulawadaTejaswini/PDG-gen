import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        double numOfT = 1;
        double numOfA = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            long a = sc.nextLong();

            double x = Math.max(Math.ceil((double)numOfT / t), Math.ceil((double)numOfA / a));
            numOfT = t * x;
            numOfA = a * x;
        }
        System.out.println((long)(numOfT + numOfA));
    }
}
