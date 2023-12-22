import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson8C 与えられた英文に含まれる、各アルファベットの数を数えるプログラム
 * なお、小文字と大文字は区別しない
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		//a ~ｚのパターン
		char[] chaAZ = {'a','b','c','d','e','f',
				'g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t',
				'u','v','w','x','y','z'};

		//a?zのパターンが各何回あるかカウントする場所
		int[] intAZ = new int[26];

		//各行読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = "a";
			while((strLine = insBR.readLine())!=null){

			if(strLine.equals("")) {
				break;
			}

			//大文字は小文字にしておく
			strLine = strLine.toLowerCase();

			//char型に分解
			char[] chaAryLine = strLine.toCharArray();

			//各a?z何回あるかカウント
			for(int i = 0; i < chaAryLine.length; i++) {
				for(int j = 0; j < intAZ.length; j++) {
					if(chaAryLine[i] == chaAZ[j]) {
						intAZ[j]++;
					}
				}
			}
			}

			//出力
			for(int i = 0; i < intAZ.length; i++) {
				System.out.println(chaAZ[i] + " : " + intAZ[i]);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}