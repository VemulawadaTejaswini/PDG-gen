import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int strN = 2; // 文字列を何行受け取るか
		for (int i = 0; i < strN; i++) {
			line += br.readLine() + " ";
		}
		String[] param = line.split(" ");
		AtoZString(param);

	}

	static void AtoZString(String[] param) { //1行、文字列中のAからZまでの文字列で最大のものの文字数を出力[0]
		int max = 0;
		int count = 0;

		for(int i = 0; i < param[1].length(); i++){
			if(param[1].charAt(i) == 'I'){
				count++;
				if(max < count) max = count;
			} else if(param[1].charAt(i) == 'D'){
				count--;
			}
		}
		System.out.println(max);
	}
}