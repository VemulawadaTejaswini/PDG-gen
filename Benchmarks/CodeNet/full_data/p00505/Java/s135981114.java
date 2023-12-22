import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] tris = new int[4];
	public static void main(String[] args) {

			judgeTypes();
			dispResult();

	}

	private static void dispResult() {
		System.out.printf("%d %d %d %d\n", tris[0], tris[1], tris[2], tris[3]);
	}

	private static void judgeTypes() {
		int[] s = new int[3];

			do {
						for (int i = 0; i < 3; i++) {
							s[i] = sc.nextInt();
						}

					Arrays.sort(s);

						if (s[2] >= s[0] + s[1]) {
							break;
						} else if (Math.pow(s[0], 2) + Math.pow(s[1], 2) - Math.pow(s[2], 2) == 0) {
							tris[0]++;
							tris[1]++;

						} else if (Math.pow(s[0], 2) + Math.pow(s[1], 2) - Math.pow(s[2], 2) > 0) {
							tris[0]++;
							tris[2]++;

						} else if (Math.pow(s[0], 2) + Math.pow(s[1], 2) - Math.pow(s[2], 2) < 0) {
							tris[0]++;
							tris[3]++;
						}

			}while(true);

	}

}
