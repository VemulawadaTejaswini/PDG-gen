import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int X = stdIn.nextInt();
		int Y = stdIn.nextInt();
		int Z = stdIn.nextInt();

		System.out.println(Z + " "  + X + " "+ Y);
		stdIn.close();
	}
}