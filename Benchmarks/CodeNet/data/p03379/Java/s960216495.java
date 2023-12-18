import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] nums = new Integer[n];
		for (int i = 0 ; i < n ; i++) {
			nums[n] = sc.nextInt();
		}

		for (int i = 0 ; i < n ; i++) {
			ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(nums));
			num.remove(i);
			Collections.sort(num, Comparator.reverseOrder());
			System.out.println(num.get(n/2-1));
		}
	}
}
