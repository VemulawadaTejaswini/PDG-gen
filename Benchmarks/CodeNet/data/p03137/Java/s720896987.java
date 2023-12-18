import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        if (n >= m) {
            System.out.println(0);
            return;
        }
        int[] ary = new int[m];
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
        }
        int[] diff = new int[m - 1];
        Arrays.sort(ary);
        for (int i = 0; i < m - 1; i++) {
            diff[i] = ary[i + 1] - ary[i];
        }
        Arrays.sort(diff);
        int ans = 0;
        for (int i = 0; i < m - (n - 1) - 1; i++) {
            ans += diff[i];
        }
        System.out.println(ans);
    }
}