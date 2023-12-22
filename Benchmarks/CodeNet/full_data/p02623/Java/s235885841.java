import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			long k = sc.nextLong();

			long[] aBooks = new long[n];
			long[] bBooks = new long[m];
			
			long[] bSum = new long[m];

			for(int i = 0 ; i < n ; i++ ) {
				aBooks[i] = sc.nextLong();
			}

			for(int i = 0 ; i < m ; i++ ) {
				bBooks[i] = sc.nextLong();
				if ( i == 0 ) {
					bSum[i] = bBooks[i];
				}
				else {
					bSum[i] = bBooks[i] + bSum[i-1];
				}
				
			}

			long takeA = 0;
			int max = 0;
			int maxB = m-1;
			for(int i = -1 ; i < n ; i++ ) {
				
				int readed = i+1;
				if ( i > -1 ) {
					takeA += aBooks[i];
				}
				if ( takeA > k ) {
					break;
				}
				
				
//				System.out.println("## " + takeA);
				
				long rest = k - takeA;
//				for(int j = 0 ; j < m ; j++ ) {
//					if ( bBooks[j] <= rest ) {
//						rest -= bBooks[j];
//						readed++;
//					}
//					else {
//						break;
//					}					
//				}
				while ( maxB >= 0 && bSum[maxB] > rest ) {
					maxB--;
				}
//				System.out.println(maxB);
				
				readed += maxB+1;
				
				if ( readed > max) {
					max = readed;
				}
			}
			
			System.out.println(max);
		}
	}

}