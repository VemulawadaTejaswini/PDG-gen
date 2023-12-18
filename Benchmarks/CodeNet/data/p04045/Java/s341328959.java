
import java.util.Scanner;

public class Main {

	public static boolean like(int d[], int k) {
		for(int i = 0; i < d.length; ++i) {
			if(k == d[i])return false;
		}
		return true;
	}
	
	public static int money(int d[], int n) {
		int tmp = n, tmp2 = n;
		int ans = 0;
		for(int i = String.valueOf(n).length() - 1; i >= 0; --i) {
			tmp = tmp2;
			tmp /= (int)Math.pow(10, i);
			tmp2 -= tmp * (int)Math.pow(10,  i);
			for(int j = tmp; j < 10; ++j) {
				if(like(d, j)) {
					ans += j * Math.pow(10, i);
					break;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, k, d[];
		n = sc.nextInt();
		k = sc.nextInt();
		
		d = new int[k];
		for(int i = 0; i < k; ++i) {
			d[i] = sc.nextInt();
		}
		
		int ans = money(d, n);
		
		System.out.println(ans);
		
		sc.close();
	}

}
