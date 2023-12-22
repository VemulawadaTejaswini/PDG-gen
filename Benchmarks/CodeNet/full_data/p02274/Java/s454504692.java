import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		int[] sequence = new int[n];
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
		}
		scan.close();
		
		bubbleSort(sequence);
		
	}
	
	static void bubbleSort (int[] sequence) {
		long cnt = 0;
		int n = sequence.length - 1;
		
		for (int i = 0; i < n; i++) {
			
			cnt += (long)Inversions(i, sequence, n);
		}
		
		System.out.println(cnt);
	}
	
	static int Inversions (int i, int[] sequence, int n) {
		int cnt = 0;
		
		for (int j = i + 1; j < n ; j++) {
			if ( sequence[i] > sequence[j]) {
				cnt++;
			}
		}
		
		return cnt;
	}
}

