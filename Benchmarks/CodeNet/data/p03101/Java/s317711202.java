import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		System.out.println((h - hh) * (m - mm));
	}
}
