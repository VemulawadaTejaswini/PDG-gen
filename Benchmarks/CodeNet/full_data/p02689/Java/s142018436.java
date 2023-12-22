import java.util.ArrayList;
import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int max = 0;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int m = sc.nextInt();
//		String string = sc.next();

//		int[] ans = new int[n];
		long[] h = new long[n];
		int[] a = new int[n];
		int[] b = new int[n];

		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			h[i] = sc.nextLong();
			list.add(i+1);
		}

		for (int i = 0; i < m; i++) {
			a[i]= sc.nextInt();
			b[i]= sc.nextInt();
		}


		//-------------------------------------------------------------------------------------

		for(int i = 0; i < m; i++) {
			if(h[a[i]-1] > h[b[i]-1]) {
				if(list.contains(b[i])) {
					list.remove(list.indexOf(b[i]));
				}
			} else if(h[a[i]-1] < h[b[i]-1]) {
				if(list.contains(a[i])) {
					list.remove(list.indexOf(a[i]));
				}
			} else if(h[a[i]-1] == h[b[i]-1]) {
				if(list.contains(a[i])) {
					list.remove(list.indexOf(a[i]));
				}
				if(list.contains(b[i])) {
					list.remove(list.indexOf(b[i]));
				}
			}
		}

		ans = list.size();
		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(f) {
//			System.out.println("ABC");
//		} else {
//			System.out.println("ARC");
//		}

		System.out.println(ans);

		sc.close();
	}
}