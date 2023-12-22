import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last = -1;
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            if (cur < last) {
                ans += (last - cur);
            } else {
                last = cur;
            }
        }
        System.out.println(ans);
    }
}
