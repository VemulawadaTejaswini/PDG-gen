import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
			if(map.containsKey(a[i])) {
				int temp = map.get(a[i]);
				temp++;
				map.put(a[i], temp);
			}else {
				map.put(a[i], 1);
			}
		}

		List<Integer> s = new ArrayList<>(map.keySet());
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<map.keySet().size();i++) {
			int v = map.get(s.get(i));
			if(v > 1) {
				for(int j=0;j<(v/2);j++){
					l.add(s.get(i));
				}
			}
		}

		if(l.size() < 2) {
			System.out.println(0);
		}else {
			Collections.sort(l);
			System.out.println(l.get(l.size()-1) * l.get(l.size()-2));
		}

	}

}
