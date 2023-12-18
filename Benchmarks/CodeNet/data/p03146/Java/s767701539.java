import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = -1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 1;
		while(true) {
			cnt++;
			if(s % 2 == 0) {
				t = s / 2;
			} else {
				t = 3 * s + 1;
			}
			if(list.contains(t)) {
				System.out.println(cnt);
				return;
			}
			list.add(t);
			s = t;
		}
	}
}
