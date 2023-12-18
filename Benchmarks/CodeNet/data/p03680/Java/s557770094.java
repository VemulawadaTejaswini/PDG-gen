import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		int n = scan.nextInt();
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			list.add(temp);
			if (temp == 2) {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(-1);
			return;
		}
		int index = 1;
		int ans = 1;
		for (int i = 0; i < n; i++) {
			index = list.get(index - 1);
			if (list.get(index - 1) == 2) {
				System.out.println(++ans);
				return;
			}
			ans++;
		}
		System.out.println(-1);

	}

}