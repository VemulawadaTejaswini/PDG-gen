import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long ans = 0;
		long mod = 1000000000+7;
		long count1 = 0;
		long count0 = 0;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		for (int i = 0; i < 60; i++) {
			count1 = 0;
			count0 = 0;
			flag = true;
			for (int j = 0; j < n; j++) {
				long b = a[j];
				if(b != 0) flag = false;
				if((b&1) == 1) count1++;
				else count0++;
				a[j] = b>>1;
			}
			ans += (count0*count1)*(Math.pow(2,i)%mod);
			if(flag) break;
		}

		System.out.println(ans%mod);
		sc.close();
	}
}