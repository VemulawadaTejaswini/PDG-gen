import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();		for(int i = 0; i < n; i++) {
				int e = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				int t = p * q;
				map.merge(e, t, (v1, v2) -> v1 + v2);
			}
			boolean flag = true;
			for(int k : map.keySet()) {
				if(map.get(k) >= 1000000) {
					sb.append(k).append("\n");
					flag = false;
				}
			}
			if(flag) {
				sb.append("NA").append("\n");
			}
		}
		sc.close();
		System.out.print(sb.toString());
	}
}
