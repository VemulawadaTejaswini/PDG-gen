import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (Arrays.asList(a).contains(input)) {
				sum++;
			}
			a[i] = input;

		}

		if(sum > 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
	}
}
