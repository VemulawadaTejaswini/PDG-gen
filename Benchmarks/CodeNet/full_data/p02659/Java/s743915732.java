import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b= sc.nextDouble();
		b *= 100;
		long c = (long)b;
		a = a*c;
		System.out.println(a/100);
		
		

	}

}
