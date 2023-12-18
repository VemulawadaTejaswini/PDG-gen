import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = in.nextLine().split(" ");

		int sum = (Integer.parseInt(line[0]) - 1) * (Integer.parseInt(line[1]) - 1);
		System.out.println(sum);
	}
}