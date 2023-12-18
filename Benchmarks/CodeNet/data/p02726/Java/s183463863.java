import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //GRAPH IS BIDIRECTIONAL
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int X = input.nextInt();
		int Y = input.nextInt();
		int[] dp = new int[N];
		for (int START = 1; START<=N; START++) {
			for (int END = START+1; END<=N; END++) {
				/*if (X>=START&&Y<=END) {
					int index = X-START;
					index+=END-Y;
					index++;
					dp[index]++;
					//System.out.println(START+","+END+" = "+index);
				}
				else {
					dp[END-START]++;
					//System.out.println(START+","+END+" = "+(END-START));
				} */ 
				int curIndex = END-START;
				curIndex = Math.min(curIndex, AB(START,X)+AB(END,Y)+1);
				dp[curIndex]++;
			}
		}
		for (int i = 1; i < N; i++) {
			System.out.println(dp[i]);
		}
	}	
	public static int AB(int A, int B) {
		return Math.abs(A-B);
	}
}