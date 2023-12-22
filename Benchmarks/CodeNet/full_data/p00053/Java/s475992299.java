import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> index = new ArrayList<Integer>();
		ArrayList<Integer> search = new ArrayList<Integer>();
		for(int i=2; i<=100000; i++) search.add(i);
		index.add(2);
		while(index.get(index.size()-1) < Math.sqrt(100000)) {
			int now =  search.get(0);
			if(now != 2) index.add(now);
			int limit = search.size();
			for(int i=limit-1; i>=0; i--) if(search.get(i) % now == 0) search.remove(i);
		}
		for(int i=0; i<search.size()-1; i++) {
			index.add(search.get(i));
		}
//		for(int i=0; i<search.size(); i++) System.out.print(search.get(i) + " ");
		while(in.hasNext()) {
			int n = in.nextInt();
			if(n == 0) break;
			int sum = 0;
			for(int i=0; i<n; i++) {
				sum += index.get(i);
			}
			System.out.println(sum);
		}
	}
}