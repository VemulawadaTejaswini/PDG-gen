import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean check = false;
		for (int i = 0; i <= 9; i++) {
			int a = i;
			for (int j = 1; j <= 9; j++) {
				int b = j;
				if (a * b == N) {
					check = true;
					break;
				}
			}
		}
		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}