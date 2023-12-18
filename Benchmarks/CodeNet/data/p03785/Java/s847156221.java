import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		in.close();
		
		Collections.sort(list);
		
		int ans = 0;
		int t = list.get(0);
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			count++;
			if(list.get(i) > t + k) {
				ans++;
				t = list.get(i);
				count = 1;
			}else if(count == c) {
				ans++;
				count = 0;
				if(i + 1 < n) {
					t = list.get(i + 1);
				}
			}
//			System.out.println(ans + " " + list.get(i));
		}
		if(count > 0) {
			ans++;
		}
		System.out.println(ans);
	}

}
