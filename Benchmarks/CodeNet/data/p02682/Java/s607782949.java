import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int total = 0;
        total += a;
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
        total -= k;
        System.out.println(total);
    }
}