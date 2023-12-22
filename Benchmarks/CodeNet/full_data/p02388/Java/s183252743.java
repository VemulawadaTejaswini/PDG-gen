import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Cube test = new Cube();
		test.num();

	}
}
	

class Cube{
	public void num(){

		String	i = new Scanner(System.in).nextLine();
		int number = Integer.parseInt(i);
		System.out.println((int)Math.pow(number,3));

	}
}