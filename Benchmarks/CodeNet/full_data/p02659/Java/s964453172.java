import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		Double b = sc.nextDouble();
		long b100 = (long)(b * 100);
		long answer = a * b100;
		System.out.println(answer/100);
	}

}