import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] d = new int[n];
		int ans = 0;

		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		Arrays.sort(d);
		if(d.length%2==0) {
			ans = d[d.length/2]-d[d.length/2-1];
		}

		System.out.println(ans);
	}
}
