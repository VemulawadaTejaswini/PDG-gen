import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        long d = stdIn.nextLong();
        long count = 0;
        for (long i = a; i <= b; i++) {
            if (i % c != 0) {
                if (i % d != 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
