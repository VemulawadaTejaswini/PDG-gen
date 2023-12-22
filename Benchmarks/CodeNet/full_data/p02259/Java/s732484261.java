import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();

        bubbleSort(n, nums);
    }

    private static void bubbleSort(int n, int[] a) {
    	boolean flg = true;
    	int i = 0;
    	int sw = 0;
    	while (flg) {
    		flg = false;
    		for (int j = n - 1; j > i; j--) {
    			if (a[j] < a[j-1]) {
    				int w = a[j];
    				a[j] = a[j-1];
    				a[j-1] = w;
    				sw++;
    				flg = true;
    			}
    		}
    		i++;
    	}
    	trace(a);
    	System.out.println(sw);
    }

    private static void trace(int[] nums) {
    	System.out.println(Arrays.toString(nums).replaceAll("[\\[\\],]", ""));
    }

}
