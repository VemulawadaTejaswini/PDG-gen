import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(sum(sort(scanInt(), scanInt(), scanInt()), scanInt()));
	}
	
	private static int sum(int[] nums, int K) {
		int m = nums[nums.length - 1];
		int[] nnn = Arrays.copyOfRange(nums, 0, nums.length - 1);
		int t = m;
		for (int i = 0; i < K; ++i) {
			t *= 2;
		}
		for (int n : nnn) {
			t += n;
		}
		return t;
	}
	
	private static int[] sort(int... a) {
		Arrays.sort(a);
		return a;
	}
	
	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
