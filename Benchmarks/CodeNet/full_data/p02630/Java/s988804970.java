import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ans = 0;
		int a[] = new int[100000];
		for(int i=0;i<n;i++) {
			int now = scan.nextInt();
			a[now-1] += 1;
			ans += now;
			
		}
		
		int q = scan.nextInt();
		
		for(int i=0;i<q;i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			ans = ans+(c-b)*a[b-1];
			System.out.println(ans);
			
			a[c-1] += a[b-1];
			a[b-1] = 0;
			
			
			
			
			
			
		}
		
		
	}
}
 