import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < n; i ++) {
			a.add(sc.nextInt());
			b.add(sc.nextInt());
		}
		long r = 0;

		boolean teban = true;
		for(int i = 0; i < n; i ++) {
			if(teban) {
				int max = a.get(0) - b.get(0);
				int index = 0;
				for(int j = 0; j < a.size(); j ++) {
					if(a.get(j) + b.get(j) >= max) {
						if(a.get(j) >= a.get(index)) {
							max = a.get(j) - b.get(j);
							index = j;
						}
					}
				}
				r += a.get(index);
				a.remove(index);
				b.remove(index);
				teban = false;
			}else {
				int max = a.get(0) - b.get(0);
				int index = 0;
				for(int j = 0; j < a.size(); j ++) {
					if(a.get(j) + b.get(j) >= max) {
						if(b.get(j) >= b.get(index)) {
							max = a.get(j) - b.get(j);
							index = j;
						}
					}
				}
				r -= b.get(index);
				a.remove(index);
				b.remove(index);
				teban = true;
			}
		}
		System.out.println(r);


	}
}
