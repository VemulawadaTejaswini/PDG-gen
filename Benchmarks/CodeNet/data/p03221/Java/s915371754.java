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

		// 県、年でソート
		for ( int id = 1; id <= m; id++ ) {
			city[id][0] = id;
			city[id][1] = in.nextInt();
			city[id][2] = in.nextInt();
		}
		Arrays.sort(city, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if ( o1[1] != o2[1] ) {
					return o1[1] - o2[1];	// １．prefでソート
				} else {
					return o1[2] - o2[2];	// ２．yearでソート
				}
			}
		});

		DecimalFormat df = new DecimalFormat("000000");
		String result[] = new String[m];
		int pref = 0;
		int num = 0;
		for ( int i = 1; i <= m; i++ ) {
			int p = city[i][1];
			if ( pref != p ) {
				pref = p;
				num = 1;
			} else {
				num++;
			}
			result[city[i][0] -1] = df.format(pref) + df.format(num);
		}
		
		// PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		for ( String s : result ) {			
			sb.append(s).append("\n");
			// pw.println(s);
		}
		System.out.println(sb);
		// pw.flush();
		in.close();
	}
}
