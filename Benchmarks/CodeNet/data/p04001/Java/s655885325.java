import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();

		int l = line.length();					// 数字の長さ
		StringBuffer src;
		int n = (int)Math.pow(2, l-1);	// 部分集合の数
		long sum = 0L;							// 答えとなる合計値
		int count;									// srcに挿入したときの文字のズレ。
		String[] temp;							// split用の配列。

//		sum = Long.parseLong(line);

		for (int i = 0; i < n; i++) {
			src = new StringBuffer(line);
			count = 0;
			for (int j = 0; j < l-1; j++) {
				if ( (i & (1 <<j)) == (1<< j) ) {
					src.insert(j+1+count, "+");
					count++;
				}
			}
			temp = src.toString().split("\\+");
			for (int k = 0; k < temp.length; k++) {
				sum += Long.parseLong(temp[k]);
			}
		}

		System.out.println(sum);
	}
}