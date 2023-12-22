import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        String[] ps = sc.nextLine().split(" ");

        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ps[i]);
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int j = 0; j < k; j++) {
            sum += arr[j];
        }
        System.out.println(sum);
    }
}
