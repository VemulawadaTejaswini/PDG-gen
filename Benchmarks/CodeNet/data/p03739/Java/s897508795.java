import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		sc.close();
		long ans = Long.MAX_VALUE / 2;
		// + - + - + - 
		long res = 0;
		long t = 0;
		for(int i=0;i<n;i++) {
			t += a[i];
			if(i % 2 == 0) {
				if(t > 0) continue;
				res += 1 - t;
				t = 1;
			}
			else {
				if(t < 0) continue;
				res += t + 1;
				t = -1;
			}
		}
		ans = Math.min(ans, res);
		res = 0;
		t = 0;
		for(int i=0;i<n;i++) {
			t += a[i];
			if(i % 2 == 1) {
				if(t > 0) continue;
				res += 1 - t;
				t = 1;
			}
			else {
				if(t < 0) continue;
				res += t + 1;
				t = -1;
			}
		}		
		ans = Math.min(ans, res);
		System.out.println(ans);
	}
}