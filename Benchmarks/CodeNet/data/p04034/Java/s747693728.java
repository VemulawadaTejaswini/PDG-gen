import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[] red = new boolean[n];
		int[] balls = new int[n];
		red[0] = true;
		for(int i = 0; i < n; i++) {
			balls[i] = 1;
		}
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			balls[x]--;
			balls[y]++;
			if(red[x]) {
				if(balls[x] == 0) {
					red[x] = false;
					red[y] = true;
				} else {
					red[y] = true;
				}
			}
		}
		
		sc.close();
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(red[i]) ans++;
		}
		System.out.println(ans);
	}
	
}