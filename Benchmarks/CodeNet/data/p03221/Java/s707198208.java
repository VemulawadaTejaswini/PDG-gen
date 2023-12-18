import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


		int N = parseInt(st.nextToken());
		int M = parseInt(st.nextToken());
		int[] P = new int[N];
		String[] ans = new String[M];

		Map<Integer, int[]> citys = new TreeMap<>();

		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int n = parseInt(st.nextToken());
			int y = parseInt(st.nextToken());
			int[] info = new int[2];
			info[0] = n;
			info[1] = i;
			citys.put(y, info);
		}

		for(int key : citys.keySet()) {
			int[] c = citys.get(key);
			ans[c[1]] = String.format("%06d%06d", c[0],++P[c[0]-1]);
		}

		for(String a : ans) {
			System.out.println(a);
		}




	}
}
