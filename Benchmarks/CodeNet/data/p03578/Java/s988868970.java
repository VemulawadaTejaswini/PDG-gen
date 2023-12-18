import java.util.*;
//atCoder用
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> d = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			d.add(sc.nextInt());
		}
		int m = sc.nextInt();
		ArrayList<Integer> t = new ArrayList<Integer>();
		for (int i=0; i<m; i++) {
			t.add(sc.nextInt());
		}
		String ans = "YES";
		for (int j=0; j<m; j++) {
			int flag = 0;
			for (int i=0; i<n; i++) {
				if (d.get(i) == t.get(j)) {
					d.set(i, 0);
					flag = 1;
					break;
				}
			}
			if (flag==0) {
				ans = "NO";
				break;
			}
		}
		System.out.println(ans);
	}
}
