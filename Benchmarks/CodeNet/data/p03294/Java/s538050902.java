import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			int m = 2;
			while (a > 1) {
				int count = 0;
				while (a % m == 0) {
					a /= m;
					count++;
				}
				if (count > 0) {
					Integer x = map.get(m);
					if (x == null) {
						x = 0;
					}
					if (count > x) {
						map.put(m, count);
					}
				}
				m++;
			}
		}
		long val = 1;
		for (int x : map.keySet()) {
			val *= pow(x, map.get(x));
		}
		long sum = 0;
		val--;
		for (int i = 0; i < n; i++) {
			sum += val % arr[i];
		}
		System.out.println(sum);
	}
	
	static long pow(long x, int time) {
		if (time == 0) {
			return 1;
		} else {
			return x * pow(x, time - 1);
		}
	}
}


