import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1,000,000,000,000,001
		Scanner sc = new Scanner(System.in);
		List<String> list = Arrays.asList("zabcdefghijklmnopqrstuvwxyz".split(""));
		long n = sc.nextLong();
		sc.close();
		List<Integer> q = new ArrayList<>();
		while (n > 0) {
			q.add((int) (n % 26));
			n = n / 26;
		}
		Collections.reverse(q);
		StringBuilder sb = new StringBuilder();
		for (Integer i : q) {
			sb.append(list.get(i));
		}
		System.out.println(sb.toString());
	}
}
