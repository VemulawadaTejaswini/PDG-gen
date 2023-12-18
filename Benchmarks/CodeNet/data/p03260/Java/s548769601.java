import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		System.out.println(A%2!=0&&B%2!=0?"yes":"no");
		scn.close();
	}
}
