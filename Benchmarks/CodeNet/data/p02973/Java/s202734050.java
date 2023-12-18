import java.util.*;
public class Main {
	static ArrayList<Long> max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long array[] = new long[num];
		for(int i = 0; i < num; i ++) {
			array[i] = sc.nextLong();
		}
		max = new ArrayList<>();
		for(int i = 0; i < num; i ++) {
			int index = bisect(array[i]);
			if(index == max.size()) {
				max.add(array[i]);
			}else {
				max.set(index, array[i]);
			}
		}
		System.out.println(max.size());
	}

	static int bisect(long key) {
		int ng = -1;
		int ok = max.size();
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if(isOK(mid, key)) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	static boolean isOK(int index, long key) { return max.get(index) < key; }
}