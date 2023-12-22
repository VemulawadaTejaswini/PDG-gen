import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st1, st2;
		int max, sum;

		while (sc.hasNext()) {
			st1 = sc.next();
			st2 = sc.next();
			max = 0;
			
			for (int i = 0; i < st1.length(); i++) {
				for (int j = 0; j < st2.length(); j++) {
					if (st1.charAt(i) == st2.charAt(j)) {
						sum = f(st1, st2, i, j);
						if (max < sum) {
							max = sum;
						}
					}
				}
			}
			System.out.println(max);
		}
	}

	public static int f(String st1, String st2, int index1, int index2) {
		int count = 0;

		for (int i = 0; index1 + i < st1.length() && index2 + i < st2.length(); i++) {
			if (st1.charAt(index1 + i) == st2.charAt(index2 + i)) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}