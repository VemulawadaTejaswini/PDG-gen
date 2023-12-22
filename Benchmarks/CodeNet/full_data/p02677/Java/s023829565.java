import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		double ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

//		String s = sc.next();

//		long k = sc.nextLong();

//		int[] a = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}

//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();

		//-------------------------------------------------------------------------------------

		if(h == m) {
			ans = 0;
		} else {
			double ak = 6 * ((double) h * 5);
			double bk = 6 * (double) m;
			double kakudo = Math.abs(ak - bk) % 180;
			ak = (double) a * (double) a;
			bk = (double) b * (double) b;
			double tmp = 2 * (double) a * (double) b * Math.cos(Math.toRadians(kakudo));
			ans = ak + bk - tmp;
			System.err.println(tmp);
			ans = Math.sqrt(ans);
		}

		//-------------------------------------------------------------------------------------

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}



}