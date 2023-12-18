import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<String> list = new ArrayList<>();

		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}

		sc.close();

		List<String> list2 = new ArrayList<String>(new HashSet<>(list));

		int cnt[] = new int[list2.size()];

		Collections.sort(list2);

		for(int i=0;i<list2.size();i++) {
			for(int j=0;j<n;j++) {
				if(list2.get(i).equals(list.get(j))) {
					cnt[i] += 1;
				}
			}
		}

		int max = cnt[0];
		for(int i=1;i<cnt.length;i++) {
			if(max < cnt[i]) {
				max = cnt[i];
			}
		}

		for(int i=0;i<cnt.length;i++) {
			if(cnt[i] == max) System.out.println(list2.get(i));
		}

	}


}