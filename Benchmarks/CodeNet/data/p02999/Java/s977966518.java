import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double area = (double) (w * h) / 2.0;
		System.out.print(area);
		
//		int isMlt = (x * 2 == w && y * 2 == h) ? 1 : 0;
		int isMlt = (w / 2.0 == x && h / 2.0 == y) ? 1 : 0;
		System.out.println(" " +  isMlt);
		
		sc.close();
	}
}


