import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if ((m == -1) && (f == -1) && (r == -1)) {
				break;
			} else {
				int sei = m + f;
				if ((m == -1) || (f == -1)) {
					System.out.println("F");
				} else if (sei >= 80) {
					System.out.println("A");
				} else if (sei >= 65) {
					System.out.println("B");
				} else if (sei >= 50) {
					System.out.println("C");
				} else if (sei >= 30) {
					if (r >= 50) {
						System.out.println("C");
					} else {
						System.out.println("D");
					}
				} else {
					System.out.println("F");
				}
			}
		}

	}

}