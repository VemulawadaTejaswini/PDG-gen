import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;


	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();


		//-------------------------------------------------------------------------------------

		while(!f) {
			c -= b;
			if(c <= 0) {
				System.out.println("Yes");
				break;
			}
			a -= d;
			if(a <= 0) {
				System.out.println("No");
				break;
			}
		}

		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}
}