import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {


			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] pArray = new int[n];
			long[] cArray = new long[n];

			for(int i = 0 ; i < n ; i++ ) {
				pArray[i] = sc.nextInt();
			}

			for(int i = 0 ; i < n ; i++ ) {
				cArray[i] = sc.nextLong();
			}

			long max = Long.MIN_VALUE;
			//calc by start point
			for(int i = 0 ; i < n ; i++ ) {

				int cnt = 0;
				int po = i;
				long score = 0;
				long iMax = Long.MIN_VALUE;
				
				while(cnt < k) {
					//next position
					po = pArray[po] - 1;
					cnt++;
					score += cArray[po];
					if ( score > max ) {
						max = score;
					}
					if ( score > iMax) {
						iMax = score;
					}
					if ( po == i ) {
						//found loop
						if ( score >= 0 ) {							
							int loopCnt = k / cnt;
							long addedScore = score * (loopCnt-1);
							score += addedScore;
							cnt += (loopCnt-1) * cnt;
							if ( iMax + addedScore > max ) {
								max = iMax + addedScore;
							}
							if ( score > max ) {
								max = score;
							}
							
						}
						else {
							//loop total is negative, repetition is waste
							break;
						}
					}
				}
			}
			
			System.out.println(max);

		}
	}

}