import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		final int[] sequence = new int[n];
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
		}
		
		final int q = scan.nextInt();
		
		for ( int i = 0; i < q; i++) {
			final int m = scan.nextInt();
			makeCombination(m, sequence);
		}
		scan.close();
	}
	
	static void makeCombination(int m, int[] data) {
		int count = 0;
		int sum = 0;
		
		count += rec (data, 0, m, sum, false);
		count += rec (data, 0, m, sum, true);
		
		if (count > 0) System.out.println("yes");
		else System.out.println("no");
		
		
	}
	
	static int rec (int[] data, int i, int m, int sum, boolean flg) {
		
		int n = data.length;
		int count = 0;
		
		if (flg == true) {
			sum += data[i];
		}
		
		if ( i == n - 1) {
			if ( m == sum) {
				return 1;
			} else {
				return 0;
			}
		}
		
		i++;
		count += rec(data, i, m, sum, false);
		if (count > 0) {
			return 1;
		}
		count += rec(data, i, m, sum, true);
		if (count > 0) {
			return 1;
		} 
		
		
		return 0;
		
	}
}

