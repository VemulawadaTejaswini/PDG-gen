import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		int n, q;
		int cnt = 0;
		ArrayList<Integer> S = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>(); // 一致リスト（重複なし）
		
		// 入力========================================================
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++)
			S.add(Integer.parseInt(st.nextToken()));
		
		
		q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < q; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (S.contains(temp) && !list.contains(temp)) {
				list.add(temp);
				cnt++;
			}
		}
		//=============================================================
		System.out.println(cnt);
	}

}