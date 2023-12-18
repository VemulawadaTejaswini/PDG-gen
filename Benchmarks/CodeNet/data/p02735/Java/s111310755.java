import java.util.Scanner;

public class Main {

	static int count = 0;
	static int H = 0;
	static int W = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] oneLine = sc.nextLine().split(" ");
		H = Integer.parseInt(oneLine[0]);
		W = Integer.parseInt(oneLine[1]);

		String[][] S = new String[H][W];
		for (int i = 0; i < S.length; i++) {
			char[] elements = sc.nextLine().toCharArray();
			for (int j = 0; j < S[i].length; j++) {
				S[i][j] = String.valueOf(elements[j]);
			}
		}
		if(S[0][0].equals("#")) {
			count++;
		}

		recurse(S, 0, 0);
		System.out.println(count);
	}

	static void recurse(String[][] S, int targetH, int targetW){

		if(H >= targetH+2 && S[targetH+1][targetW].equals(".")) {
			if(targetH+1 == H && targetW == W) {
				return;
			}
			recurse(S, targetH+1 ,targetW);

		} else if(W >= targetW+2 && S[targetH][targetW+1].equals(".")) {
			if(targetH == H && targetW+1 == W) {
				return;
			}
			recurse(S, targetH ,targetW+1);

		} else {
			if(H > targetH+2 && S[targetH+1][targetW].equals("#") && !S[targetH][targetW+2].equals(".")) {
				count++;
				if(H == targetH+1 && W == targetW) {
					return;
				}
				recurse(S, targetH+1 ,targetW);
			} else if(W >= targetW+2 && S[targetH][targetW+1].equals("#")) {
				count++;
				recurse(S, targetH ,targetW+1);
			}
		}
	}
}