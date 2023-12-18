import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Rebyu> sortedList = new ArrayList<>();
		ArrayList<Rebyu> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int score = sc.nextInt();
			Rebyu r1 = new Rebyu(score, name);
			Rebyu r2 = new Rebyu(score, name);
			sortedList.add(r1);
			list.add(r2);	
		}
		Collections.sort(sortedList);
		for(int i = 0; i < n; i++) {
			Rebyu r1 = sortedList.get(i);
			for(int j = 0; j < n; j++) {
				Rebyu r2 = list.get(j);
				if ( r1.name.equals(r2.name) && r1.score == r2.score) {
					out.println(j + 1);
					break;
				}
			}
		}
		
	}
	static class Rebyu implements Comparable<Rebyu>{
		int score;
		String name;
		Rebyu(int score, String name){
			this.score = score;
			this.name = name;
		}
		@Override
		public int compareTo(Rebyu o) {
			int res = this.name.compareTo(o.name);
			if (res != 0)
				return res;
			
			return  - (Integer.compare(this.score, o.score));
			
		}
	}
}