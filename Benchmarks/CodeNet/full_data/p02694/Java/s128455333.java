
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long num = 100;
        long cnt = 0;

        while (num < x) {
            num *= 1.01;
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}