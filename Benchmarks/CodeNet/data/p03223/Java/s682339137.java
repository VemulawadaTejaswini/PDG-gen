
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		long ans = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		if(n%2 == 0) {
			for(int i = 0; i < n/2-1; i++) {
				ans -= 2*a[i];
			}
			ans -= a[n/2-1];
			ans += a[n/2];
			for(int i = n/2+1; i < n; i++) {
				ans += 2*a[i];
			}
		}else if(n >= 5){
			int tmp1 = 0;
			int tmp2 = 0;
			for(int i = 0; i < n/2 -1; i++) {
				tmp1 -= 2*a[i];
			}
			tmp1 -= a[n/2 - 1];
			tmp1 -= a[n/2];
			for(int i = n/2+1; i < n; i++) {
				tmp1+= 2*a[i];
			}
			for(int i = 0; i < n/2; i++) {
				tmp2 -= 2*a[i];
			}
			tmp2 -= a[n/2 + 1];
			tmp2 -= a[n/2];
			for(int i = n/2+2; i < n; i++) {
				tmp2+= 2*a[i];
			}
			ans = Math.max(tmp1, tmp2);
		}else {
			int tmp1 = a[2]*2 - a[1] - a[0];
			int tmp2 = a[2] + a[1] - a[0]*2;
			ans = Math.max(tmp1, tmp2);
			
		}
		System.out.println(ans);
		sc.close();
	}
}
