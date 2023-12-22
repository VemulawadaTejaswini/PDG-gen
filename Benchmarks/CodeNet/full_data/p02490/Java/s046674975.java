import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());
		
		int d;
		
		while (x != 0 && y != 0) {
			if(x > y){
				d = x;
				x = y;
				y = d;
			}
			System.out.println(x + " " + y);
			x = Integer.parseInt(scan.next());
			y = Integer.parseInt(scan.next());
		}
	}
}