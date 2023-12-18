import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		int[] b = new int[m];
		Arrays.setAll(b, i -> sc.nextInt());
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				int a = sc.nextInt();
				sum += a * b[j];
			}
			sum += c;
			
			if (sum > 0) cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}


