import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]); // 県の個数
		int m = Integer.parseInt(inputs[1]); // 市の個数

		// 県、年でソート
		PriorityQueue<City> city = new PriorityQueue<>(m, new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if ( o1.pref != o2.pref ) {		// 県でソート
					return o1.pref - o2.pref;
				} else {						// 同じ県の時は年でソート
					return o1.year - o2.year;
				}
			}
		});
		for ( int id = 1; id <= m; id++ ) {
			inputs = br.readLine().split(" ");
			city.add(new City(id, Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1])));
		}

		// 県ごとに年でナンバー付けしてidでソート
		PriorityQueue<City> city2 = new PriorityQueue<>(m, new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return o1.id - o2.id;
			}
		});
		int p = 0;
		int num = 0;
		while ( city.size() > 0 ) {
			City c = city.poll();
			// 新出の県の場合
			if ( p != c.pref ) {
				p = c.pref;
				num = 1;
			} else {
				num++;
			}

			c.num = num;
			city2.add(c);
			// System.out.println("id:" + c.id + " pref:" + c.pref + " year:" + c.year);
		}

		StringBuilder sb = new StringBuilder();
		while ( city2.size() > 0 ) {
			City c = city2.poll();
			// System.out.println("id:" + c.id + " pref:" + c.pref + " num:" + c.num);
			String pcode = String.format("%06d", c.pref);
			String ncode = String.format("%06d", c.num);
			sb.append(pcode).append(ncode).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}

class City {

	int	id		= 0;
	int	pref	= 0;
	int	year	= 0;
	int	num		= 0;

	public City(int id, int pref, int year) {

		this.id = id;
		this.pref = pref;
		this.year = year;
	}
}
