import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 県の個数
		int m = in.nextInt(); // 市の個数

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
			city.add(new City(id, in.nextInt(), in.nextInt()));
		}

		// 県ごとに年でナンバー付けしてidでソート
		String citycode[] = new String[m + 1];
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
			citycode[c.id] = String.format("%06d%06d", c.pref, c.num);
			// System.out.println("id:" + c.id + " pref:" + c.pref + " year:" + c.year);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for ( int i = 1; i<=m; i++ ) {
			pw.println(citycode[i]);
		}
		pw.flush();
		in.close();
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
