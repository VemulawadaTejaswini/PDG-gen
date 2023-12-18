import java.io.*;
import java.util.*;

public class Main {

	private void compute(){

		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0;i<n;i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		
		long max = 0;
		for (int r=0;r<2;r++) {
			long buf = 0;
			int bef = -1;
			for (int i=0;i<n;i++) {
				int b;
				if (i == 0) {
					b = list.get(n/2);
				} else if (i % 2 == 0) {
					b = list.get(n-i/2);
				} else {
					b = list.get(i/2);
				}
				if (bef != -1)
					buf += abs(bef - b);
						
				bef = b;
			}
			Collections.reverse(list);
			if (buf > max)
				max = buf;
		}
		System.out.println(max);
	}
	
	int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}