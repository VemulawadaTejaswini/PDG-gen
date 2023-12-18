import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(tokens[i]);
		}
		in.close();

		System.out.println(getVal(a, conv(a) * 2 - 1));
	}

	private static long conv(int[] in) {
		Set<Integer> set = new HashSet<>();
		for (int i : in) {
			set.add(i);
		}
		long result = 1;
		for (Integer i : set) {
			result *= i;
		}
		return result;

	}

	private static long getVal(int[] inputs, long x) {
		long result = 0;
		for (int input : inputs) {
			result += x % input;
		}
		return result;
	}
}