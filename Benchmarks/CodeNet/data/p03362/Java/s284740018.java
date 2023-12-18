import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		boolean b;
		int cnt = 0;
		for (int i = 11; i <= 55555; i = i + 2) {
			b = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b && i % 5 == 1) {
				al.add(i);
				cnt++;
				if (cnt == n) {
					break;
				}
			}
		}
		for (int i : al) {
			System.out.println(i);
		}
	}
}