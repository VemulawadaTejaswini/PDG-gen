import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Map<Integer, Long> map = new HashMap<Integer, Long>();
			for(int i = 0; i < n; i++) {
				int e = sc.nextInt();
				long p = sc.nextInt();
				long q = sc.nextInt();
				long t = p * q;
				map.merge(e, t, (v1, v2) -> v1 + v2);
			}
			boolean flag = true;
			StringBuilder sb = new StringBuilder();
			for(int k : map.keySet()) {
				if(map.get(k) >= 1000000) {
					sb.append(k).append("\n");
					flag = false;
				}
			}
			if(flag) {
				System.out.println("NA");
			}else {
				System.out.print(sb.toString());
			}
		}
		sc.close();
	}
}
