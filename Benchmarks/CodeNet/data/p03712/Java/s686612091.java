import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int strN = 1; //文字列を何行受け取るか
		for(int i = 0; i < strN; i++){
			line += br.readLine() + " ";
		}
		String[] param = line.split(" ");

		DivisionToo(param);
	}

	static void DivisionToo(String[] param) throws IOException { //1行,aの倍数をbで割ってあまりcになる場合があればyesを出力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mozi = "#"; //並べる文字

		int str1 = Integer.parseInt(param[0]); // 縦軸
		int str2 = Integer.parseInt(param[1]); // 横軸

		String[] yoko = new String[str2 + 2];
		for (int i = 0; i < yoko.length; i++) {
			System.out.print(mozi);
		}
		System.out.println();

		for (int j = 0; j < str1; j++) {
			System.out.print(mozi);
			System.out.print(br.readLine());
			System.out.print(mozi);
			System.out.println();
		}

		for (int i = 0; i < yoko.length; i++) {
			System.out.print(mozi);
		}
	}


}