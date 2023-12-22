import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(" ");
		int  d = Integer.parseInt(t[0]);
		int  p = Integer.parseInt(t[1]);
		int  s = Integer.parseInt(t[2]);


		String x = Math.floorDiv(d, s) <= p ? "Yes" : "No";

		System.out.println(x);
	}
}
