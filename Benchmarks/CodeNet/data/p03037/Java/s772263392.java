import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i = 0; i < m - 1; i++) {
            int a = sc.nextInt();
            if (min < a) {
                min = a;
            }
            int b = sc.nextInt();
            if (b < max) {
                max = b;
            }
        }

        System.out.println(Math.max((Math.min(n, max) - min + 1), 0));

        sc.close();

    }

}