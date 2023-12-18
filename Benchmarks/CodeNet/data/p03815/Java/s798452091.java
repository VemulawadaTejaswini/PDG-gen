import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		long a = x/11;
		long b = x%11;
		System.out.println(a*2 + ((b <= 6) ? 1 : 2));
	}
}