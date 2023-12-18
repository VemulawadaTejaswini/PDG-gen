import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long K = in.nextLong();
		long[] A = new long[N];
		long[] B = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextLong();
			B[i] = in.nextLong();
		}
		
		long max = 0;
		
		long sum = 0;
		long comp = 0;
		
		for(int i=29;i>=0;i--){
			comp = comp << 1;
			if(((K>>i)&1) == 0 && i != 0) continue;
			sum = 0;
			for(int j=0; j<N; j++) {
				/*System.out.println((A[j]>>i));
				System.out.println(comp);
				System.out.println((A[j]>>i) | comp);
				System.out.println("--------");*/
				if(((A[j]>>i) | comp) == comp) sum += B[j];
			}
			max = Math.max(max, sum);
			comp = comp | 1;
		}
		
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}