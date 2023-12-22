import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int n = Integer.parseInt(st);
		int h = n / 3600;
		int m = n / 60;
		int s = n % 60;
		System.out.print(h);
		System.out.print(":");
		System.out.print(m);
		System.out.print(":");
		System.out.println(s);
	}

}