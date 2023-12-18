import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        Arrays.sort(a);

        int ans = 0;
        if ((a[1] - a[0]) % 2 == 1) {
            a[0]++;
            a[2]++;
            ans++;
        }

        ans += (a[1] - a[0]) / 2;
        ans += a[2] - a[1];
        System.out.println(ans);
    }
}