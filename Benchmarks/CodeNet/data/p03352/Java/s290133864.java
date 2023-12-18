import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int result = 0;
			sc.close();
			for(int b = 1;b<32;b++) {
				for(int p = 2;p<32;p++) {
					if(Math.pow(b, p)<1000) {
					if(Math.pow(b, p)<=n) {
						if(n-Math.pow(b, p)<=min) {
							min = (int) (n - Math.pow(b, p));
							result = (int) Math.pow(b, p);
						}
					}
					else if(Math.pow(b, p)>=n) {
						if(Math.pow(b, p)-n<=min) {
							min = (int) (n - Math.pow(b, p));
							result = (int) Math.pow(b, p);
						}
					}
				}
			}
		}
			System.out.println(result);
		}
	public static void main(String[] args) {
		solve();

	}

}
