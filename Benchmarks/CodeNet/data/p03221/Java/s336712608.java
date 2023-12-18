import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] p = new int[m];
		int[] y = new int[m];
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < m; i++) {
			p[i] = scan.nextInt();
			y[i] = scan.nextInt();
			map.put(y[i], i);
		}
		scan.close();


		DecimalFormat fmt = new DecimalFormat("000000");

		String[] id = new String[m];
		int[] cnt = new int[n+1];//県ごとの入れた市の数をカウント
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int i = map.get(itr.next());
			cnt[p[i]]++;
			id[i] = fmt.format(p[i]) + fmt.format(cnt[p[i]]);
		}

		for(int i = 0; i < m; i++) {
			System.out.println(id[i]);
		}

	}

}