import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		int bounce = 1;
		int height = 0;

		for (int i = 0; i < n; i++) {
			height += Integer.parseInt(sc.next());
			if(height > x) {
				break;
			}
			bounce++;
		}

		System.out.println(bounce);

	}
}