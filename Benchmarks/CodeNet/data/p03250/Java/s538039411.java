import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		Collections.reverse(list);
		int ans = Integer.parseInt(
				(String.valueOf(list.get(0)))+(String.valueOf(list.get(1)))
						);
		System.out.println(ans + list.get(2));
 	}
}