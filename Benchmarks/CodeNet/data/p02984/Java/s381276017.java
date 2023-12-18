import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int left = 0, mid = a[0] / 2, right = a[0];
		while(true) {
			List<Integer> li = new ArrayList<>();
			int[] _a = a.clone();
			_a[0] -= mid;
			_a[n - 1] -= mid;
			li.add(mid);
			for(int j = 0; j < n - 1; j++) {
				int num = _a[j];
				_a[j] -= num;
				_a[j + 1] -= num;
				li.add(num);
			}
			//System.out.println(Arrays.toString(_a));
			if(_a[n - 1] == 0) {
				for(int i : li) {
					System.out.print(i * 2 + " ");
				}
				System.out.println();
				return;
			}
			else if(_a[n - 1] < 0) {
				right = mid - 1;
				mid = (right + left) / 2;
			}
			else {
				left = mid + 1;
				mid = (right + left) / 2;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
