import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i<n; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}