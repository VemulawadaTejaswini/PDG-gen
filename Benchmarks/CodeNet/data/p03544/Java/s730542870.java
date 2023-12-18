import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		List<Long> li = new ArrayList<>();
		li.add(2L);
		li.add(1L);
		for (int i = 2; i <= n; i++) {
				li.add(li.get(i-1)+li.get(i-2));
		}
		System.out.println(li.get(n));
	}
}