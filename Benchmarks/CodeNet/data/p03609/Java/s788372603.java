import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int t = scan.nextInt();
		int sand = x - t;
		if(sand < 0) {
			sand = 0;
		}
		System.out.println(sand);
	}
}