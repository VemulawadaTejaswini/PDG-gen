import java.util.Scanner;
import java.util.TreeMap;


public class Main {


//	final int MOD = 1000000007;

//	public static long min = 2000000000;
//	public static long ans = 0;

	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

		long n = sc.nextInt();

		//-------------------------------------------------------------------------------------

		for(long i = 1; i <= n; i++) {
			ans += i * calc(i);
//			System.err.println(ans);
//			System.err.println(calc(n));
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

	public static long calc(long n) {
		TreeMap<Long, Integer> map = new TreeMap<Long, Integer>();
		long ans = 0;

		for(long i = 1; i * i <= n; i++) {
			if(n%i != 0)
				continue;
			map.put(i, 0);
			map.put(n/i, 0);
		}

		ans = map.size();
		return ans;
	}


}