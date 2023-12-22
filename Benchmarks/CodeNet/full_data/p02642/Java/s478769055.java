import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i< n; i++) {
				list.add(sc.nextInt());
			}

			Collections.sort(list);
			Collections.reverse(list);

			int count = 0;
			for(int i = 0; i < n; i++) {
				if(0<i&&  list.get(i) == list.get(i-1)) {
					continue;
				}

				boolean flag = true;
				for(int j = i+1; j < n; j++ ) {


					if(list.get(i) % list.get(j) == 0) {
						flag = false;
						break;
					}
				}

				if(flag) count++;

			}

			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}