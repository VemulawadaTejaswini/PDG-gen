import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int buf = sc.nextInt();
			list.add(buf);
		}

		boolean boo = true;
		int result = 0;

		while(boo) {
			for (int cnt = 0; cnt < list.size(); cnt++) {
				if (list.get(cnt) % 2 != 0) {
					boo = false;
					break;
				}
				list.set(cnt, list.get(cnt)/2);
			}
			if(boo) {
				result += 1;
			}
		}
		System.out.println(result);
	}
}