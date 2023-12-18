import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int plusAB = a + b;
		int twoAB = c * 2;
		int shareCnt = 0;
		if (plusAB > twoAB) {
			if (x < y) {
				shareCnt = x;
				x = 0;
				y = y - shareCnt;
			} else if (x > y) {
				shareCnt = y;
				x = x - shareCnt;
				y = 0;
			} else {
				shareCnt = x;
				x = 0;
				y = 0;
			}
			int resultA = a * x;
			int resultB = b * y;
			int resultAB = c * shareCnt * 2;
			System.out.println(resultA + resultB + resultAB);
		} else {
			int resultA = a * x;
			int resultB = b * y;
			System.out.println(resultA + resultB);
		}
	}
}