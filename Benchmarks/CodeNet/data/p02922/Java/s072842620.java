import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 1) {
            System.out.println(0);
            return;
        }
        if (a >= b) {
            System.out.println(1);
            return;
        }
        int c = 0;
        int d = 0;
        while (c < b) {
            if (c == 0) {
                c += a;
                d++;
            } else {
                c += a - 1;
                d++;
            }

            }
        System.out.println(d);
    }

}
