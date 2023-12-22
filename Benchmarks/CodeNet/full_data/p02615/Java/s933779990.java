import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            long tmp2 = (i + 1) / 2;
            long tmp = a[n - 1 - ((i + 1) / 2)];
            ans += tmp;
        }
        System.out.println(ans);
    }
}
