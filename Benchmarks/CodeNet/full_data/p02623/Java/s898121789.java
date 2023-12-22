import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long acnt = scn.nextLong();
			long bcnt = scn.nextLong();
			long min = scn.nextLong();
			List<Long> alist = new ArrayList<>();
			List<Long> blist = new ArrayList<>();
			for(int i=0; i<acnt; i++) {
				long v = scn.nextLong();
				alist.add(v);
			}
			for(int i=0; i<bcnt; i++) {
				long v = scn.nextLong();
				blist.add(v);
			}
			check(min, alist, blist);
		}
	}

	public static void check(long min, List<Long> alist, List<Long> blist) {
		int cnt = 0;
		long sum = 0L;
		boolean isA = false;
		Long anum = alist.remove(0);
		Long bnum = blist.remove(0);
		while(true) {
			Long num = null;
			if(anum != null) {
				num = bnum == null || anum <= bnum ? anum : bnum;
			} else {
				// anum == null
				num = bnum;
			}
			if(num == null) {
				break;
			}
			isA = num.equals(anum);
			if(isA) {
				anum = alist.isEmpty() ? null : alist.remove(0);
			} else {
				bnum = blist.isEmpty() ? null : blist.remove(0);
			}

			sum += num;
			if(min < sum) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
