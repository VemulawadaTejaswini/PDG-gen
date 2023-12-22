import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int max = 0;
        int currentMax = 0;

        if (a == k && b == 0 && c == 0) {
            max = a;
        } else {
            for (int j = 0; j <= a; j++) {
                for (int l = 0; l <= b; l++) {
                    for (int m = 0; m <= c; m++) {
                        currentMax = j + (-1 * m);
                        if (currentMax > max && (j + l + m) == k) {
                            max = currentMax;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}