import java.util.Scanner;

public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		in.nextInt();
		String s = in.next();
		in.close();
		
		int r = 0;
		int b = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'R') {
				r++;
			} else {
				b++;
			}
		}
		
		if (r > b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
