
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		int ans = 0;
		while(!list.isEmpty()) {
			long max = -1;
			int i = 0;
			while(i < list.size()) {
				if(max < list.get(i)) {
					max = list.get(i);
					list.remove(i);
				} else {
					i++;
				}
			}
			ans++;
		}
		System.out.println(ans);
	}

}
