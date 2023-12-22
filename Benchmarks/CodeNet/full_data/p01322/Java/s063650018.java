import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		char[][] numbers = new char[100][];
		int[] eqVal = new int[100];
		for (int n = in.nextInt(); n > 0; n = in.nextInt()) {
			int m = in.nextInt();
			for (int i = 0; i < n; i++) {
				numbers[i] = in.next().toCharArray();
				eqVal[i] = in.nextInt();
			}
			int val = 0;
			for (int i = 0; i < m; i++) {
				char[] hNum = in.next().toCharArray();
				for (int index = 0; index < n; index++) {
					boolean isMuch = true;
					for (int keta = 0; keta < 8; keta++) {
						if (numbers[index][keta] != '*'
								&& hNum[keta] != numbers[index][keta]) {
							isMuch = false;
							break;
						}
					}
					if (isMuch) {
						val += eqVal[index];
						break;
					}
				}
			}
			System.out.println(val);
		}
	}
}