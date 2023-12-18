import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a[] = new long[(int)n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long sum = a[0];
		if(sum == 0) {
			boolean flag = true;
			int cnt = 1;
			while(flag) {
				if(a[cnt] > 0) {
					if(cnt % 2 == 0) {
						sum = 1;
					} else {
						sum = -1;
					}
					flag = false;
				} else if(a[cnt] < 0) {
					if(cnt % 2 == 0) {
						sum = -1;
					} else {
						sum = 1;
					}
					flag = false;
				}
				cnt++;
			}
		}
		
		long ans = 0;
		for(int i = 1; i < n; i++) {
			if(sum > 0) {
				if(sum + a[i] >= 0) {
					ans += sum + a[i] + 1;
					sum = -1;
				} else {
					sum = sum + a[i];
				}
			} else {
				if(sum + a[i] <= 0) {
					ans += Math.abs(a[i] + sum) + 1;
					sum = 1;
				} else {
					sum = sum + a[i];
				}
			}
		}
		System.out.println(ans);
	}
}
