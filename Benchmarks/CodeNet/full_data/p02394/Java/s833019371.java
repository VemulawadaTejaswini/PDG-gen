import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		sc.close();if(x + r > width || x - r  < 0 || y + r > height || y -r < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
