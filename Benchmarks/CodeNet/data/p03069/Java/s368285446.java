import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		int[] black = new int[N + 1];
		int[] white = new int[N + 1];
		int bcount = 0;
		int wcount = 0;
		int[] bwsum = new int[N + 1];
		
		int min = 2 * 10^5 + 1;
		
		for(int i = 0; i < N + 1; i++) {
			for(int j = 0; j < i; j++) {
				if(S.charAt(j) == '#') {
					bcount++;
				}		
			}
			black[i] = bcount;
			bcount = 0;
			for(int j = i; j < N + 1; j++) {
				if(j != N) {
					if(S.charAt(j) == '.') {
						wcount++;
					}
				} 
			}
			white[i] = wcount;
			wcount = 0;
			bwsum[i] = black[i] + white[i];
			min = Math.min(bwsum[i], min);
		}
		
		System.out.println(min);

	}
}
