import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();


		//-------------------------------------------------------------------------------------

		for(int i = 0; i <= k; i++) {
			for(int j = 0; j <= k; j++) {
				for(int l = 0; l <= k; l++) {
					if(i + j + l <= k)
						f = name(i, j, l, a, b, c);
					if(f) break;
				}
				if(f) break;
			}
			if(f) break;
		}

		//-------------------------------------------------------------------------------------

		if(f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

//		System.out.println(ans);

		sc.close();
	}

	public static boolean name(int i, int j, int l, int a, int b, int c) {
		int tmpa = a;
		int tmpb = b;
		int tmpc = c;
		for(int t = 0; t < i; t++) {
			tmpa *= a;
		}
		for(int t = 0; t < j; t++) {
			tmpb *= b;
		}
		for(int t = 0; t < l; t++) {
			tmpc *= c;
		}

		if(tmpc > tmpb && tmpb > tmpa) {
			return true;
		} else {
			return false;
		}
	}



}