import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,n;
        a = Long.parseLong(scanner.next());
        b = Long.parseLong(scanner.next());
        n = Long.parseLong(scanner.next());
        double a2 = (double) a;
        double b2 = (double) b;
        double n2 = (double) n;
        System.out.println((long) (Math.floor(a2 * n2 / b2) - a2 * Math.floor(n2 / b2)));
    }
}