import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String str = s.next();
        char[] b = str.toCharArray();
        int[] a = new int[b.length];
        for (int i = 0; i < N; i++) {
            a[i] = b[i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                a[j] = Math.abs(a[j] - a[j + 1]);
            }
        }
        System.out.print(a[0]);
    }
}