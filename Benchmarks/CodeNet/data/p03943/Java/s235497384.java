import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static final String ex = "56 25 31";
//    private static final String ex = "30 30 100";

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(split[0]);
        nums[1] = Integer.parseInt(split[1]);
        nums[2] = Integer.parseInt(split[2]);

        Arrays.sort(nums);

        if (nums[0] + nums[1] == nums[2]) System.out.println("Yes");
        else System.out.println("No");
    }
}
