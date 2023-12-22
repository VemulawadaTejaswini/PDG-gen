

import java.io.IOException;
import java.util.Scanner;

/**
 * <pre>
 * NumberOfIsland
 *
 * ??¶?????°???????????????
 * </pre>
 *
 * @author ?????????????????§???
 *
 */
public class Main{

	static boolean map[][] = new boolean[12][12];
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
		      for(int i=0;i<12;i++){
	                char[] c = sc.next().toCharArray();
	                for(int j=0;j<12;j++){
	                    map[i][j]=c[j]=='1';
	                }
	            }
	            int ans=0;
	            for(int i=0;i<12;i++){
	                for(int j=0;j<12;j++){
	                    if(map[i][j]){
	                        test(i, j);
	                        ans++;
	                    }
	                }
	            }
	            System.out.println(ans);
		} // ?????????????????????
	}// ?????????????????????????????????

	public static void test(int mh, int mw) {
		map[mh][mw] = false;
		int move_h[] = { 1, 0, -1, 0 };
		int move_w[] = { 0, 1, 0, -1 };
		for (int cnt = 0; cnt < 4; cnt++) {
			int tmp_h = mh + move_h[cnt];
			int tmp_w = mw + move_w[cnt];
			if (0 <= tmp_h && 0 <= tmp_w && tmp_h < map.length && tmp_w < map[0].length && map[tmp_h][tmp_w])//
				test(tmp_h, tmp_w);
		}
	}
}// ??????????????????????????????