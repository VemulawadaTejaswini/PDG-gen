import java.util.Scanner;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		s.close();
		System.out.println((Math.PI*r*r) + " " + (Math.PI*r*2));
	}

}