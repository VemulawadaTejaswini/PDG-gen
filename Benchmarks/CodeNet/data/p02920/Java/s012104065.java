import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int num = scan.nextInt();
			int Bsum = 0;
			List<Integer> array = new LinkedList<>();

			int arrayNum = 1 << num;
			boolean[] avai = new boolean[arrayNum];
			
			for (int i = 0; i < arrayNum; i++) {
				int a = scan.nextInt();
				array.add(a);
				avai[i] = true;
			}

			Collections.sort(array, Collections.reverseOrder());
			List<Integer> exist = new ArrayList<>();
			exist.add(array.get(0));
			array.remove(0);
			boolean ans = true;

			List<Integer> a = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				a.clear();
				for (int j = 0; j < exist.size(); j++) {
					Iterator<Integer> it = array.iterator();
					while (it.hasNext()) {
						int v = it.next();
						if (exist.get(j) > v) {
							a.add(v);
							it.remove();
							break;
						} else if(!it.hasNext()) {
							System.out.println("No");
							return;
						}
					}
				}
				exist.addAll(a);
				Collections.sort(exist);
			}
				System.out.println("Yes");

		}
	}
}