
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		in.close();

		int count = 1;
		int before = list.get(0);
		int now;
		for (int i = 1; i < list.size(); i++) {
			now = list.get(i);
			if (before < now) {
				before = now;
				for (i++; i < list.size(); i++) {
					now = list.get(i);
					if (before > now) {
						count++;
						break;
					}
					before = now;
				}
			} else if (before > now) {
				before = now;
				for (i++; i < list.size(); i++) {
					now = list.get(i);
					if (before < now) {
						count++;
						break;
					}
					before = now;
				}
			} else if (before == now) {
				continue;
			} else {
				count++;
			}
			before = now;
		}
		System.out.println(count);
	}

}

// 10
// 9 8 7 6 3 2 1 1 1 1