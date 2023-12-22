import java.util.*;
 
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long[] l = {a * c, a * d, b * c, b * d};

		Arrays.sort(l);

		System.out.println(l[3]);
	}
}