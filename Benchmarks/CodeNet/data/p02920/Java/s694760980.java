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

			for (int i = 0; i < num; i++) {
				List<Integer> a = new ArrayList<>();

				for (int j = 0; j < exist.size(); j++) {
					int n=0;
					while (n<array.size()) {
						int v = array.get(n);
						if (avai[n] && exist.get(j) > v) {
							a.add(v);
							avai[n]=false;
							break;
						} else if(n==array.size()-1) {
							System.out.println("No");
							return;
						}
						n++;
					}
				}
				exist.addAll(a);
				Collections.sort(exist, Collections.reverseOrder());
			}
				System.out.println("Yes");

		}
	}
}