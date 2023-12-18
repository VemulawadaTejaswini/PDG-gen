
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt()-1;
		}
		List<Integer> set = new ArrayList<>();
		int pos = 0;
		int cycleStart = 0;
		int cycleEnd = n;
		set.add(0);
		for (int i = 0; i < n; i++) {
			
			int index = set.indexOf(a[pos]);
			if( index != -1 ) {
				cycleStart = index;
				cycleEnd = i+1;
				break;
			}
			set.add(a[pos]);
			pos = a[pos];
		}
		
		long fixK = (k - cycleStart) % ( cycleEnd - cycleStart ) + cycleStart;
		
		System.out.println( set.get((int)fixK) + 1);
		
	}

}
