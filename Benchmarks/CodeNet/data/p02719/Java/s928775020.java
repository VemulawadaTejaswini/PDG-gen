import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		long ans = 0;
//		double ans = 0.0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


		long n = sc.nextLong();
//		long m = sc.nextLong();
		long k = sc.nextLong();

//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int k = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();

//		StringBuilder s = new StringBuilder(string);

//		String[] strArray = string.split("");

		boolean f = false;

//		String[] s = new String[n];

//		int[] a = new int[n];
//		int[] b = new int[n];
//		int[][] a = new int[n][m];

//		long[] p = new long[a];
//		long[] q = new long[b];
//		long[] r = new long[c];

//		ArrayList<Long> list = new ArrayList<>();

//		int count = 0;
//		for (int i = 0; i < n; i++) {
//			a[i]= sc.nextInt();
//			count += a[i];
//		}


//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

//		Arrays.sort(a);

//		long ntmp = n;
		int valLen = String.valueOf(n).length();
//		int valLen2 = String.valueOf(k).length();
		long tmp = n;


		while(!f) {
			long tmp2 = 1;
			for(int i = 1; i < valLen; i++) tmp2 = tmp2 *10;
			while(n <= tmp2*k) {
				if(valLen <= 1) {
					break;
				}
				valLen = valLen-1;
				tmp2 = tmp2 / 10;
			}

			n = Math.abs(n-(k*tmp2));
//			System.err.println(n+" "+tmp2);

			if(n == 0) {
				ans = 0;
				break;
			}

			if(n >= tmp) {
				ans = tmp;
				break;
			}
			tmp = n;
		}

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}


		System.out.println(ans);

		sc.close();
	}
}