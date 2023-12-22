import java.util.Scanner;
import java.util.ArrayList;

public class aoj_1129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			ArrayList<Integer> cards = new ArrayList<Integer>();
			for (int i = n; i >= 1; i--) {
				cards.add(i);
			}
			
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				
				for (int j = c; j >= 1; j--) {
					int k = cards.remove(p - 1 + c - 1);
					cards.add(0, k);
				}
			}
			System.out.println(cards.get(0));
		}
	}
}