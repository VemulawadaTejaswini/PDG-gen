import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static int PN = 1000000;
	static List<Integer> prime = new ArrayList<Integer>();
	static Map<Integer, Boolean> primeMap = new HashMap<Integer, Boolean>();
	static ArrayList<Map<Integer, Integer>> list = new ArrayList<Map<Integer, Integer>>();
	static long MOD = 1000000007;
	public static void main(String[] args) {
		init();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 最大公倍数map;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// a^p的指数和
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		for (int i = 1; i <= N; i++) {
			int A = sc.nextInt();
			Map<Integer, Integer> tmpMap = compute(map, A, sumMap);
			list.add(tmpMap);
		}
		long res = 0;

		for (int i = 0; i < N; i++) {
			Map<Integer,Integer> pointMap = list.get(i);
			Map<Integer,Integer> leftMap = new HashMap<Integer, Integer>();
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				int a = entry.getKey();
				int p = entry.getValue();
				
				Integer p2 = pointMap.get(a);
				if( p2 ==  null) {
					leftMap.put(a,p);
				}else {
					leftMap.put(a,p-p2);
				}
			}
			long tmp = 1;
			for(Entry<Integer,Integer> entry:leftMap.entrySet()) {
				int a = entry.getKey();
				int p = entry.getValue();
				
				tmp = tmp * pow(a,p) % MOD;
			}
			res = ( res + tmp ) %MOD;
		}
		System.out.println(res);
	}
	
	private static long pow(int a,int p) {
		return (long)Math.pow(a, p)%MOD;
	}
	

	private static Map<Integer, Integer> compute(HashMap<Integer, Integer> map, int A,
			HashMap<Integer, Integer> sumMap) {
		Map<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
		for (int i = 0, size = prime.size(); i < size;) {

			if (primeMap.get(A) != null) {

				Integer count = tmpMap.get(A);

				if (count == null) {
					tmpMap.put(A, 1);
				} else {
					tmpMap.put(A, count + 1);
				}

				break;
			}

			else if (A % prime.get(i) == 0) {
				int p = prime.get(i);

				Integer count = tmpMap.get(p);

				if (count == null) {
					tmpMap.put(p, 1);
				} else {
					tmpMap.put(p, count + 1);
				}

				A = A / p;
			} else {
				i++;
			}
		}
		for (Entry<Integer, Integer> entry : tmpMap.entrySet()) {
			int p = entry.getKey();
			int count = entry.getValue();

			Integer currCount = map.get(p);

			if (currCount == null || currCount <= count) {
				map.put(p, count);
			}

			Integer count2 = sumMap.get(p);
			if (count2 == null) {
				sumMap.put(p, count);
			} else {
				sumMap.put(p, count + count2);
			}
		}

		return tmpMap;
	}

	private static boolean isPrime(int n) {
		int t = (int) Math.sqrt(n);
		for (int i = 2; i <= t; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void init() {
		primeMap.put(1, true);
		for (int i = 2; i <= PN; i++) {
			if (isPrime(i)) {
				prime.add(i);
				primeMap.put(i, true);
			}
		}
//		System.out.println(prime.size()+";largest:"+prime.get(prime.size()-1));
	}
}
