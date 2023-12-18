import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int m = 0;
	static int[] p = null;
	static int[] y = null;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		p = new int[m];
		y = new int[m];
		ArrayList<ArrayList<Integer>> yd = new ArrayList<>();
		for(int i = 0; i <= n; ++i) yd.add(new ArrayList<Integer>());
		
		for(int i = 0; i < m; ++i) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();
			yd.get(p[i]).add(y[i]);
		}
		
		for(int i = 0; i <= n; ++i) {
			Collections.sort(yd.get(i));
		}
		
		for(int i = 0; i < m; ++i) {
			int upper = p[i];
			int lower = bs(yd.get(p[i]), y[i]) + 1;
			System.out.printf("%06d%06d\n", upper, lower);
		}
	}
	
	static int bs(ArrayList<Integer> list, int key) {
		int left = -1;
		int right = list.size();
		while(right - left > 1) {
			int mid = right - (right - left) / 2;
			if(list.get(mid) > key) right = mid;
			else left = mid;
		}
		return left;
	}
}