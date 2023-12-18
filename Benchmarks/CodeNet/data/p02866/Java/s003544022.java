import java.util.Scanner;

public class Main {
	final static int mod = 998244353;
	final static int INF = 100000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			if (i != 0 && d[i] == 0) flag = true;
		}

		if(d[0] != 0) {
			System.out.println(0);
		}else if(flag) {
			System.out.println(0);
		}else {
			long[] num = new long[INF];
			num[0] = 0;
			int max = 1;
			long count = 1;
			for (int i = 1; i < n; i++) {
				num[d[i]]++;
				max = Math.max(max,d[i]);
			}
			for (int i = 1; i < max; i++) {
				for(int j = 1; j <= num[i+1]; j++) {
					long mul = num[i]%mod;
					count = count * mul;
					count %= mod;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}