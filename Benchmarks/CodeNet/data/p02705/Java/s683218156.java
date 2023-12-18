import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = (double)(i+i) * 31415926 /10000000;
		System.out.println(d);

		sc.close();
	}

}