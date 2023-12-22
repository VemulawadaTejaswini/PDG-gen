import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int W = Integer.parseInt(scan.next());
		int H = Integer.parseInt(scan.next());
		int x = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());
		int r = Integer.parseInt(scan.next());
		
		// ?????????????????????????????§????????¨??????Yes???????????°No
		if ((x-r >= 0) && (x+r <= W) && (y+r <= H) && (y-r >= 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}