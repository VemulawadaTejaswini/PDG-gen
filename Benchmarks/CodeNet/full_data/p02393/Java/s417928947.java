import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITP1_2_C(args);
    }

    public static void ITP1_2_C(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(String.format("%d %d %d", a, b, c));
    }
}

