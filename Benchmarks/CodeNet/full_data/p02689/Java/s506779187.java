import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		int[] view = new int[n];
		Arrays.fill(view, 1);
		for(int i=0; i<n; i++) {
			h[i] = sc.nextInt();
		}
		for(int j=0; j<m; j++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			view[a] = h[a] >= h[b] ? 1 : 0; 
			view[b] = h[a] <= h[b] ? 1 : 0; 	
		}
		
		int ans = 0;
		for(int isGood : view) {
			ans += isGood;
		}
		System.out.println(ans);
	}
	
}