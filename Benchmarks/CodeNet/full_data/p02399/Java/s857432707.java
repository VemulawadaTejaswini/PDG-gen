import java.util.Scanner;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] n = str.split(" ");
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);
		int d = a / b;
		int r = a % b;
		double f = (double)a / b;
		// 出力部分 桁数が大きくなると勝手にEを使って桁を省略されることが有る。　それを防ぐためにBigDecimal.valueOf(float or double).toPlainString()を使っている。
		System.out.println( d + " " + r + " " + BigDecimal.valueOf(f).toPlainString());

	}
}
