import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,n;
        a = Long.parseLong(scanner.next());
        b = Long.parseLong(scanner.next());
        n = Long.parseLong(scanner.next());
        long current,max = -1;
        for (long x = n; x >= 0; x--) {
            current = a * x / b - a * (x / b);
            if (max <= current) {
                max = current;
            }
        }
        System.out.println(max);
    }
}