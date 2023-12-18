import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
		double ans = 0.0;
//		long ans2 = 0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
		double waru = 1000000007;


//		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);
//		String string2 = sc.next();
//		StringBuilder s2 = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];

//		int[] a = new int[n];
		long[] a = new long[n];

//		int[][] a = new int[n][m];



//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		for (int i = 0; i < n; i++) {
//			s[i] = sc.next();
			a[i] = sc.nextLong();
		}



		double min = 0.0;
		double max = 0.0;
		double tmp = 1.0;
		for(int i=0; i < n-1; i++) {
			min = min + (double) a[i+1] - (double) a[i];
			max = max + ((double) a[n-1] - (double) a[i]);

			if(i!=0)tmp = tmp * i;
		}
		tmp = tmp*(n-1);
//		System.err.println(min + " " + max);
		double tmp2 = (max + min)/2;
//		System.err.println(tmp+" "+tmp2);
		ans = (tmp2 * tmp);
		ans = ans % waru;

		System.out.println(ans);

		sc.close();
	}


}