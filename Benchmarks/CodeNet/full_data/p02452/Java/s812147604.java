import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		boolean flag = true;
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			if (!set.contains(sc.nextInt())) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}

