import java.util.*;

public class Main {
	private static long solve(int in) {
		long result = 0;
		while (in -- > 0) {
			if (in % 3 != 0 && in % 5 != 0) {
				result += in;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		System.out.println(solve(in));
	}
}
