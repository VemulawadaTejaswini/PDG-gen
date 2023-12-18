import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		int H = in.nextInt();
		int S = in.nextInt();
		int D = in.nextInt();
		int N = in.nextInt();
		
		long l1 = Math.min(Q*4, Math.min(H*2, S));
		long l2 = D;
		
		if(l1*2<=l2){
			System.out.println(l1*N);
		}else{
			System.out.println(l2*(N/2)+l1*(N%2));
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}