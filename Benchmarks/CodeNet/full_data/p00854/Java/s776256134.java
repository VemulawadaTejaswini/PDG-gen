import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && k == 0 && m == 0)
				break;
			List<Integer> list = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(i + 1);
			}
			int x = m - 1;
			while (list.size() > 1) {
				list.remove(x);
				x = (x + (k - 1)) % list.size(); 
			}
			System.out.println(list.get(0));
		}
	}
}