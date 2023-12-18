import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int i = 0;
		int ans = 0;
		int ary[] = new int[x];
		for (i = 0; i < x; i++) {
			ary[i] = s.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for (i = 1;;) {
			i = ary[i - 1];
			ans++;
			if (i == 2) {
				break;
			} else if (list.contains(i)) {
				ans = -1;
				break;
			}
			list.add(i);
		}
		System.out.println(ans);
	}
}