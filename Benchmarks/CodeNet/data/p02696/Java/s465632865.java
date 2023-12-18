import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long answer = 0;
        for (long i = 0; i <= n; i++) {
            long kari = ((a * i) / b) - a * (i / b);
            if (answer <= kari) {
                answer = kari;
            }
        }

        System.out.print(answer);
    }
}