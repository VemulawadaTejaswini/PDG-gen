import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int P = io.nextInt();
		long ans = 0;
		int zero = 0;
		int one = 0;
		for(int i=0;i<N;i++){
			if(io.nextInt()%2==0) zero ++;
			else one ++;
		}
		System.out.println((1L<<zero)*(1L<<(one-1)));
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}