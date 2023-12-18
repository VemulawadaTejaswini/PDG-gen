import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] taka = new long[n];
		long[] aowu = new long[n];

		for (int i = 0; i < n; i++) {
			taka[i] = sc.nextLong();
			aowu[i] = sc.nextLong();
		}
		Arrays.sort(taka);
		Arrays.sort(aowu);
		long takasum = 0;
		long aowusum = 0;
		if(taka[0]==taka[n-1] && aowu[0]==aowu[n-1]) {
			if(n%2==0) {
				System.out.println((n/2)*taka[0] - (n/2)*aowu[0]);
				return;
			}else {
				System.out.println((n/2 + 1)*taka[0] - (n/2)*aowu[0]);
				return;
			}
		}
		for (int i = n - 1; i >= 0; i = i - 2) {
			takasum += taka[i];
		}
		for (int j = n - 2; j > 0; j = j - 1) {
			aowusum += aowu[j];
		}
		System.out.println(takasum - aowusum);
	}
}
