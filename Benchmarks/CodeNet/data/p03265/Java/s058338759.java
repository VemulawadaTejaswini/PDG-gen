import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		scan.close();
		int x = x2-x1;
		int y = y2-y1;
		System.out.println((x2-y)+" "+(y2+x) +" "+(x1-y)+" "+(y1+x));
	}
}
