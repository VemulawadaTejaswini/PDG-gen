import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numS = sc.nextInt();
		int numT = sc.nextInt();
		int numQ = sc.nextInt();
		long shrine[] = new long[numS + 2];
		for(int i = 0; i < numS; i ++) {
			shrine[i] = sc.nextLong();
		}
		shrine[numS] = - (long)Math.pow(10, 12);
		shrine[numS + 1] = (long)Math.pow(10, 12);
		Arrays.sort(shrine);
		long temple[] = new long[numT + 2];
		for(int i = 0; i < numT; i ++) {
			temple[i] = sc.nextLong();
		}
		temple[numT] = - (long)Math.pow(10, 12);
		temple[numT + 1] = (long)Math.pow(10, 12);
		Arrays.sort(temple);
		for(int i = 0; i < numQ; i ++) {
			long ques = sc.nextLong();
			int tmpS = bisect(shrine, ques);
			int tmpT = bisect(temple, ques);
			long min = Long.MAX_VALUE;
			for(int j = 0; j < 4; j ++) {
				long sh = shrine[tmpS - j % 2];
				long tm = temple[tmpT - (j < 2 ? 0 : 1)];
				min = Math.min(min, Math.min(Math.abs(sh - ques), Math.abs(tm - ques))
					+ Math.abs(sh - tm));
			}
			System.out.println(min);
		}
	}

	static int bisect(long array[], long key) {
		int ng = -1;
		int ok = array.length;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if(isOK(array, mid, key)) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	static boolean isOK(long array[], int index, long key) { return array[index] >= key; }
}