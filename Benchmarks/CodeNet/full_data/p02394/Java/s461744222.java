import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		scan.close();
		if(x < r || y < r || x > W - r || y > H - r) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
