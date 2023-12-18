import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = Long.parseLong(scanner.nextLine());
        long K = Long.parseLong(scanner.nextLine());
        System.out.println(numbersWithKNonZeroDigits(K,N));
    }

    private static long numbersWithKNonZeroDigits(long K, long N) {
        int count = 0;
        for (int i = 0; i <= N; i++) {
            int num = i;
            int nonZeroDigits = 0;
            while (num != 0) {
                if (num % 10 != 0) {
                    nonZeroDigits++;
                }
                num = num / 10;
            }
            if (nonZeroDigits == K) {
                count++;
            }
        }
        return count;
    }

}
