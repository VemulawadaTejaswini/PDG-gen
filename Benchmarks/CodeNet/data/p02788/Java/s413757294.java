
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		
		int [][]x = new int [n][2];
		
		for(int i = 0 ; i < n ;i++) {
			x[i][0] = Integer.parseInt(sc.next());
			x[i][1] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(x,(p,q) -> Integer.compare(p[0],q[0]));
		
		int []nd = new int [n+1];
		for(int i = 0 ; i < n ;i++) {
			nd[i] = x[i][0];
		}
		nd[n] = 1000000000;
		long []sum = new long [n+1];
		long ans = 0;
		
		for(int i = 0 ; i < n ; i++){
			if(sum[i] < x[i][1]) {
				long A = (x[i][1] - sum[i] + a - 1)/a;	//x[i]を０にするために必要な爆弾の回数
				long D = nd[i] + 2 * d;
				int l = upper_bound(nd,D,n,i);
				sum[i] += A*a;
				sum[l] += -A*a;
				ans += A;
			}
			sum[i+1] += sum[i];
		}
		
		System.out.println(ans);
	}
	
	public static int upper_bound(int a[] , long d , int n, int f) {		
		int p = n;
		int q = f;
		while(p - q > 1) {
			int mid = (p+q)/2;
			if(a[mid] == d) {
				return mid+1;
			}
			if(a[mid] < d) {
				q = mid;
			}
			else {
				p = mid;
			}
		}
		return p;
		
		
	}

}
