import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		//x1,y1,x2,y2
		//System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
		
		int x3 = x2 + y1 - y2;
		int y3 = y2 - x1 + x2;
		int x4 = x1 + y1 - y2;
		int y4 = y1 - x1 + x2;
		
		//x3,y3,x4,y4
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}