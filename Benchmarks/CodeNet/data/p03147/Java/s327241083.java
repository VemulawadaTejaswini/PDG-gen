
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(garden(nums));
    }

   private static int garden(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
               count = count + (nums[i] - nums[i +1]);
            }
        }
        return count + nums[nums.length - 1];
    }

}