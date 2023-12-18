import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.nextLine();
		int N = S.length();
		long[] remainder = new long[N+1];
		long[] a = new long[N];
		long[] T = new long[N+1];

		T[0] = Long.parseLong(S);
		T[N] = 0;
		remainder[0] = T[0] % 2019;
		remainder[N] = 0;
		long temp = T[0];

		for(int i=N-1;i>=0;i--) {
			a[i] = temp % 10;
			temp = temp / 10;
		}

		for(int i=1;i<N;i++) {
			T[i] = T[i-1] - (long)Math.pow(10, N-i)*a[i-1];
			remainder[i] = T[i] % 2019;
		}

		Arrays.sort(remainder);

		long tmp = 2020;
		int tmp2 = 1;
		int answer = 0;
		for(int i=0;i<=N;i++) {
			if(remainder[i] == tmp) {
				tmp2 += 1;
			}else if(tmp2 > 1) {
				answer += tmp2*(tmp2 - 1)/2;
				tmp2 = 1;
			}
			tmp = remainder[i];
		}

		System.out.println(answer);

//		for(int i=0;i<=N;i++) {
//			System.out.println("i = " + i +" の時Ti=" + T[i] + "                " + remainder[i]);
//		}

		scan.close();
	}

}
