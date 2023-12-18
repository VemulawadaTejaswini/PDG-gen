import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i < n+1; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 1000000001;
		for(int i = 1; i < n; i++){
			ans = Math.min(ans,Math.max(a[i],a[i+1])%Math.min(a[i],a[i+1])==0?a[i]:(a[i]%2== 1||a[i+1]%2==1?1:2));
		}
		System.out.print(ans);
 	}
}
