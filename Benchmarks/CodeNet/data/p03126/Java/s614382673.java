import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int res = 0;
			int[] array = new int[m+1];
			for(int i = 0;i<n;i++) {
				int k = sc.nextInt();
				for(int j = 0;j<k;j++) {
					array[sc.nextInt()]++;
				}
			}
			for(int score : array) {
				if(score==n) {
					res++;
				}
			}
			System.out.println(res);
			
			
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
