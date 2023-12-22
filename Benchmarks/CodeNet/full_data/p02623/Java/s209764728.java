import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long acnt = scn.nextLong();
			long bcnt = scn.nextLong();
			long min = scn.nextLong();
			List<Long> alist = new ArrayList<>();
			//List<Long> blist = new ArrayList<>();
			for(int i=0; i<acnt; i++) {
				long v = scn.nextLong();
				if(v <= min) {
					alist.add(v);
				}
			}
			for(int i=0; i<bcnt; i++) {
				long v = scn.nextLong();
				if(v <= min) {
					alist.add(v);
				}
			}
			check(min, alist);
		}
	}

	public static void check(long min, List<Long> alist) {
		int cnt = 0;
		Collections.sort(alist);
		long sum = 0;
		for(int idx = 0; idx < alist.size(); idx++) {
			long v = alist.get(idx);
			sum += v;
			if(min < sum) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
