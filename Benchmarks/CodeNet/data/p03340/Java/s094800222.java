
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
		int l = 1;
		int r = 1;
		while(l < n + 1) {
			long tmp = 0;
			while(r < n + 1 && (tmp ^ list[r]) == tmp + list[r]) {
				tmp += list[r];
				r++;
			}
			ans += r - l;
			tmp -= list[l];
			l++;
		}
		System.out.println(ans);
	}

}
