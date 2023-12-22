import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();


		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextLong();
		}

		long[] b = new long[m];
		for (int i = 0; i < m; i++) {
			b[i]= sc.nextLong();
		}

		//-------------------------------------------------------------------------------------

		int i = 0;
		int j = 0;
		long tmp = 0;

		while (tmp < k) {
			long anum = 0;
			long bnum = 0;
			if(j < m) {
				bnum = b[j];
			} else {
				bnum = -1;
			}
			if(i < n) {
				anum = a[i];
			} else {
				anum = -1;
			}

			if(anum == -1 && bnum == -1) {
				break;
			} else if(anum == -1) {
				tmp += bnum;
				j++;
			} else if(bnum == -1) {
				tmp += anum;
				i++;
			} else {
				if(anum < bnum) {
					tmp += anum;
					i++;
				} else {
					tmp += bnum;
					j++;
				}
			}

			if(tmp > k) {
				break;
			}
			System.err.println(tmp);
			ans++;
		}


		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}



}