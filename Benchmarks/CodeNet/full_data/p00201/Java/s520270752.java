import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner stdIn = new Scanner(System.in);
	public static void main(String args[]) {
		while (true) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int n = stdIn.nextInt();
			if(n==0)break;
			String[] ite = new String[n];
			int[] pri = new int[n];
			for (int i = 0; i < n; i++) {
				String s = stdIn.next();
				int a = stdIn.nextInt();
				ite[i] = s;
				pri[i] = a;
				map.put(s, a);
			}
			int m = stdIn.nextInt();
			for (int i = 0; i < m; i++) {
				String s = stdIn.next();
				int a = stdIn.nextInt();
				int d = 0;
				for (int j = 0; j < a; j++) {
					String s2 = stdIn.next();
					d += map.get(s2);
				}
				if (d < map.get(s)) {
					map.put(s, d);
				}
			}
			String s = stdIn.next();
			System.out.println(map.get(s));
		}
	}
}