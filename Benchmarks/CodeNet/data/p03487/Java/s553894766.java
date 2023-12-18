import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        int target = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            target = a[i];
            while (target == a[i]) {
                count++;
                i++;
                if (i == n)
                    break;
            }
            i--;
            if (count < target) {
                ans += count;
            } else {
                ans += count - target;
            }
            count = 0;
        }
        System.out.println(ans);
    }
}