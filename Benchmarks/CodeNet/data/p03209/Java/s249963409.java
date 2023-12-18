import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			l.add(a);
		}
		Collections.sort(l);
		int min = 1000000000;
		for (int i=0 ; i < l.size() - k + 1; i++ ) {
			int sabun = l.get(i+k-1) - l.get(i);
			if (sabun < min) min = sabun;
		}
		// 出力
		System.out.println(min);
	}
}



import java.util.*;
public class Main {
	static long num = 0;
	static long patty = 0;
	static long n = 0;
	static long x = 0;
	static Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
	static Map<Integer,Integer> pattyMap = new HashMap<Integer,Integer>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		x = sc.nextLong();

		numMap.put(0,1);
		pattyMap.put(0,1);
		for (int i = 1 ; i < 49 ; i++) {
			numMap.put(i, numMap.get(i-1)*2+3);
			pattyMap.put(i, pattyMap.get(i-1)*2+1);
		}

		level(n);
		// 出力
		System.out.println(patty);
	}

	private static boolean level(long lev) {
		if ( (x - num) > numMap.get(lev)) {
			num += numMap.get(lev);
			patty += pattyMap.get(lev);
		}


		if (lev == 0) {
			num++;
			patty++;
			if (num == x) return false;
			return true;
		} else {
			num++;
			if (num == x) return false;

			boolean b = level(lev - 1);
			if (b == false) return false;

			num++;
			patty++;
			if (num == x) return false;

			b = level(lev - 1);
			if (b == false) return false;

			num++;
			if (num == x) return false;

			return true;
		}
	}
}
