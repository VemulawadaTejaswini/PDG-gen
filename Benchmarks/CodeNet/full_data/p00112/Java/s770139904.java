import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Long> arrayList = new ArrayList<Long>();
		int n;
		
		n = scanner.nextInt();
		while(n > 0) {
			arrayList.clear();
			for(int i = 0; i < n; i++) {
				long v = scanner.nextLong();
				arrayList.add(Long.valueOf(v));
			}
			Collections.sort(arrayList);

			int wt = 0, ret = 0;
			for(int i = 0; i < n - 1; i++) {
				wt += arrayList.get(i);
				ret += wt;
			}
			System.out.println(ret);
			n = scanner.nextInt();
		}
	}
}