import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] x = new int[n];

		for(int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for(int i = 1; i <= 100; i++) {
			int temp =0;
			for ( int j = 0; j < n; j++) {
				temp += (int)Math.pow((x[j] - i), 2);
			}
			if(temp < ans)
				ans = temp;
		}
		System.out.println(ans);
	}
}