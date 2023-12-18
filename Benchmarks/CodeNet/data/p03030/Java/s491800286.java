import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<String> S = new ArrayList<String>();
		List<Integer> P = new ArrayList<Integer>();
		List<String> tmp = new ArrayList<String>();
		Map<String,Integer> namePointIndex = new HashMap<>();


		for(int i = 0; i< N;i++) {
			String name=sc.next();
			Integer point = sc.nextInt();
			S.add(name);
			P.add(point);
			namePointIndex.put(name + String.valueOf(point), i+1);
		}

		Collections.sort(P,Collections.reverseOrder());
		Collections.sort(S);

		for(String name : S) {
			for(Integer point : P) {
				String key = name + String.valueOf(point);
				if(namePointIndex.containsKey(key) && !tmp.contains(key)) {
					tmp.add(key);
					System.out.println(namePointIndex.get(key));
				}
			}
		}

	}

}