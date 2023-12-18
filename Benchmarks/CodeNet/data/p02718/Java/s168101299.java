import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Integer[] nums = new Integer[N];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = scanner.nextInt();
            nums[i] = a;
            sum += a;
        }
        scanner.close();

        double limit = sum / (4.0 * M);

        Arrays.sort(nums, Collections.reverseOrder());

        if (nums[M - 1] < limit) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}
