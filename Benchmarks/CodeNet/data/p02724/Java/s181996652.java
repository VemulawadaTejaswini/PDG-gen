import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		long happy = 0;

		happy = happy + (x / 500) * 1000;

		x = x % 500;

		happy = happy + (x / 5) * 5;

		print(happy);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
