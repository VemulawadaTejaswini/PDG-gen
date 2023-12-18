import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        scan.close();
        int i;
        int t = n*2;
        int r = t-1;

        if (x == 1 || x == r) {
            System.out.println("No");
        } else if (n == x) {
            System.out.println("Yes");
            for (i = 1; i < t; i++) {
                System.out.println(i);
            }
        } else if (n > x) {
            System.out.println("Yes");
            for (i = 2; i < n; i++) {
                if (i != x) {
                    System.out.println(i);
                }
            }
            System.out.println(n + 1);
            System.out.println(1);
            System.out.println(x);
            System.out.println(r);
            for (i = n + 2; i < r; i++) {
                System.out.println(i);
            }
            System.out.println(n);
        } else {
            System.out.println("Yes");
            for (i = 2; i < n; i++) {
                System.out.println(i);

            }
            System.out.println(1);
            System.out.println(x);
            System.out.println(r);
            for (i = n + 1; i < r; i++) {
                if (i != x) {
                    System.out.println(i);
                }
            }
            System.out.println(n);
        }
    }
}
