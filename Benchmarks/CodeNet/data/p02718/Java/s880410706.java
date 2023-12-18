import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			long total = Arrays.stream(a).sum();
			double border = total / 4d / m;
			long enable = Arrays.stream(a).filter(i -> i >= border).count();
			System.out.println(enable >= m ? "Yes" : "No");
		}

	}

}
