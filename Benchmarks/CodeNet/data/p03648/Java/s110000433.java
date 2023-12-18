import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        
        System.out.println("2");
        
            long n = K ;
            long x = n / 2;
            long y = K - x + 1;
            System.out.printf("%d %d%n", x, y);
    }
}