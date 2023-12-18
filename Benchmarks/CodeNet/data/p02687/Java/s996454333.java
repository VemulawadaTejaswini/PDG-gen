import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int max = 0;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		int n = sc.nextInt();
//		int m = sc.nextInt();
		String string = sc.next();

//		int[] ans = new int[n];

		//-------------------------------------------------------------------------------------

		if(string.equals("ABC") ) {
			f = false;
		} else {
			f = true;
		}

		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

		if(f) {
			System.out.println("ABC");
		} else {
			System.out.println("ARC");
		}

//		System.out.println(ans);

		sc.close();
	}
}