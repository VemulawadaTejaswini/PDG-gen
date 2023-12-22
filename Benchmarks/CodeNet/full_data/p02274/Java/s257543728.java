import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		long[] sequence = new long[n];
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
		}
		scan.close();
		
		bubbleSort(sequence);
		
	}
	
	static void bubbleSort (long[] sequence) {
		long cnt = 0;
		int n = sequence.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = i+ 1;  j < n; j++) {
				if ( sequence[i] > sequence[j] && i < j) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}

