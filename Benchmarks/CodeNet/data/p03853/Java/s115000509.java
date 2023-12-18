import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hight = sc.nextInt();
		sc.nextLine();
		String output;
		for (int i = 0; i < hight; i++) {
			output = sc.next();
			System.out.print("\n" + output);
			System.out.print("\n" + output);
		}
		sc.close();
	}

}