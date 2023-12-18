import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		long[] a = new long[N];

		long sum = 0;


		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();

			sum += a[i];
		}

		long ans = sum;

		int i = 0;

		int j = 0;

		while(K>0) {

			if(a[i] < a[N-j-1]) {

				ans -= a[i];

				i++;

			}else {

				ans -= a[N-j-1];

				j++;
			}

			K--;
		}

		System.out.println(ans);
	}



}
