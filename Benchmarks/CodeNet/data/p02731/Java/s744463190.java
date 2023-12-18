import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long l = stdIn.nextLong();
		/*
		BigDecimal a = BigDecimal.valueOf(l/3);
		
		System.out.println(a.multiply(a).multiply(a));*/
		
		
		System.out.println(l*l*l/27);

	}

}
