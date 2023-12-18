import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] H = new int[N];
		for(int i=0; i<N; i++) {
			H[i] = in.nextInt();
		}
		
		int right = H[N-1];
		for(int i = N-2; i>=0; i--) {
			if(H[i]>right+1) {
				System.out.println("No");
				return;
			}else if(H[i]<right) {
				right = H[i];
			}
		}
		System.out.println("Yes");
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}