import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.valueOf(sc.next());

        for (int i = 0; i < count; i++) {
            int[] nums = new int[]{
                    Integer.valueOf(sc.next()),
                    Integer.valueOf(sc.next()),
                    Integer.valueOf(sc.next())
            };
            Arrays.sort(nums);
            System.out.println(isRightTriangle(nums) ? "YES" : "NO");
        }
    }

    public static boolean isRightTriangle(int[] nums) {
        return (nums[0] * nums[0]) + (nums[1] * nums[1]) == (nums[2] * nums[2]);
    }
}