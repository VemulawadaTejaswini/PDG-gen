import java.util.Scanner;


public class Main {
//	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();



		//-------------------------------------------------------------------------------------

		int tmp = d / s;
		if(d % s == 0) {

		} else {
			tmp++;
		}

		if(tmp <= t) {
			f = true;
		} else {
			f = false;
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



}