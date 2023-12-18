import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer c[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a += c[i];
            } else {
                b += c[i];
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println(a - b);
    }
}