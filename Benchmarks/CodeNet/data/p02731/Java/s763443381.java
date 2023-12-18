import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<String> z;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		double l = L/3;
		System.out.println(Math.pow(l, 3));
	}
}
