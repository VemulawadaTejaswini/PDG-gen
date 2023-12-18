import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		long[] a = new long[N];

		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();

		}





			int k = K/2;

			long b = 0;

			long c = 0;


			for(int i=k;i<N;i++) {

				b += a[i];

			}

			for(int i=N-1;i>=k;i--) {

				c += a[i];
			}

			if(K%2==0) {

				if(b>c) System.out.println(b);

				else System.out.println(c);

			}else {

				if(b>c) System.out.println(c);

				else System.out.println(b);
			}


	}

}
