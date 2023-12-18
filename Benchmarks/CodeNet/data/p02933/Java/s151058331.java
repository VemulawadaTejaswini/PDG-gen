import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		String s = scn.nextLine();
		System.out.println((N < 3200)?"red":s);
	}

}
