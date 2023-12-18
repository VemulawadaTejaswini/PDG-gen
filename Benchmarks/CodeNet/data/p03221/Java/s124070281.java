import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m=scanner.nextInt();
		int p[]=new int[m];
		int y[]=new int[m];
		Map<Integer,Map<Long,Integer>>map=new TreeMap<>();
		for(int i=0;i<m;i++) {
			p[i]=scanner.nextInt();
			y[i]=scanner.nextInt();
			if (map.containsKey(p[i])) {
				map.get(p[i]).put((long) y[i],0);
			} else {
				Map<Long,Integer>map1=new TreeMap<>();
				map1.put((long) y[i],0);
				map.put(p[i], map1);
			}
		}
		
		for(int i=0;i<m;i++) {
			List<Long> list = new ArrayList<>(map.get(p[i]).keySet());
			int ind=lower_bound(list, (long)y[i])+2;
			System.out.printf("%06d", p[i]);
			System.out.printf("%06d", ind);
			System.out.println("");
			
		}
	}
	private static int lower_bound(List<Long> list, long val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1) - 1;
	}
}