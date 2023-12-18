import java.util.*;

public class Main {
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = in.nextInt();
		int[] yield = new int[n];
		int[] toss = new int[n];
		for ( int i = 0; i < n; i++ ) {
			yield[i] = in.nextInt();
			toss[i] = in.nextInt();
			in.nextLine();
		}
		
		int sumToss = 0;
		for ( int i = 0; i < n; i++ ) {
			sumToss += toss[i];
		}
		
		Arrays.sort(yield);
		
		int attacks = 0;
		int yieldTarget = h - sumToss; 
		int attackTotal = 0;
		
		if ( yieldTarget <= 0 ) {
			System.out.println(n);
		} else {
			while ( h > 0 ) {
				while ( yieldTarget > attackTotal ) {
					attacks++;
					attackTotal += yield[n-1];
					h -= yield[n-1];
					
					// System.out.println(attacks);
					// System.out.println(h);
					// System.out.println(attackTotal);
				}
				System.out.println(attacks+n);
				break;
			}
		}
		
	}
}