import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = Long.parseLong(scanner.nextLine());
        long total = 0;
        for (long i = 1; i <= num; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}