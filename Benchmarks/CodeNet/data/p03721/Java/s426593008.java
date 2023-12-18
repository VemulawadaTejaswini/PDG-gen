import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < b; j++) {
				list.add(a);
			}
		}

		list.sort((a, b) -> a - b);
		System.out.println(list.get(3).toString());
		sc.close();
	}
}
