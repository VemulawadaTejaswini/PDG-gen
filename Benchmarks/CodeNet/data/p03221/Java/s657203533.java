import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
	static int N, M;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Map<Integer, Integer> ml = new LinkedHashMap<Integer, Integer>();
		Map<Integer, String> result = new LinkedHashMap<Integer, String>();
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		for (int i = 0; i < M; i++) {
			int pi = sc.nextInt();
			int yi = sc.nextInt();
			ml.put(yi, pi);
			m.put(yi, pi);
		}
		int count;
		String xiaquid, cityorder, cityid;
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			count = 0;
			for (Entry<Integer, Integer> entry : m.entrySet()) {
				int v = entry.getValue();
				Integer k = entry.getKey();
				if (i == v) {
					count++;
					xiaquid = String.format("%06d", Integer.valueOf(v));
					cityorder = String.format("%06d", Integer.valueOf(count));
					cityid = xiaquid + cityorder;
					result.put(entry.getKey(), cityid);
					linkedList.add(k);
				}

			}
			
			for(Integer item : linkedList){
	        	m.remove(item);
	        }

		}
		for (Entry<Integer, Integer> entry : ml.entrySet()) {
			System.out.println(result.get(entry.getKey()));
		}

	}

}