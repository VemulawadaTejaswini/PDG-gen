
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = -1 * in.nextInt();

        }

        System.out.println(lis(a));

    }

    static int lis(int[] nums) {//nlog(n)
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = lowerBound(arr, nums[i]);
            arr[index] = nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (arr[i] != Integer.MAX_VALUE) {
                return i + 1;
            }
        }
        return 0;
    }//lis

    static int lowerBound(int[] arr, int value) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (value <= arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }//LB

}
