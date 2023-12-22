import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        long min = 1000000;
        long max = -1000000;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
            sum += nums[i];
        }

        System.out.println(min + " " + max + " " + sum);

        sc.close();
    }
}
