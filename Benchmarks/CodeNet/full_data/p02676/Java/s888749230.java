import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int k = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
		String s = sc.next();
		String[] sa = s.split("");

//		long k = sc.nextLong();

//		int[] a = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}

//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();

		//-------------------------------------------------------------------------------------

		if(k >= sa.length) {
			System.out.println(s);
		} else {
			for(int i = 0; i < k; i++) {
				System.out.print(sa[i]);
			}
			System.out.print("...");
			System.out.println();
		}

		//-------------------------------------------------------------------------------------

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}



}