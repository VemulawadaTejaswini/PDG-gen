import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Integer[] l = new Integer[n];
		
		Arrays.setAll(l, i -> sc.nextInt());
		Arrays.sort(l, (a, b) -> b - a);
		
		int ans = 0;
		for (int i = 0; i < k; i++) {
			ans += (int) l[i];
		}
		
		System.out.println(ans);

		sc.close();
	}

}
