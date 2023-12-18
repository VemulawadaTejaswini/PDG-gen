import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String S = " " + sc.nextLine() + " ";
		String reg = "BW";

		int count = S.split(reg).length -1;

		while(true) {
			S = S.replaceAll(reg, "WB");
			count += S.split(reg).length -1;

			if (S.split(reg).length == 1) {
				break;
			}
		}

		System.out.println(count);
	}
}