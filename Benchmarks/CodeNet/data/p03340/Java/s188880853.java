import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		long xor = 0;
		long sum = 0;

		long ans = 0;
		int right = 0;
		for(int left=0;left<N;left++) {
			//rightを右に伸ばす
			while( right < N && (xor^A[right]) == (sum+A[right]) ) {
				xor ^= A[right];
				sum += A[right];
				right++;
			}

			ans += (right-left);

			if(left==right) {
				right++; //leftもrightも進めるので、xorやsumを更新する必要はない
			}else {
				xor ^= A[left];
				sum -= A[left];
			}
		}
		out.println(ans);

//		//愚直解
//		long a = 0;
//		for(int i=0;i<N;i++) {
//			for(int j=i;j<N;j++) {
//				long s = 0;
//				long x = 0;
//				for(int k=i;k<=j;k++) {
//					s += A[k];
//					x ^= A[k];
//				}
//				if(s==x) {
//					a++;
//				}
//			}
//		}
//		out.println(a);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
