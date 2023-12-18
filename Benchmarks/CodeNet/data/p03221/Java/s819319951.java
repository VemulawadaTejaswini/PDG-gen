import java.util.*;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, ArrayList<Hoge>> map = new HashMap<>();
		Hoge[] ds = new Hoge[m];
		for(int i=0; i<m; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			Hoge d = new Hoge(p, y);
			ds[i] = d;
			map.compute(p, (k, v) -> {
				if(v==null) v = new ArrayList<>();
				v.add(d);
				return v;
			});
		}
		map.forEach((k, v) -> {
			Collections.sort(v);
			for(int i=0; i<v.size(); i++) v.get(i).setId(i+1);
		});
		for(int i=0; i<m; i++) System.out.println(ds[i]);
	}
}
class Hoge implements Comparable<Hoge>{
	int pref;
	int year;
	int id;

	Hoge(int p, int y) {
		pref = p;
		year = y;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	@Override
	public int compareTo(Hoge o)
	{
		return Integer.compare(year, o.year);
	}

	@Override
	public String toString()
	{
		return String.format("%06d%06d", pref, id);
	}
}