import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int T = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			if (t <= T) list.add(c);
		}
		sc.close();
		
		if (list.isEmpty()) {
			System.out.println("TLE");
			return;
		}
		
		list.sort((a, b) -> a - b);
		System.out.println(list.get(0));
		
	}
}


