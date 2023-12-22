import java.util.Scanner;
public class Main {
		 
		static void solve() {
			Scanner sc = new Scanner(System.in);
			String S = sc.next();
			String T = sc.next();
			int res = 0;
			sc.close();
			for(int  i = 0; i<S.length();i++) {
				if(S.charAt(i)==T.charAt(i)) {
					res++;
				}
			}	
			if(res +1>=T.length()) {
				System.out.print("Yes");
			}
			else {
				System.out.print("No");
		}
	}
	public static void main(String[] args) {
		solve();
	}

}
