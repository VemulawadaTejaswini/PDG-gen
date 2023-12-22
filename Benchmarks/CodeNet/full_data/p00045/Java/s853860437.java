import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int total = 0;
		int num = 0;
		int n = 0;
		while (sc.hasNext()) {
			String[] temp = sc.next().split(",");
			total += Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
			num += Integer.parseInt(temp[1]);
			n++;
		}
		out.println(total);
		double d1 = num;
		double d2 = n;
		out.println(Math.round(d1/d2));
	}
}
