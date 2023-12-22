
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[4];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        a[3] = scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();
        int x = 0;
        java.util.Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            x = a[1] + a[2] + a[3];
        }
        if (r < t) {
            x = x + t;
        } else {
            x = x + r;
        }
        System.out.println(x);
    }

}

