import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count;
		while ((count = in.nextInt()) != 0) {
			String maxNum = "";
			int maxD = 0;
			while (count-- > 0) {
				String num = in.next();
				int d = in.nextInt() + in.nextInt();
				if (maxD < d) {
					maxNum = num;
					maxD = d;
				}
			}
			System.out.println(maxNum+" "+maxD);
		}
	}
}