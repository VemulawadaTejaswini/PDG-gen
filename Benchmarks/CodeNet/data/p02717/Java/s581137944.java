import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        int temp = nums[0];

        nums[0] = nums[1];
        nums[1] = temp;

        temp = nums[0];

        nums[0] = nums[2];
        nums[2] = temp;

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);

    }
}
