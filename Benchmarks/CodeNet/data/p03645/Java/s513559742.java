import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//a==1 or b==n の時だけ考える
		boolean[] vis = new boolean[200010];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==1) {
				if(vis[b]==true) {
					System.out.println("POSSIBLE");
					return;
				} else {
					vis[b] = true;
				}
			} else if(b==n) {
				if(vis[a]==true) {
					System.out.println("POSSIBLE");
					return;
				} else {
					vis[a] = true;
				}
			}
		}
		System.out.println("IMPPOSSIBLE");
	}
}