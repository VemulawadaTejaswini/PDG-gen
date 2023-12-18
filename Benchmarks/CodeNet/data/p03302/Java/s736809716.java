import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		if(a+b==15) {
			System.out.println("+");
		}else if(a*b==15) {
			System.out.println("*");
		}else {
			System.out.println("x");
		}
	}

}