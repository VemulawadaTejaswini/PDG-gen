
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			boolean flag = false;
			int j = 0;
			for(j = 0; j < list.size(); j++) {
				if(list.get(j) < a)
					break;
			}
			if(j < list.size()) {
				list.remove(j);
				list.add(j, a);
			} else {
				list.add(0, a);
			}
		}
		System.out.println(list.size());

	}

}
