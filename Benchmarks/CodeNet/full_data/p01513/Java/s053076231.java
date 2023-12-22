import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			boolean[][] map = new boolean[n][n];
			for(int i=0;i<n;i++) {
				int m = sc.nextInt();
				for(int j=0;j<m;j++) {
					int p = sc.nextInt()-1;
					map[i][p] = true;
				}
			}
			boolean[] bad = new boolean[n];
			int k = sc.nextInt();
			for(int i=0;i<k;i++) {
				int l = sc.nextInt()-1;
				for(int j=0;j<n;j++) {
					if (!map[j][l]) {
						bad[j] = true;
					}
				}
			}
			int ans = -1;
			for(int i=0;i<n;i++) {
				if (!bad[i]) {
					if (ans == -1) {
						ans = i+1;
					}else{
						ans = -1;
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}

}