import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int num = scan.nextInt();
			int Bsum = 0;
			List<Integer> array = new ArrayList<>();

			int arrayNum = (int) Math.pow(2, num);
			for (int i = 0; i < arrayNum; i++) {
				int a = scan.nextInt();
				array.add(a);
			}

			Collections.sort(array, Collections.reverseOrder());
			List<Integer> exist = new ArrayList<>();
			exist.add(array.get(0));
			array.remove(0);
			boolean ans = true;

			for (int i = 0; i < num; i++) {

				List<Integer> a = new ArrayList<>();

				for (int j = 0; j < exist.size(); j++) {
					Iterator<Integer> it = array.iterator();
					while (it.hasNext()) {
						int v = it.next();
						if (exist.get(j) > v) {
							a.add(v);
							it.remove();
							break;
						} else if(!it.hasNext()) {
							ans=false;
							break;
						}
					}
					if(!ans) break;
				}
				if (!ans) break;
				exist.addAll(a);
			}
			if (ans) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}
}