import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		while( true ){
			x = Integer.parseInt(scan.next());
			y = Integer.parseInt(scan.next());
			if( x == 0 && y == 0 ){
				break;
			}
			if( x > y ){
				int temp = x;
				x = y;
				y = temp;
			}
			System.out.printf("%d %d\n", x, y);
		}
		return;
	}
}