import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] =sc.nextInt();
		}
		long sum =0;
		if (N%2==0) {
			long odd=0,ad=0;
			for (int i=0;i<N;i++) {
				if (i%2==0) {
					odd+=a[i];
				} else {
					ad+=a[i];
				}
			}
			if (ad>odd) {
				sum =ad;
			} else {
				sum =odd;
			}
		} else {
//			if (N==3) {
//				int max =a[0];
//				max = a[1]>max?a[1]:max;
//				max = a[2]>max?a[2]:max;
//				sum = max;
//			} else {
//				long dp[][]= new long[2][N];
//				dp[0][3] = a[1];
//				dp[1][3] = a[0];
//			}

		}
		System.out.println(sum);
	}
}