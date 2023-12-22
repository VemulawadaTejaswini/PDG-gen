import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();
		int k = sc.nextInt();
		Long[] a = new Long[n + 1];
		Long[] ak = new Long[n + 1];
		for (int i = 1; i < n + 1; i++) {
			a[i]= sc.nextLong();

			if(i - k > 0) {
				ak[i] = a[i] * ak[i - 1] / a[i - k];
			}  else if(i == 1) {
				ak[i] = a[i];
			} else {
				ak[i] = ak[i - 1] * a[i];
			}
		}


//		for(int i = 1; i < n + 1; i++) {
//			System.err.println(ak[i]);
//		}


		//-------------------------------------------------------------------------------------
		f = true;
		for(int i = k + 1; i <= n; i++) {
			if(ak[i - 1] < ak[i]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}



}