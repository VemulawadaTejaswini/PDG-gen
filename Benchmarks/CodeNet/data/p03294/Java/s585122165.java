import java.util.Scanner;

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
		int result = 0;
		for (int i = 0; i < n; ++i) {
			result += a[i] - 1;
		}

		System.out.println(result);
	}
}
