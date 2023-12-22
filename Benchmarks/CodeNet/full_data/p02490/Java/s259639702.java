import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int temp;
		
		while ((x != 0) && (y != 0)) {
			if (x > y) {
				temp = x;
				x = y;
				y = temp;
				System.out.println(x + " " + y);
			} else {
				System.out.println(x + " " + y);
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

	}

}