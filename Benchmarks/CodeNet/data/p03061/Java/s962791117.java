import java.util.*;
public class Main{
	static int gcd(int x, int y){
		if(x < y)gcd(y,x);
		if(y == 0) return x;
		return gcd(y, x%y);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int[n];
		for(int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
		}
		int[] left_gcd = new int[n];
		int[] right_gcd = new int[n];
		left_gcd[0] = a[0]; right_gcd[n-1] = a[n-1];

		for(int i = 1;i < n; ++i){
			left_gcd[i] = gcd(left_gcd[i-1],a[i]);
			right_gcd[n-i-1] = gcd(right_gcd[n-i],a[n-i-1]);
		}
		int ans = Math.max(left_gcd[1],right_gcd[n-2]);
		for(int i = 0;i < n-2; ++i){
			ans = Math.max(ans,gcd(left_gcd[i],right_gcd[i+2]));
		}
		System.out.print(ans);
	}
}

