import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		double B = Double.parseDouble(sc.next());
		sc.close();

		int hunSum = (int) Math.floor(100 * B);
		int onenokurai = hunSum % 10;
		int tennokurai = (hunSum / 10) % 10;
		
		long a = A * (hunSum / 100);
		long c = A * onenokurai;
		long b = A * tennokurai;
		
		long tmpb = b / 10;
		long tmpc = c / 100;
		
		//小数点以下の計算
		long tmpb2 = (tmpb % 10) * 10;
		long tmpc2 = tmpc % 100;
		//繰り上がりで1足されるかどうか確認
		long tmpx = (tmpb2 + tmpc2) / 100;
		
		long ans = a + tmpb + tmpc + tmpx;
		System.out.println(ans);

	}

}