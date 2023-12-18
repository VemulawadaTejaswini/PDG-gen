import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        int end = Math.min(b, d);

        if (end - c > 0) {
            System.out.println(end - c);
        } else {
            System.out.println(0);
        }
    }
}