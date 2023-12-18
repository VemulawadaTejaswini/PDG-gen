import java.util.Scanner;


public class Main {


	//final int MOD = 1000000007;


	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < m; i++) {
			a[i]= sc.nextInt();
		}

		//-------------------------------------------------------------------------------------

		for(int i = 0; i < m; i++) {
			ans += a[i];
		}

		if(ans <= n) {
			ans = n - ans;
		} else {
			ans = -1;
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