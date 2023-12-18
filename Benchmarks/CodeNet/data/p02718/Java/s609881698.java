import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		long ans = 0;
//		double ans = 0.0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


//		long k = sc.nextLong();
//		long m = sc.nextLong();
//		long n = sc.nextLong();

		int n = sc.nextInt();
		int m = sc.nextInt();
//		int k = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();

//		StringBuilder s = new StringBuilder(string);

//		String[] strArray = string.split("");

		boolean f = false;

//		String[] s = new String[n];

		int[] a = new int[n];
//		int[] b = new int[n];
//		int[][] a = new int[n][m];

//		long[] p = new long[a];
//		long[] q = new long[b];
//		long[] r = new long[c];

//		ArrayList<Long> list = new ArrayList<>();

		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
			count += a[i];
		}


//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

//		Arrays.sort(a);
		System.err.println(count);
		for(int i = 0; i < n ; i++) {

			double tmp = (double) count / (4*m);
			System.err.println(a[i]+" "+tmp);
			if(a[i] < tmp) {

			} else {
				ans++;
				if(ans >= m) {
					f = true;
					break;
				}
			}
		}



		if(f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}




//		System.out.println(ans);

		sc.close();
	}
}