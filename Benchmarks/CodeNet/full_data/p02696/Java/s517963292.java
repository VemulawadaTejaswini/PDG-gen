import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		execute13_1();
	}

	private static void execute13_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans = 0;

			System.out.println(ans);
		}

	}

	private static void execute13_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			long b = sc.nextLong();
			long n = sc.nextLong();

			long x = Math.min(n, b - 1);
			long ans = a * x / b - a * (n / b);

			System.out.println(ans);
		}

	}
}