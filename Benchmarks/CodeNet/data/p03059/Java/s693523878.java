import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A(sc);
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int ret = ((int)(t+0.5)/a)*b;
		out.println(ret);
	}
}