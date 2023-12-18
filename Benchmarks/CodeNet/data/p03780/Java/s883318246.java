
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static boolean exist(int a[], int t, int k) {
		if(a[t] > k)return true;
		int tmp = min_k(a, t, k);
		if(tmp < k && tmp + a[t] >= k)return true;
		else return false;
	}
	
	public static int min_k(int a[], int t, int k) {
		int ans = 0;
		for(int i = 0; i < a.length; ++i) {
			if(i != t) {
				ans += a[i];
				if(ans + a[t] >= k && ans < k)break;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, k, a[], sum = 0, ans = 0;
		
		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sc.close();
		
		Arrays.sort(a);
		
		if(sum >= k) {
			for(int i = 0; i < n; ++i) {
				if(!exist(a, i, k))++ans;
			}		
		}
		else ans = n;
		System.out.println(ans);
	}

}
