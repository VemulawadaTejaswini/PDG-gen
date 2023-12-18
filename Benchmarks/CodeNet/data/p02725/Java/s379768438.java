import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
//		double ans = 0.0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


//		long k = sc.nextLong();
//		long m = sc.nextLong();
//		long n = sc.nextLong();

		int k = sc.nextInt();
//		int m = sc.nextInt();
		int n = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		String[] strArray = string.split("");

		boolean f = false;

//		String[] s = new String[n];

		int[] a = new int[n];
//		int[] b = new int[n];
//		long[] a = new long[k];
//		int[][] a = new int[n][m];

//		ArrayList<Long> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
		}
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		int maxDistance = 0;
		int index = 0;
		for(int i = 1; i < n; i++) {
			if(Math.abs(a[i-1] - a[i]) > maxDistance) {
				maxDistance = Math.abs(a[i-1] - a[i]);
				index = i;
			}
		}
		if(Math.abs(k - a[n-1]) > maxDistance) {
			index = k;
		}


		for(int i = 1; i < n; i++) {
			if(i == index) {
				continue;
			} else {
				ans += Math.abs(a[i-1] - a[i]);
			}
		}
		if(index != k) {
			ans += Math.abs(k - a[n-1]);
		}

//		ans += Math.abs(a[0] - a[n-1]);

		System.out.println(ans);

		sc.close();
	}
}