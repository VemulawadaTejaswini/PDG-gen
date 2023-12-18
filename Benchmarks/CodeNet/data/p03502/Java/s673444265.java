import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
		int x = n;
		int y = 0;
		while (x > 0) {
			y += x - (x / 10 * 10);
			x /= 10;
		}

		if (n % y == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
