import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
		}
		int l = 0;
		long sum = 0;
		long xor = 0;
		for(int r=0;r<N;r++) {
			while((xor ^ A[r]) != (xor + A[r])) {
				xor ^= A[l];
				l++;
			}
			xor ^= A[r];
			sum += r - l + 1;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
