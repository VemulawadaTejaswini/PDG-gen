
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] list = new long[n + 1];
		long[] sum = new long[n + 1];
		sum[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			list[i] = sc.nextLong();
			sum[i] = sum[i - 1] + list[i];
		}
		long ans = 0;
		for(int l = 1; l < n + 1; l++) {
			long tmp = 0;
			for(int r = l; r < n + 1; r++) {
				tmp = tmp ^ list[r];
				if(tmp == sum[r] - sum[l - 1]) {
					ans++;
				} else {
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
