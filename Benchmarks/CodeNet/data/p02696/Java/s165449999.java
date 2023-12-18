import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long ans = 0;

        if (N < B - 1) {
            ans = ((A * N) / B) - A * (N / B);
        } else {
            ans = ((A * (B - 1)) / B) - A * ((B - 1) / B);
        }

        System.out.print(ans);
    }
}