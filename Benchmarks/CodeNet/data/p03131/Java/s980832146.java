import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();


        long y = 0;
        if (b - a <= 2) {
            System.out.println(k + 1);
            return;
        }
        if (k - a <= 1) {
            System.out.println(k + 1);
            return;
        }
        long c = a;
        long change = (k - a + 1) / 2;
        if ((k - a + 1) % 2 == 0) {
            c += change * (b - a);
        } else {
            c += change * (b - a) + 1  ;
        }

        System.out.println(c);
    }

}
