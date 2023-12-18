import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Long> h = new ArrayList<>();
int t=0;
		for (int i = 0; i < n; i++) {
			x.add(sc.nextInt());
			y.add(sc.nextInt());
			h.add(sc.nextLong());
			if(h.get(i)!=0) {
				t=i;
			}
		}
		ArrayList<Integer> sx = new ArrayList<>();
		ArrayList<Integer> sy = new ArrayList<>();
		ArrayList<Long> sh = new ArrayList<>();
		long H = 0;

		for (int tx = 0; tx <= 100; tx++) {
			for (int ty = 0; ty < 100; ty++) {
				H = h.get(t) + Math.abs(x.get(t) - tx) + Math.abs(y.get(t) - ty);
				boolean ch=true;
				for (int i = 0; i < n; i++) {
					if (h.get(i) != Math.max(H - Math.abs(x.get(i) - tx) - Math.abs(y.get(i) - ty), 0));
						ch=false;
						break;
				}
				if(ch) {
					System.out.println(tx+" "+ty+" "+H);
					return;
				}
			}

		}
	}
}