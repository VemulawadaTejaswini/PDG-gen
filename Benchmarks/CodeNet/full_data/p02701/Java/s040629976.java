import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) {

				FastScanner sc = new FastScanner();

				int Kuji = sc.nextInt();
				//リスト定義
				List<String> gift = new ArrayList<String>();

				//kujiの個数回繰り返す。
			for(int i = 1; i <= Kuji; i++) {
				String syohin = sc.next();
				//リストの中にデータがなければ追加する
				if(!gift.contains(syohin)) {
					gift.add(syohin);
				}
			}
				//リストの数を出力する。
		System.out.println(gift.size());
			}
		}


class FastScanner {

	BufferedReader br;

	StringTokenizer st;



	public FastScanner() {

		br = new BufferedReader(new InputStreamReader(System.in));

	}



	String next() {

		while (st == null || !st.hasMoreElements()) {

			try {

				st = new StringTokenizer(br.readLine());

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

		return st.nextToken();

	}



	int nextInt() {

		return Integer.parseInt(next());

	}



	long nextLong() {

		return Long.parseLong(next());

	}

}