import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 県の個数
		int m = in.nextInt(); // 市の個数

		int city[][] = new int[m + 1][4]; // id, pref, year, number in pref
		for ( int id = 1; id <= m; id++ ) {
			city[id][0] = id;
			city[id][1] = in.nextInt();
			city[id][2] = in.nextInt();
		}
		Arrays.sort(city, (c1, c2) -> {
			if ( c1[1] != c2[1] ) return c1[1] - c2[1];	// 1.prefでソート
			else return c1[2] - c2[2];	// 2.yearでソート

		}
		/*new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			if ( o1[1] != o2[1] ) {
				return o1[1] - o2[1];	// 1.prefでソート
			} else {
				return o1[2] - o2[2];	// 2.yearでソート
			}
		}
		}*/);

		DecimalFormat df = new DecimalFormat("000000");
		String result[] = new String[m];
		int pref = -1;
		int num = 0;
		for ( int i = 1; i <= m; i++ ) {
			if ( pref == city[i][1] ) {
				num++;
			} else {
				pref = city[i][1];
				num = 1;
			}
			result[city[i][0] - 1] = df.format(pref) + df.format(num);
		}

		StringBuilder sb = new StringBuilder();
		for ( String s : result ) {
			sb.append(s).append("\n");
		}
		System.out.println(sb.toString());
		in.close();
	}
}
