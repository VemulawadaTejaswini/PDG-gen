

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		int count = 0;
		int l=k;

		for(int i=0 ; i<n ; i++) {
			a[i] = scanner.nextLong();
		}

//		while(k < n) {
//			long ii = 1 ;
//			long jj = 1;
//
//			while(l>0) {
//				ii *= a[k-1];
//				jj *= a[k];
//				l--;
//			}
//
//			if(ii < jj) {
//				System.out.println("Yes");
//			}else {
//				System.out.println("No");
//			}
//			k++;
//		}

		for(int i=0 ; i<b.length ; i++) {
			b[i] = 1;
		}

		for(int i=0 ; i<n-k+1 ; i++) {
			l  = k;
			while(l > 0) {
				b[i] *= a[l-1+i];
				l--;
			}
		}

//		for(long test : b) {
//			System.out.println(test);
//		}

		int i=0;

		while(k < n) {

			if(b[i] < b[i+1]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

			i++;
			k++;
		}









		scanner.close();

	}

}
