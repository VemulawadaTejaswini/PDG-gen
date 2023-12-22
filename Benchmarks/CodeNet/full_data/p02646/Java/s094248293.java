import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();
		if (b < a || v <= w) {
			System.out.println("NO");
			return;
		}
//			double temp = (b-a) * 1.0/(v-w);
		if (t* (v-w) >= (b-a)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		return;
	}

	}

