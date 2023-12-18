import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			long[] card = new long[n+2];
			for(int i=1; i<=n+1; i++) {
				card[i] = 0;
			}
			for(int i=0; i<m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				card[a]++;
				card[b+1]--;
			}
			long count = 0;
			int ans = 0;
			for(int i=1; i<=n; i++) {
				count += card[i];
				if(count == m) {
					ans ++;
				}
			}
			System.out.println(ans);
		}
	}

}