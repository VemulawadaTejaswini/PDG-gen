import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        trace(nums);
        insertionSort(n, nums);
    }

    private static void insertionSort(int n, int[] nums) {
    	int j, v;
    	for (int i = 1; i < n; i++) {
    		v = nums[i];
    		j = i - 1;
    		while (j >= 0 && nums[j] > v) {
    			nums[j + 1] = nums[j];
    			j--;
    		}
    		nums[j + 1] = v;
    		trace(nums);
    	}
    }

    private static void trace(int[] nums) {
    	System.out.println(Arrays.toString(nums).replaceAll("[\\[\\],]", ""));
    }

}
