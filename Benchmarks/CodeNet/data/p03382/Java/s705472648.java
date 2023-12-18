import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		int[] values = new int[num];
		String[] tokens = in.nextLine().split(" ");
		for (int i = 0; i < num; ++i) {
			values[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(values);
		System.out.println(values[values.length - 1] + " " + solve(values));
		in.close();
	}

	public static int solve(int[] values) {
		if(values.length <= 2 ) {
			return values[0];
		}
		int total = values[values.length - 1];
		double medium = (double) total / 2.0;
		double diff = Double.MAX_VALUE;
		int result = -1;
		for (int i = 0; i < values.length - 2; ++i) {
			if (diff > Math.abs(medium - (double) values[i])) {
				diff = Math.abs(medium - (double) values[i]);
				result = values[i];
			}
		}
		return result;
	}
}
