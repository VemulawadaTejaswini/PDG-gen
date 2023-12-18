import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> hate = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			hate.add(sc.nextInt());
		}
		List<Integer> like = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			if (!hate.contains(i)) {
				like.add(i);
			}
		}
		String str = "";
		List<Integer> list = new ArrayList<>();
		list = getKeta(price);
		for (int i = String.valueOf(price).length() - 1; i >= 0; i--) {

			for (int j = 0; j < like.size(); j++) {
				if (list.get(i) <= like.get(j)) {
					str += like.get(j);
					break;
				}
			}

		}
		System.out.println(str);
	}

	public static List<Integer> getKeta(int n) {
		List<Integer> list = new ArrayList<>();
		while (n > 0) {
			list.add(n % 10);
			n /= 10;
		}
		return list;
	}
}