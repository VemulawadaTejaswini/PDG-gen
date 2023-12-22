import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();

//		long k = sc.nextLong();

//		int[] a = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}

//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();

		//-------------------------------------------------------------------------------------

		n = n % 100;
		n = n % 10;

		String string;

		if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
			string = "hon";
		} else if(n == 0 || n == 1 || n == 6 || n == 8) {
			string = "pon";
		} else {
			string = "bon";
		}

		//-------------------------------------------------------------------------------------

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(string);

		sc.close();
	}



}