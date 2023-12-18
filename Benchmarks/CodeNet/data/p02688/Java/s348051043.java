import java.util.Scanner;
import java.util.TreeMap;


public class Main {


//	final int MOD = 1000000007;

//	public static int max = 0;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int k = sc.nextInt();
//		String string = sc.next();

//		int[] ans = new int[n];
		int[][] a = new int[k][n];
		int[] d = new int[k];

		for(int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
			for(int j = 0; j < d[i]; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		//-------------------------------------------------------------------------------------

		for(int i = 0; i < k; i++) {
			for(int j = 0; j < d[i]; j++) {
				map.put(a[i][j], 1);
			}
		}

		ans = n - map.size();
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