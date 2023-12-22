import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a = new int[4];
		for (int i=0; i<4; i++) a[i] = sc.nextInt();
		int[] b = new int[2];
		for (int i=0; i<2; i++) b[i] = sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		int total = 0;
		for (int i=3; i>=1; i--) {
			total += a[i];
		}
		out.println(total+b[1]);
	}
}
