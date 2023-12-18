import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();

		String count = String.valueOf(line.length() - 2);
		String ans = line.substring(0,1) + count + line.substring(line.length() - 1,line.length());

		System.out.println(ans);
	}
}