import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;

		for(int i = 0; i < n; i++) {
			String string = sc.next();
			if(string.equals("AC")) {
				ac++;
			} else if(string.equals("WA")) {
				wa++;
			} else if(string.equals("TLE")) {
				tle++;
			} else if(string.equals("RE")) {
				re++;
			}
		}


		//-------------------------------------------------------------------------------------

		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);


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