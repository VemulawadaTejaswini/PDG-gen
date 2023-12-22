import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 1; i < N; i++) {

            if (nums[i] < nums[i - 1]) {
                int b = nums[i - 1] - nums[i];
                sum += b;
                nums[i] = nums[i] + b;
            }
        }

        System.out.println(sum);

    }
}