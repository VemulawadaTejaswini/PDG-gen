import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[3*n];
		for(int i=0;i<3*n;i++){
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		
		long ans=0;
		for(int i=0;i<n;i++){
			ans += Math.max(a[3*n-2*i-2], a[3*n-2*i-3]);
		}
		System.out.println(ans);
		return;
	}
}