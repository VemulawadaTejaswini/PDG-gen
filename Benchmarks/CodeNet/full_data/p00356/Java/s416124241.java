
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int sum = y+x;
		int cun = 0;
		if(x == y) {
			cun = x-1;
		}else {
			x = x*2;
			while(x%2 == 0 && y%2 == 0) {
				x = x/2;
				y = y/2;
				++cun;
			}
		}
		System.out.println(sum-cun);
	}
}

