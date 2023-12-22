import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,n;
        a = Long.parseLong(scanner.next());
        b = Long.parseLong(scanner.next());
        n = Long.parseLong(scanner.next());
        System.out.println((a * n / b) - a * (n / b));
    }
}