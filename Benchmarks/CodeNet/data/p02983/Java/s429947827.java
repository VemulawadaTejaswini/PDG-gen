
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long l = sc.nextLong();
		long r = sc.nextLong();
		
		int l2 = (int) (l % 2019);
		int r2 = (int) (r % 2019);
		
		if(l2 == 0 || r2 == 0)System.out.println(0);
		else {
			if(l - r > 2019)System.out.println(0);
			else if(l2 < r2) {
				System.out.println(l2*(l2+1));
			}else {
				System.out.println(0);
			}
		}
	}

}
