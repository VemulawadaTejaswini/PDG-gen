import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,n;
        a = Long.parseLong(scanner.next());
        b = Long.parseLong(scanner.next());
        n = Long.parseLong(scanner.next());
        long current,max = -1;
        int count = 0;
        for (long x = n; x >= 0; x--) {
            current = a * x / b - a * (x / b);
            if (max <= current) {
                max = current;
            } else {
                count++;
                if (count >= 10) {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}