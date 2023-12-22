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
		if (v != w) {
			if (b > a) {
				double temp = (b-a) * 1.0/(v-w);
				if (t* (v-w) >= (b-a) && temp >=0) {
					System.out.println("YES");
					return;
				}
			} else {
				double temp = (a-b) * 1.0/(v-w);
				if (t* (v-w) >= (a-b) && temp >=0) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
		return;

	}

}
