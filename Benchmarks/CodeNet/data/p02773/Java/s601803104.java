
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair implements Comparable<Pair>{
		String s;
		Integer cnt;
		Pair(String s, Integer cnt){
			this.s=s;
			this.cnt=cnt;
		}
		@Override
		public int compareTo(Pair arg0) {
			if(this.cnt==arg0.cnt) {
				return this.s.compareTo(arg0.s);
			}
			return arg0.cnt.compareTo(this.cnt);
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			String s = sc.next();
			map.put(s, map.containsKey(s) ? map.get(s)+1 : 1);
		}
		ArrayList<Pair> list = new ArrayList<Pair>();
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			list.add(new Pair(e.getKey(),e.getValue()));
		}
		Collections.sort(list);
		int cnt = list.get(0).cnt;
		System.out.println(list.get(0).s);
		for(int i=1; i<list.size(); i++) {
			if(list.get(i).cnt==cnt) {
				System.out.println(list.get(i).s);
				continue;
			}
			break;
		}
		sc.close();
	}
}
