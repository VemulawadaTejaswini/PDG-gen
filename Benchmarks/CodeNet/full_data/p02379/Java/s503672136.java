import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		scan.close();
		double dbX = Math.pow(x2 - x1, 2);
		double dbY = Math.pow(y2 - y1, 2);
		double dbAns = Math.sqrt(dbX + dbY);
		System.out.println(dbAns);
	}
}