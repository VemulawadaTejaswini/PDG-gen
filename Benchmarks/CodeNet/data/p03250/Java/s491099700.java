import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b) {
            if (b <= c) {
                System.out.println(a + b + c * 10);
            } else {
                System.out.println(a + b * 10 + c);
            }
        } else {
            if (a <= c) {
                System.out.println(a + b + c * 10);
            } else {
                System.out.println(a * 10 + b + c);
            }
        }

    }
}





