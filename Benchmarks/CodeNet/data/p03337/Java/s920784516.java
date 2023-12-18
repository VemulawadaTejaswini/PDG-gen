import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y;
		x = scan.nextInt();
		y = scan.nextInt();

		System.out.println(max(max(x + y,x - y),x * y));

		scan.close();

	}

	public static int max(int x,int y) {
		return x > y ? x : y;
	}

}
