
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int R = 90;
		int x = 0, y = 0;
		while (scanner.hasNext()) {
			String str = scanner.next();
			String[] ab = str.split(",");
			if (Integer.parseInt(ab[0]) == 0 && Integer.parseInt(ab[1]) == 0) {
				System.out.println(x);
				System.out.println(y);
				break;
			}
			/*if (0 <= R && R <= 90) {
				x += Integer.parseInt(ab[0]) * Math.sin(R);
				y += Integer.parseInt(ab[0]) *  Math.cos(R);
			} else if (90 < R && R <= 180) {
				x += Integer.parseInt(ab[0]) *  Math.sin(R);
				y -= Integer.parseInt(ab[0]) *  Math.cos(R);
			} else if (-90 <= R && R < 0) {
				x -= Integer.parseInt(ab[0]) *  Math.sin(R);
				y += Integer.parseInt(ab[0]) *  Math.cos(R);
			} else if (-180 <= R && R < -90) {
				x -= Integer.parseInt(ab[0]) *  Math.sin(R);
				y -= Integer.parseInt(ab[0]) *  Math.cos(R);
			}*/
			x += Integer.parseInt(ab[0]) * Math.cos(Math.toRadians(R));
			y += Integer.parseInt(ab[0]) * Math.sin(Math.toRadians(R));
			R -= Integer.parseInt(ab[1]);


		}
		scanner.close();
	}

}

