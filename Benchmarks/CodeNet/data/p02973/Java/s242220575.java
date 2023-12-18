import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(A[0]);
		List<Integer> ls = new ArrayList<>();
		ls.add(A[0]);
		for(int i = 1; i < N; i++) {
			if(A[i] <= ts.first()) {
				ts.add(A[i]);
				ls.add(A[i]);
			}
			else {
				ts.add(A[i]);
				int x = ts.lower(A[i]);
				ts.remove(x);
				ls.add(A[i]);
				ls.remove(Integer.valueOf(x));
				if(ls.contains(x))
					ts.add(x);
			}
		}
		System.out.println(ls.size());

	}

}