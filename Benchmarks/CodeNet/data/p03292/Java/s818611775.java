import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		if(c < b) {
			int tmp  = b;
			b = c;
			c = tmp;
		}
		System.out.println(Math.abs(a - b) + Math.abs(b - c));
	}
}