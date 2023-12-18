import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n  = Integer.parseInt(tmp[0]);
		int x  = Integer.parseInt(tmp[1]);
		long a = 0;

		String[] temp = scanner.nextLine().split(" ");

		a = Math.abs(x -   Long.parseLong(temp[0]));

		for(int i = 1; i < n; i++) {

			a = gcd(a,  Math.abs(Long.parseLong(temp[i]) -   Long.parseLong(temp[i - 1])));

		}
		System.out.println(a);
	}

	public static long gcd(long x, long y) {

		if(x % y == 0) {

			return y;

		}else {

			return gcd(y, x % y);

		}

	}

}
