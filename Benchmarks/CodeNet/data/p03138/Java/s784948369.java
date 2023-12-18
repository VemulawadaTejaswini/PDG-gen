import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int K = Integer.parseInt(sc.next());
	static int[] A = new int[N];
	static {
		Arrays.setAll(A, i -> Integer.parseInt(sc.next()));
	}
	public static void main(String[] args) {
		long ans = 0;
		Arrays.sort(A);
		int[] counter = new int[Integer.toBinaryString(A[N-1]).length()];
		for (int i : A) {
			String s = Integer.toBinaryString(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(s.length()-1-j) == '1') {
					counter[j]++;
				}
			}
		}
//		System.out.println(Arrays.toString(counter));
		StringBuilder x = new StringBuilder();
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] > N/2) {
				x.append('0');
			} else {
				x.append('1');
			}
		}
		x.reverse();
		int bitter = Integer.parseInt(x.toString(), 2);
		for (int i = 0; i < A.length; i++) {
			ans += bitter^A[i];
		}
		System.out.println(ans);
	}
}
