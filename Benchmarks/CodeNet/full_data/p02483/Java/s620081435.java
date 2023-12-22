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
		int z = sc.nextInt();
		
		int temp;
		
		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		
		if (x > z) {
			temp = x;
			x = z;
			z = temp;
		}
		
		if (y > z) {
			temp = y;
			y = z;
			z = temp;
		}
		
		System.out.println(x + " " + y + " " + z);

	}

}