import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long x1, x2, y1, y2;
		x1 = (int)Math.ceil(Math.sqrt(S));
		y2 = x1;
		x2 = x1*y2 - S;
		y1 = 1;
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + 0 + " " + 0);

	}

}