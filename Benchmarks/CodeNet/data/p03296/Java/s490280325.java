import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        int n;
        int [] a;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
        }
        int prev = a[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == prev) {
                count++;
                if (i + 1 < n && a[i + 1] == a[i]) i++;
            } else {
                prev = a[i];
            }
        }
        System.out.println(count);
    }
}
