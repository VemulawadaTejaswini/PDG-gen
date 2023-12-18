import java.util.Scanner;
	public class Main {
		public static void main(String args[]) {
			solve();
		}
		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			sc.close();
			for(int i = 0;i<s.length();i++) {
				System.out.print("x");
			}
		}
	}
