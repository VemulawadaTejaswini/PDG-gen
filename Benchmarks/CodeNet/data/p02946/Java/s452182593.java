import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int center = sc.nextInt();
		int start = center - num + 1;

		if (num != 1) {
			for (int i = 0; i < num * 2; i++) {
				System.out.println(start);
				start++;
			}
		} else {
			System.out.println(center);
		}

	}
}