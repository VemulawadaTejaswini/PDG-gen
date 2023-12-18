import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;++i) a[i] = sc.nextInt();
		
		int sum = 0;
		int bit = 0;
		int l = 0;
		int r = 0;
		int ans = 0;
		while(true){
			while(r<N && sum==bit){
				sum += a[r];
				bit ^= a[r];
				r++;
			}
			ans += (r-l-1);
			if(r==N) ans++;
			//System.out.print(ans+" ");
			sum -= a[l];
			bit ^= a[l];
			l++;
			if(l>=N) break;
		}
		System.out.println(ans);
		return;
	}
}