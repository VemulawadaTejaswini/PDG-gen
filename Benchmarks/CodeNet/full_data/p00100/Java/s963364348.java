import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Map<Integer, Long> map = new TreeMap<Integer, Long>();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				int e = sc.nextInt();
				long p = sc.nextInt();
				long q = sc.nextInt();
				long t = p * q;
				map.merge(e, t, (v1, v2) -> v1 + v2);
				list.add(e);
			}
			boolean flag = true;
			StringBuilder sb = new StringBuilder();
			for(int k : list) {
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
