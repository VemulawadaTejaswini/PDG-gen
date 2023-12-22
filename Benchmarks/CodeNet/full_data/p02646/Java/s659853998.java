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
			long temp = (b-a)/(v-w);
			if (temp * (v-w) == (b-a) && temp <=t && temp >=0) {
				System.out.println("YES");
				return;
			}
		} else {
			if (a == b) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		return;

	}

}
