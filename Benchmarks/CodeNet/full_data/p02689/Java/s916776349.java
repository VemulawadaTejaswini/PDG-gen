import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int h[] = new int[n];
		int h2[] = new int[n];
				
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			h2[i] = h[i];
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			if(h[a] < h[b]) {
				h2[a] = 0;
			}
			if(h[a] > h[b]) {
				h2[b] = 0;
			}
			if(h[a] == h[b]) {
				h2[a] = 0;
				h2[b] = 0;
			}
		}
		
		int c = 0;
		for(int i = 0; i < n; i++) {
			
			if(h2[i] != 0) {
				c++;
			}
		}
		
		System.out.println(c);
	}
}