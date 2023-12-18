import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String ans = "WA";
			sc.close();
			if(s.charAt(0)=='A') {
				if(s.charAt(1)!='C'&&s.charAt(s.length()-1)!='C'&&s.contains("C")) {
					ans = "AC";
				}
			}
				System.out.println(ans);
		}
	public static void main(String[] args) {
		solve();

	}

}
