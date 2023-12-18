import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    PrintWriter out = new PrintWriter(System.out);

    public void run() {
    	Scanner sc = new Scanner(System.in);
    	int n, k;

    	n = sc.nextInt();
    	k = sc.nextInt();

    	int[] input = new int[n];
    	for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}

//    	for (int i : input) {
//			out.println(i);
//		}
//    	int[] input = {5,1,3,2,4,1,1,2,3,4};
//    	int a = 3;
    	Integer[] nums = new Integer[200100];
    	Arrays.fill(nums, 0);
    	for (int i : input) {
			nums[i]++;
		}

    	Arrays.sort(nums, Comparator.reverseOrder());


    	int count = 0;
    	for (int i = k; i < nums.length; i++) {
			count += nums[i];
		}
    	out.println(count);
        out.flush();
    }

    public static void main(String[] args) {
        new Main().run();
    }

}