import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] ary = new Integer[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		Arrays.sort(ary, Collections.reverseOrder());
		int sum = Arrays.stream(ary).reduce(0, Integer::sum);
		String ans = (sum > 2 * ary[0]) ? "Yes" : "No";
		System.out.println(ans);
	}
}
