import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Map<Integer,List<Integer>> map = new HashMap<>();

		for(int i = 0;i < n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			List<Integer> arr = (map.containsKey(a)) ?
				map.get(a) : new ArrayList<>();

			arr.add(b);
			map.put(a, arr);
		}

		for (List<Integer> val : map.values()) {
			Collections.sort(val, Collections.reverseOrder());
		}

		int result = 0;
		for(int i = 1;i <= m;i++) {

			int workMax = 0;
			int key = 0;
			for(int j = i;j > 0;j--) {
				if(map.containsKey(j) && map.get(j).size() >= 1) {
					List<Integer> lis = map.get(j);

					if(workMax <= lis.get(0)) {
						workMax =lis.get(0);
						key = j;
					}
				}
			}

			if(key != 0) {
				List<Integer> lis = map.get(key);
				lis.remove(0);
			}
			result += workMax;
		}

		System.out.println(result);
	}
}