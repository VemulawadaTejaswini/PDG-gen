import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ax = (a > x)? a - x : x - a;
		int bx = (b > x)? b - x : x - b;
		System.out.println((ax < bx)? "A" : "B");
	}
}