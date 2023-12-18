import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			list.add(sc.nextInt());
		}
		List<Integer> sorted = (List<Integer>)list.clone(); 
		Collections.sort(sorted);

		int max = sorted.get(n - 1);
		int maxMinus1 = sorted.get(n - 2);
		for(int i = 0; i < n; i++) {
			int ai = list.get(i);
			if (ai != max) {
				System.out.println(max);
			} else {
				System.out.println(maxMinus1);
			}
		}
	}
}