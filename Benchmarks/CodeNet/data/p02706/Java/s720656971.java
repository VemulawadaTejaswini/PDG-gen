import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) {
		FastScanner fsc = new FastScanner();

		int SV = fsc.nextInt();
		int HW = fsc.nextInt();
		int[] HW_count = new int[HW];
		int Total = 0;
		int Off = 0;
		for(int i = 0; HW > i; i++) {
			HW_count[i] = fsc.nextInt();
		}
		//メソッド呼び出し

		total(HW, HW_count, Total, SV, Off);
		//宿題が間に合わない
		if(Total < 0) {
			System.out.println(-1);
		}
		//遊べる日数を出力
		else if(Total >= 0) {
			System.out.println(SV);
		}

	}


	//遊びに行ける日にち数計算メソッド
		private static void total(int HW, int[] HW_count, int Total, int SV, int Off) {
			for(int num = 0; HW > num; num++ ) {
				Total = HW_count[num];
				SV = SV - Total;
			}
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


