
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String abcd = scan.next();
		scan.close();

		// a,b,c,dを分割する
		String[] array = abcd.split("");
		int[] intAbcd = new int[4];

		for(int i = 0; i < 4; i++) {
			intAbcd[i] = Integer.valueOf(array[i]);
		}

		ArrayList<String> symbol = new ArrayList<String>();
		int result = 0;
		// 0をマイナス、1をプラスとする
		for(int bit = 0; bit < (1 << 3); bit++) {
			result = intAbcd[0];
			symbol.clear();
			if(bit == 0 || bit >3) {
				for(int i = 0; i < 3; i++) {
					if(((bit >> i) & 1) == 1) {
						// プラス
						result += intAbcd[i + 1];
						symbol.add("+");
					}else {
						// マイナス
						result -= intAbcd[i + 1];
						symbol.add("-");
					}
				}
				// 計算結果が7だったら計算式を出力して終了
				if(result == 7) {
					System.out.println(intAbcd[0] + symbol.get(0) + intAbcd[1] + symbol.get(1) + intAbcd[2] + symbol.get(2) + intAbcd[3] + "=7");
					return;
				}
			}
		}
	}
}