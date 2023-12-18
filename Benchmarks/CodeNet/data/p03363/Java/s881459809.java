import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N < 1) {
            System.out.println(0);
            return;
        }
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        
        Main m = new Main();
        int ret = m.solve(nums);
        System.out.println(ret);
    }

    int solve(int[] nums) {
        int N = nums.length;
        Map<Long, Integer> map = new HashMap<>();
        int total = 0;
        long acc = 0;

        for (int i = 0; i < N; i++) {
            acc += (long)nums[i];
            if (acc == 0) total += 1;
            Integer count = map.get(acc);
            if (count == null) {
                map.put(acc, 1);
            } else {
                total += count;
                map.put(acc, count+1);
            }
        }

        return total;
    }
}
