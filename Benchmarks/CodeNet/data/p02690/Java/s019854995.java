import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long X = in.nextLong();
        HashMap<Long, Long> nums = new HashMap<>();
        for (long i = -100; i <= 100; i++) {
            nums.put((long)Math.pow(i, 5), i);
        }
        for (long i : nums.keySet()) {
            if (nums.containsKey(i - X)) {
                System.out.println(nums.get(i) + " " + nums.get(i - X));
                break;
            }
        }
    }
}
