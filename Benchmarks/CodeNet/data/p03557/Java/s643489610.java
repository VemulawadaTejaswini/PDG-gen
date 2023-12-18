
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Long> a = new ArrayList<>();
		ArrayList<Long> b = new ArrayList<>();
		ArrayList<Long> c = new ArrayList<>();
		for(int i=0; i<n; i++) a.add(sc.nextLong());
		for(int i=0; i<n; i++) b.add(sc.nextLong());
		for(int i=0; i<n; i++) c.add(sc.nextLong());

		Collections.sort(a);
		Collections.sort(b);
		Collections.sort(c);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		long sum = 0;
		for(int i=0; i<n; i++) {
			long bx = b.get(i);
			int ai = lowerbound(a, bx);
			int ci = upperbound(c, bx);
			long acnt = ai;
			long ccnt = c.size()-ci;
			sum += acnt*ccnt;
		}
		System.out.println(sum);
		sc.close();
	}

	private int upperbound(ArrayList<Long> list, long x) {
		int l=-1;
		int r=list.size();
		while(l+1<r) {
			int m=(l+r)/2;
			if(list.get(m) <= x) {
				l=m;
			}else {
				r=m;
			}
		}
		return l+1;
	}
	private int lowerbound(ArrayList<Long> list, long x) {
		int l=-1;
		int r=list.size();
		while(l+1<r) {
			int m=(l+r)/2;
			if(list.get(m) < x) {
				l=m;
			}else {
				r=m;
			}
		}
		return l+1;
	}
}
