import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			list.add(sc.nextInt());
		}
		tag: for (int i = n;; i++) {
			int num = i;
			for (int j = 0; j <= String.valueOf(i).length(); j++) {
				if (list.contains(num % 10)) {
					continue tag;
				}
				num /= 10;
			}
			System.out.println(i);
			break tag;
		}
		sc.close();
	}

}
