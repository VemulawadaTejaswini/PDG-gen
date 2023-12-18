import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++) {
			a[i] =sc.nextInt();
		}
		if (a[0]>=0) {
			System.out.println(a[K-1]);
			return;
		}
		if (a[N-1]<=0) {
			System.out.println(Math.abs(a[N-K]));
			return ;
		}
		int afterZero=0,befZero=0;
		for(int i=0;i<N;i++) {
			if (a[i]<=0) {
				befZero++;
			} else {
				break;
			}
		}
		afterZero=N-befZero;
		int min = Integer.MAX_VALUE;
		for (int i=0;i<=befZero&&i<=K;i++) {
			if (K-i>afterZero) {
				continue;
			}
			int total;
			if (i==0) {
				total = a[befZero+K-1];
			} else if (i==K) {
				total = Math.abs(a[befZero-i]);
			} else {
				total = Math.abs(a[befZero-i])*2+a[befZero+K-i-1];
			}
			if (total<min) {
				min = total;
			}
		}
		for (int i=0;i<=afterZero&&i<=K;i++) {
			if (K-i>befZero) {
				continue;
			}
			int total;
			if (i==0) {
				total = Math.abs(a[befZero-K]);
			} else if (i==K) {
				total = a[befZero+K-1];
			} else {
				total = Math.abs(a[befZero+i-1])*2+Math.abs(a[befZero-(K-i)]);
			}
			if (total<min) {
				min = total;
			}
		}
		System.out.println(min);
	}
}