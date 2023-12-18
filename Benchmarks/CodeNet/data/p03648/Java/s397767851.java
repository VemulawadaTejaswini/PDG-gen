import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        
        System.out.println("2");
        
        if((K % 3) == 1) {
            System.out.printf("%d %d%n", K + 1, 0);
        } else {
            System.out.printf("%d %d%n", K, 1);
        }
    }
}