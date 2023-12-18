import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;


	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();


		//-------------------------------------------------------------------------------------

		for(int i = a; i <= b; i++) {
			if(i % n == 0) {
				f = true;
			}
		}

		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

		if(f) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

//		System.out.println(ans);

		sc.close();
	}
}