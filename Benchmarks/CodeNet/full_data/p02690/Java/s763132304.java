import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int x = sc.nextInt();

		int b = 0;
		double a = Math.pow(x + Math.pow(b, 5), 0.2);

		while (a != Math.floor(a)) {
			b = b == 0 ? 1 : b > 0 ? b * (-1) : b * (-1) + 1;
			a = Math.pow(x + Math.pow(b, 5), 0.2);
		}

		// 出力
		System.out.println((int) a + " " + b);
		sc.close();
	}
}
