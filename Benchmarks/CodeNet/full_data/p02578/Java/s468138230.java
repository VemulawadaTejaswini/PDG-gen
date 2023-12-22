import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		for(int i = 0;i < n; ++i)a[i] = scan.nextInt();

		long ans = 0;
		for(int i = 1; i < n; ++i){
			if(a[i-1] > a[i]){
				ans += a[i-1] - a[i];
				a[i] += a[i-1] - a[i];
			}
		}
		System.out.print(ans);
	}
}
