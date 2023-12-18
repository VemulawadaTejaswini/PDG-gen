import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] numStrArr = sc.nextLine().split(" ");
		long[] numArr = new long[numStrArr.length];
		sc.close();
		
		for(int i = 0 ; i < numStrArr.length; i++) {
			numArr[i] = Long.parseLong(numStrArr[i]);
		}
		
		long notInterested = numArr[0];
		for(int i = 1; i < numStrArr.length; i++) {
			notInterested ^= numArr[i];
		}
		
		long interest = ~notInterested;
		long[] interestBitArr = new long[numArr.length];
		for(int i = 0; i < numArr.length; i++) {
			interestBitArr[i] = numArr[i] & interest;
		}
		
		int rank = 0;
		for(int i = 59; i >= 0; i--) {
			long nowBit = (1L << i);
			int j;
			for(j = rank; j < n; j++) {
				if((interestBitArr[j] & nowBit) > 0) {
					break;
				}
			}
			
			if(j == n) {
				continue;
			}
			
			if(j != rank) {
				interestBitArr[rank] ^= interestBitArr[j]; 
			}
			
			for(int k = rank + 1; k < n;k++) {
				if((interestBitArr[k] & nowBit) > 0) {
					interestBitArr[k] = interestBitArr[k] ^ interestBitArr[rank];
				}
			}
			rank++;
		}
		
		long interestXor = 0;
		
		for(int i = 0; i < interestBitArr.length; i++) {
			if(interestXor < (interestXor ^ interestBitArr[i])) {
				interestXor ^= interestBitArr[i];
			}
		}
		
		long maxPoint = 2 * interestXor + notInterested;
		
		System.out.println(maxPoint);
		
	}
}
