import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int step = scn.nextInt();
		for(int i = 0;i < str.length();i += step) {
			System.out.print(str.toCharArray()[i]);
		}
		System.out.println();
	}

	public static double f(double theta) {
		return theta - Math.sin(theta * 2)/2;
	}
}