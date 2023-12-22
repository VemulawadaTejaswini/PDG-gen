import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextInt();
        long total = 0;
        total += a*1;
        k -= a;
        if(k <= 0) {
            System.out.println(total);
            return;
        }
        k -= b;
        if(k <= 0) {
            System.out.println(total);
            return;
        }
        total += (k * -1);
        System.out.println(total);
    }
}