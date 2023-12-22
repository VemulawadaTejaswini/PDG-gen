import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(String.format("%d %d %d", a, b, c));
        sc.close();
    }
}
