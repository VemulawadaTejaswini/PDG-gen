import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt(), b = scn.nextInt();
		scn.close();
		System.out.println((a/b) + " " + (a % b) + " " + ((float) a / b));
	}
}

