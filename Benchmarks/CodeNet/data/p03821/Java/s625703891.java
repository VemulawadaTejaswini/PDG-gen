import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean[] used = new boolean[n];
		int[] appear = new int[n];
		int ans = 0;
		int max = 0;
		int p = 0;

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			appear[ a[i]-1 ]++;
			if( appear[ a[i]-1 ] > max ){
				p = 
		}


		for(int i=n-1;i>=0;i--){
			a[i] += ans;
			if( a[i] == 0 && b[i] == 1 ){
				ans++;
			}else if( a[i]%b[i] != 0 ){
				ans += (b[i] - a[i]%b[i]);
			}
		}

		System.out.println(ans);
		return;
	}
}