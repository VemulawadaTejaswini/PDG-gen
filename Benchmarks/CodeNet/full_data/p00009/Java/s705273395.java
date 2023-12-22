import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		final int N = 9;
		Scanner in = new Scanner(System.in);

		PrimeGenerater gen = new PrimeGenerater(999999);

		while(in.hasNext()) {
			int d = in.nextInt();
			System.out.printf("%d\n", gen.countPrimeTo(d));
		}
	}
}

class PrimeGenerater {
	List<Integer> isPrimeTable;
	int n = 0;
	public PrimeGenerater(int n) {
		this.n = n;
		initPrimeTable();
		generatePrimeTable();
	}

	private void initPrimeTable() {
		isPrimeTable = new ArrayList<Integer>(n);
		for(int i=0;i<=n;i++) {
			isPrimeTable.add(1);
		}
	}

	private void generatePrimeTable() {
		for(int i=2;i<=n;i++) {
			if(isPrimeTable.get(i) == 0) continue;
			// Sieve of Eratosthenes
			for(int d=2;;d++) {
				int idx = i*d;
				if(idx > n) break;
				isPrimeTable.set(idx, 0);
			}
		}
	}

	public int countPrimeTo(int to) {
		int ret = 0;
		for(int i=2;i<=to;i++) {
			if(isPrimeTable.get(i) == 1) ret++;
		}
		return ret;
	}
}