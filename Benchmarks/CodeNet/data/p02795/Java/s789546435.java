import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
//		double ans = 0.0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


//		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];

//		int[] a = new int[n];
//		long[] a = new long[n];
//
//		int[][] a = new int[n][m];



//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

//		for (int i = 0; i < n; i++) {
//			s[i] = sc.next();
//			a[i] = sc.nextLong();
//		}


		int tmp = k;
		int tatecount = 0;
		int yokocount = 0;

		while(!f) {
			ans++;
			if(n - yokocount > m - tatecount) {
				tmp = tmp - (n - yokocount);
				tatecount++;
			} else {
				tmp = tmp - (m - tatecount);
				yokocount++;
			}

			if(tmp <= 0) {
				f = true;
				break;

			}
		}





		System.out.println(ans);

		sc.close();
	}


}