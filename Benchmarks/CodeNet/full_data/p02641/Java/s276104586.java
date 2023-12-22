import java.util.ArrayList;
import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();
		int x = sc.nextInt();
		int n = sc.nextInt();

		int[] a = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			a[i] = t;
			list.add(t);
		}

		//-------------------------------------------------------------------------------------
		int tmp = 10000;
		for(int i = -100; i <= 100; i++) {
			if(list.contains(i))
				continue;
			if(tmp > Math.abs(x - i)) {
				ans = i;
				tmp = Math.abs(x - i);
			}
		}

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