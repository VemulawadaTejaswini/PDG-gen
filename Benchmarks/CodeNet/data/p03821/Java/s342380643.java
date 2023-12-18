import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		long ans=0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}

		for(int i=n-1;i>=0;i--){
			if( i == n-1 && a[i] == 0 && b[i] == 1 ){
				ans++;
			}else if( (a[i]%b[i] + ans%b[i]) %b[i] != 0 ){
				ans -= ans%b[i];
				ans -= a[i]%b[i];
				ans += b[i];
			}
		}

		System.out.println(ans);
		return;
	}
}