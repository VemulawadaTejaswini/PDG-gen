import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		System.out.println(a + (a*a) + (a*a*a));
		stdIn.close();
	}

}