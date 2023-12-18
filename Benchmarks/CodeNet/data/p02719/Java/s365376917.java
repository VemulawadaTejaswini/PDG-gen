import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();

        long answer = N - ((N / K) * K);
        if (answer != 0) {
            long check = answer - K;
            if (check < 0) {
                check *= -1;
            }
            if (check < answer) {
                answer = check;
            }
        }
        System.out.println(answer);
    }
}
