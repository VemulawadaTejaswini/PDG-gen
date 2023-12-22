import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean[] cups = new boolean[] { true, false, false };
	public static void main(String[] args) {
		while (sc.hasNext()) {
			swapping(sc.nextLine());
		}

		for (int i = 0; i < 3; i++) {
			if (cups[i]) {
				switch(i) {
				case 0:
					System.out.println("A");
					break;
				case 1:
					System.out.println("B");
					break;
				case 2:
					System.out.println("C");
					break;
				}

			}
		}



	}

	private static void swapping(String nextLine) {
		String[] strs = nextLine.split(",");
		int[] n = new int[strs.length];

			for (int i = 0; i < strs.length; i++) {
				switch(strs[i]) {
				case "A":
					n[i] = 0;
					break;
				case "B":
					n[i] = 1;
					break;
				case "C":
					n[i] = 2;
					break;
				}
			}

		boolean tmp;
		tmp = cups[n[0]];
		cups[n[0]] = cups[n[1]];
		cups[n[1]] = tmp;

	}

}
