import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] nums = new Integer[N + 1];
        Arrays.fill(nums, 0);
        for (int i = 0; i < N; i++) {
            nums[sc.nextInt()]++;
        }

        Arrays.sort(nums, Comparator.reverseOrder());

        int cnt = 0;
        for (int i = K; i < N + 1; i++) {
            cnt += nums[i];
        }

        out.println(cnt);
    }
}