import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		
		// 0がaになり、アルファベットだけの26進数にしてね
		System.out.println(convertOriginalShinsuStr(n, 'a', 26));
		
	}
	
	/**
	 * 10進数をオリジナル進数(アルファベット)文字列に変換
	 * @param dNum 変換する10進数
	 * @param origin 10進数の0をオリジナル進数で変換した後の文字
	 * @param baseNumber 何進数に変換するの
	 * @return オリジナル進数(アルファベット)文字列
	 */
	public static String convertOriginalShinsuStr(
			long dNum, final char origin, final int baseNumber) {
		
		// よくわからんワンちゃん
		if(dNum <= 0) {
			return "";
		}
		
		// 邪魔なのでオフセットは消化
		dNum--;
		
		// char型とintの足し算で文字を求める
		String ret = String.valueOf((char)(origin + dNum % baseNumber));
		// 小数点以下は切り捨てられる
		dNum /= baseNumber ; 
		
		// 次の位も頼みます
		return convertOriginalShinsuStr(dNum, origin, baseNumber) + ret;
		
	}

}
