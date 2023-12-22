import java.util.*;
public class Main {

	static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			long mult = 1;
			for(int i = 0;i<n;i++) {
				long num = sc.nextLong();
				mult*=num;
			}
			sc.close();
			if(mult>1000000000000000000L) {
				System.out.println("-1");
			}
			else if(mult<=1000000000000000000L) {
				System.out.println(mult);
			}

		}
	public static void main(String[] args) {
		solve();

	}

}
