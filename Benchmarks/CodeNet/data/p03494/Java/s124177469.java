import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int c = 0;
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		for (int j = 0; j < 100; j++) {
			for (int s = 0; s < b.length; s++) {
				if (b[s] % 2 != 0) {
					c++;
					break;
				} else {
					b[s] = b[s] / 2;
				}
			}
			if (c != 0) {
				System.out.println(j);
				break;
			}
		}
	}
}
