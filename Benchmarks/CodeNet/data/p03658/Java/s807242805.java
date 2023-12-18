import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] d = new Integer[n];
		for(int i = 0 ; i < n ; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d, Comparator.reverseOrder());
		int ans = 0;
		for(int i = 0 ; i < k ; i++) {
			ans += d[i];
		}
		System.out.println(ans);
		sc.close();

	}

}
