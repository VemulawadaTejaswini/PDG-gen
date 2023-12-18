import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] ary = new String[H * W];
		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				ary[i * W + j] = String.valueOf(str.charAt(j));
			}
		}
		int index = 0;

		for (int i = 0; i < H + 2; i++) {
			for (int j = 0; j < W + 2; j++) {
				if (i == 0 || i == H + 1) {
					System.out.print("#");
				} else if (j == 0 || j == W + 1) {
					System.out.print("#");
				} else {
					System.out.print(ary[index]);
					index++;
				}
			}
			System.out.println("");
		}
	}

}