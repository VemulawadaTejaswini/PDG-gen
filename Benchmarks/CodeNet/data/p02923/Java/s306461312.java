package Week1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] H = new int[n];
		for (int i = 0; i < H.length; i++) {
			H[i] = scan.nextInt();
		}
		int currentT = 0, maxT = 0, index = 0;
		do {
			for (int i = index; i < H.length-1; i++) {
				if (H[i] - H[i + 1] >= 0) {
					++currentT;
				} else {
					break;
				}
			}
			if (currentT > maxT) {
				maxT = currentT;
			}
			++index;
			currentT=0;
		} while (index < H.length);
		System.out.println(maxT);

	}

}
