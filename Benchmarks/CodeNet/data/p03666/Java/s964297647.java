import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int A = io.nextInt();
		int B = io.nextInt();
		long C = io.nextLong();
		long D = io.nextLong();
		
		for(int k=0;k<=N-1;k++){
			long max = D*k - C *(N-1-k);
			long min = C*k - D *(N-1-k);
			if(B-A>=min && B-A<=max){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}