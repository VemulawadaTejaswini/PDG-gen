import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int s = x % 60;
		int m = (x-s)%3600;
		int h = x / 3600;
		System.out.println(h + " " + m + " " + s);
	}
}