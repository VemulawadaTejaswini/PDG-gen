
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		long ans = 0;
		for(int i = 0; i < list.size() - 2; i++) {
			int k = i + 2;
			for(int j = i + 1; j < list.size() - 1; j++) {
				while(k < list.size() && list.get(i) + list.get(j) > list.get(k)) {
					k++;
				}
				if(k == j + 1)
					k++;
				else {
					ans += (k - 1) - j;
				}
			}
		}
		System.out.println(ans);

	}

}
