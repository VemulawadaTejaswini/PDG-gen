import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0047
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] cup = {1, 0, 0};
		while (sc.hasNextInt()) {
			String[] ss = sc.next().split(",");
			int i1 = new Integer(ss[0].charAt(0) - 'A'), i2 = new Integer(ss[1].charAt(0) - 'A');
			int tmp = cup[i1];
			cup[i1] = cup[i2];
			cup[i2] = tmp;
		}
		int idx = 0;
		for (idx = 0; ; idx++)
			if (cup[idx] == 1) break;
		System.out.printf("%c", idx + 'A');
		System.out.println();
	}
}