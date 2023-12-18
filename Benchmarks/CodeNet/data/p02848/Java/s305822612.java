import java.util.Scanner;
public class Main {
		
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String s  = sc.next();
			int number = s.length();
			String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for(int i = 0;i<number;i++) {
				int index = abc.indexOf(s.charAt(i));
				System.out.print(abc.charAt(index+n));
			}
			sc.close();
			}
	public static void main(String[] args) {
		solve();

	}

}
