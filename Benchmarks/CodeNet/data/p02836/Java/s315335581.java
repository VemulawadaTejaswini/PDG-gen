import java.util.Scanner;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		sc.close();
		int res = 0;
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i)) 
				res += 1;
		}
			System.out.println(res);
	}
		public static void main(String[] args) {
		solve();

	}

}
