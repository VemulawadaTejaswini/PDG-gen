import java.util.Scanner;


public class Main {


	final int MOD = 1000000007;


	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
//		int k = sc.nextInt();

		//-------------------------------------------------------------------------------------

		String s = String.valueOf(n);
		String[] strArray = s.split("");

		for(int i=0; i < s.length(); i++) {
			if(strArray[i].equals("7")) {
				f = true;
			}
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