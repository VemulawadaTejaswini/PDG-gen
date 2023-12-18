import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long count = 0;
        for (long i = k; i < n + 2; i++){
            long min = (i * (i - 1)) / 2;
            long max = (n * i) + i - ((i * (i + 1)) / 2);
            count += max - min + 1;
        }
        System.out.println((int) (count % (Math.pow(10, 9) + 7)));
        System.out.println(Math.pow(10, 9) + 7);
    }
}
