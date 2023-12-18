import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int mult = 0;
			for(int i = 0;i<=999;i+=111) {
				if(n>i) {
					mult++;
				}
			}
			System.out.println(mult*111);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
