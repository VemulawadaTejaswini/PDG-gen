import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int h[] = new int[n];
		boolean heigher[] = new boolean[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			heigher[i] = true;
		}
 
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
 
			if(h[a-1] < h[b-1]) {
				heigher[a-1] = false;
			}else if(h[b-1] < h[a-1]) {
				heigher[b-1] = false;
			}else {
				heigher[a-1] = false;
				heigher[b-1] = false;
			}
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(heigher[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
 
}