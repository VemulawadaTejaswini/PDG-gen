import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String haco;
		int image = 0;

		if(S.length() != 4) {
			// ここでおしまい
		}else {
			for(int i = 0; i < 4; i++) {
				haco = S.substring(i, i+1);
				if(haco.equals("+")) {
					image++;
				}else if(haco.equals("-")) {
					image--;
				}else {
					// なにもしない
				}
			}
			System.out.println(image);
		}
	}
}