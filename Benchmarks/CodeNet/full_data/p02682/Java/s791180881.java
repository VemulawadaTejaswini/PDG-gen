import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int max = 0;

	public static int[] a = {1, 2};

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();


		//-------------------------------------------------------------------------------------

		if(a >= k) {
			ans = k;
		} else {
			if(a + b >= k) {
				ans = a;
			} else {
				ans = a - (k - (a + b));
			}
		}

		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}
}