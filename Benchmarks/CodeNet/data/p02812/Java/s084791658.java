import java.util.Scanner;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int res = 0;
		for (int i = 0; i<n-2; i++) {
			if(s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C') 
				res++;
		}
		sc.close();
		System.out.println(res);
	}
	public static void main(String[] args) {
		solve();

	}

}
