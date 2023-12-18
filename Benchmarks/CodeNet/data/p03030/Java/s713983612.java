import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int N = Integer.parseInt(str);

		List<Pair> restlist = new ArrayList<>();
		for(int i=0;i<N;i++) {
			String[] str1 = br.readLine().split(" ");
			String city = str1[0];
			int val = Integer.parseInt(str1[1]);

			Pair rest = new Pair(city,val,i+1);

			restlist.add(rest);
		}

		Collections.sort(restlist);
		Collections.reverse(restlist);

		Collections.sort(restlist, new PairComparator());


		for(int i=0;i<restlist.size();i++) {
			System.out.println(restlist.get(i).id);
		}

	}



	static class Pair implements Comparable<Pair> {
		String city;
		int val;
		int id;

		public Pair(String city, int val,int id) {
			this.city = city;
			this.val = val;
			this.id = id;
		}

		@Override
		public int compareTo(Pair o) {
			return Integer.compare(val, o.val);
		}
	}

	public static class PairComparator implements Comparator<Pair> {

	    public int compare(Pair a, Pair b) {
	        String no1 = a.city;
	        String no2 = b.city;

	        return no1.compareTo(no2);

	    }

	}
}
