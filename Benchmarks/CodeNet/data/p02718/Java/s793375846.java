import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] As = new int[N];
		int totalVotes = 0;
		for(int i = 0; i < N; i ++) {
			As[i] = stdIn.nextInt();
			totalVotes += As[i];
		}
		
		double th = totalVotes / (4 * M);
		int buyNum = 0;
		boolean canBuy = false;
		
		for(int i = 0; i < As.length; i ++) {
			if(th < As[i]) {
				buyNum ++;
				if(buyNum == M) {
					canBuy = true;
					break;
				}
			}
		}
		
		if(canBuy) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
