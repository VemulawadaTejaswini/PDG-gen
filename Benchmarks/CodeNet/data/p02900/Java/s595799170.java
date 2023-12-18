import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
		long ans = 0;

		Scanner sc = new Scanner(System.in);
		long  a = sc.nextInt();
		long  b = sc.nextInt();

//		int  k = sc.nextInt();
//		long d = sc.nextLong();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		boolean f = true;
//
//		int[] a = new int[n];
//		int[] b = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//			b[i] = 0;
//		}
//		for (int i = 0; i < k; i++) {
//			b[i] = sc.nextInt();
//		}
//		for (int i = 1; i <n; i++) {
//			b[i] = sc.nextInt();
//		}
//		int[][] c = new int[h][w];
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				c[i][j] = 0;
//			}
//		}

//		int tmp_a = 0;
//		int tmp_b = 0;
		long tmp =0;
		if(a>b)tmp=b;
		else tmp=a;

		int cnt=0;

		for(long i=1;i<=tmp;i++) {
			if (i == 2 || i == 3) {
			    if(a%i==0&&b%i==0) {
			    	cnt++;
			    }
			} else if (i % 2 == 0 || i % 3 == 0) {

			} else {
				if(a%i==0&&b%i==0) {
			    	cnt++;
			    }
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}