import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int X = in.nextInt();
		
		for(int i=X-K+1; i<=X+K-1; i++) {
			System.out.print(i);
			if(i<X+K-1) {
				System.out.print(" ");
			}else {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
