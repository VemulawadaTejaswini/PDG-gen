import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max,a[i]);
        }
        int min = 10000;
        for (int i = 0; i <= max; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += Math.abs(a[j] - i - j - 1);                
            }
            min = Math.min(tmp,min);
        }
        System.out.println(min);
    }
}
