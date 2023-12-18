import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE/2;
	static final int mod = (int)1e9+7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i] = sc.nextInt();
		int p = 0;
		for(int i=0;i<n;i++) {
			if(a[i]==1)p=i;
		}
		
		int l = p;
		int r = n-1-p;
		
		int ans = 0;
		ans += (l+k-2)/(k-1);
		ans += (r+k-2)/(k-1);
		System.out.println(ans);
	}
	
}