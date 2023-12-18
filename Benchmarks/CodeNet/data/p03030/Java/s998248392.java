import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Map<Integer,Integer>> map = new TreeMap<>();
		int N=sc.nextInt();

		for(int i=0;i<N;i++) {
			String S=sc.next();
			int P=sc.nextInt();
			if(!map.containsKey(S)) {
				map.put(S,new TreeMap<Integer,Integer>(Comparator.reverseOrder()));
			}
			map.get(S).put(P,i+1);
		}

		for(Map.Entry<String,Map<Integer,Integer>> E: map.entrySet()) {
			for(Map.Entry<Integer,Integer> e: E.getValue().entrySet()) {
				System.out.println(e.getValue());
			}
		}

	}
}