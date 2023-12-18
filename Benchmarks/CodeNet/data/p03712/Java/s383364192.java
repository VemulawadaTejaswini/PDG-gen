import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int H = Integer.parseInt(ss0[0]);
		int W = Integer.parseInt(ss0[1]);
		
		// 2行目以降、数字が連なる。1桁で区切る
		//番兵君でやる。周りを0で囲む。配列は0で初期化されるので、代入時に+1ずらせばOK
		// 00000
		// 01230
		// 02340
		// 03450
		// 00000
		String s = "";
		int kabe = 1;
		char[][] c = new char[H+(kabe*2)][W+(kabe*2)];  //0で初期化される

		for(int i = 0; i < H; i++){
			s = br.readLine();
			for(int j = 0; j < W; j++){
				c[i+kabe][j+kabe] = s.charAt(j);
			}
		}
		for(int i = 0; i < H+2; i++){
			for(int j = 0; j < W+2; j++){
				if ( i == 0 ) { c[i][j] = '#'; }
				if ( j == 0 ) { c[i][j] = '#'; }
				if ( i == H+1 ) { c[i][j] = '#'; }
				if ( j == W+1 ) { c[i][j] = '#'; }
			}
		}

					////入力値確認
					checkInput(c);


	return;
	}
	//-----------------------------------------------------------------
	// Debug.Print
	static void dp(String s) {
		System.out.println(s);
	}
	static void dp(StringBuilder s) { dp(s.toString()); }
	static void dp(int i) { dp(String.valueOf(i)); }
	static void dp(long i) { dp(String.valueOf(i)); }

    //-----------------------------------------------------------------
					// 入力値確認
					static void checkInput(int[][] i2) {
						StringBuilder sb = new StringBuilder();
						for(int[] i1: i2){
							for(int i: i1) sb.append("[" + i + "]");
							sb.append(System.getProperty("line.separator"));
						}
						System.out.println(sb);
					}
					// 入力値確認
					static void checkInput(char[][] i2) {
						StringBuilder sb = new StringBuilder();
						for(char[] i1: i2){
							//for(char i: i1) sb.append("[" + i + "]");
							for(char i: i1) sb.append(""+i);
							sb.append(System.getProperty("line.separator"));
						}
						System.out.println(sb);
					}


}
