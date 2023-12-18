import java.util.Scanner;


public class Main {


	//final int MOD = 1000000007;


	public static void main(String[] args) {

		double ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
//		int k = sc.nextInt();

		//-------------------------------------------------------------------------------------

		ans = 2 * Math.PI * n;


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