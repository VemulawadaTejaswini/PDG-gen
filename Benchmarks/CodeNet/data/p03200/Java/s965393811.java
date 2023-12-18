import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int cnt = 0;

		boolean can = true;

		while(can) {

			can = false;

			if (S.contains("BW")) {

				for (int i = 0; i < S.length()-1; i++) {
					String s = S.substring(i, i+2);
					if (s.equals("BW")) {
						cnt++;
					}
				}
				can = true;
				S = S.replaceAll("BW", "WB");
			}

		}
		System.out.println(cnt);
	}

}
