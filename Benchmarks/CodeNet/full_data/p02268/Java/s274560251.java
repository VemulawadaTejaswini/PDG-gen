import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = in.nextInt();
        int numx[] = new int[in.nextInt()];
        for (int i = 0; i < numx.length; i++)
            numx[i] = in.nextInt();
        in.close();

        int low = 0;
        int high = nums.length - 1;
        int counter = 0;

        for (int x = 0; x < numx.length; x++)
            counter += binarySearch(nums, low, high, numx[x]);
        System.out.println(counter);
    }
        public static int binarySearch(int arr[], int low, int high, int x) {
            int mid = low + (high - low) / 2;
            if (high < low)
                return 0;
            if (x == arr[mid])
                return 1;
            if (x < arr[mid])
                return binarySearch(arr, low, mid - 1, x);
            return binarySearch(arr, mid + 1, high, x);
        }
}

