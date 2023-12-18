import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }
        Arrays.sort(a, Comparator.comparingLong(array -> array[1]));
        long time = 0;
        for (long[] task : a) {
            time += task[0];
            if (time > task[1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}