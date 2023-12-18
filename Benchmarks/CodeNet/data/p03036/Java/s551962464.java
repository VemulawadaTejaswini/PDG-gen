import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int r = 0, D = 0, x2000 = 0;

		try {
			String[] s = scanner.nextLine().split(" ");
			r = Integer.parseInt(s[0]);
			D = Integer.parseInt(s[1]);
			x2000 = Integer.parseInt(s[2]);
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}

		scanner.close();

		xip1(r, D, x2000, 2000);

	}
	static void xip1(int r, int D, int xi, int i) {
		i++;
    	int xip1 = xi * r - D;
    	System.out.println(xip1);
    	if(i >= 2010) {
			return;
		}
    	xip1(r, D, xip1, i);
	}

}
