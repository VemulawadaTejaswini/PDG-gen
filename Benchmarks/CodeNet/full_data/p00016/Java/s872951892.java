import java.util.Scanner;
import static java.lang.Math.PI;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useDelimiter(",|\\s+");
		double x = 0,y = 0;
		int 慮 = 90;
		while(true){
			int r = Integer.parseInt(scan.next());
			int 慮s = Integer.parseInt(scan.next());
			if(r == 0 && 慮s == 0)break;
			x = x + r * Math.cos(慮 * PI / 180);
			y = y + r * Math.sin(慮 * PI / 180);
			慮 = 慮 - 慮s;
		}
		System.out.println((int)x);
		System.out.println((int)y);
		System.exit(0);
	}

}