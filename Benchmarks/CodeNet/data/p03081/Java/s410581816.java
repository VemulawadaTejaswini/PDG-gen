import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		List<Character> field = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			field.add(str.charAt(i));
		}
		char[][] op = new char[q][2];
		for (int i = 0; i < q; i++) {
			op[i][0] = sc.next().charAt(0);
			op[i][1] = sc.next().charAt(0);
		}
		int firstCount = n;
		int[] golem = new int[n];
		Arrays.fill(golem, 1);
		for (int i = 0; i < q; i++) {
			char target = op[i][0];
			boolean left = false;
			if (op[i][1] == 'L') {
				left = true;
			}
			for (int j = 0; j < n; j++) {
				char tmp = field.get(j);
				if (golem[j] > 0 && target == tmp) {
					int move = golem[j];
					golem[j] = 0;
					if (left) {
						if (j - 1 >= 0) {
							golem[j - 1] += move;
						} else {
							firstCount -= move;
						}
					} else {
						if (j + 1 < n) {
							golem[j + 1] += move;
						} else {
							firstCount -= move;
						}
					}
				}
			}
		}
		
		System.out.println(firstCount);
	}
}
