import java.util.*;

public class Main {

	static int[] blockNumber = new int[31];
	static int maxBlock;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		while(input != 0) {
			maxBlock = input;
			searchBlock(0, maxBlock, maxBlock);
			input = sc.nextInt();
		}
	}
	
	public static void searchBlock(int depth, int nowCount, int nowBlock) {
		if (nowCount == 0) {
			if (nowBlock == 0) {
				showArray(depth);
			}
			return;
		}
		
		for(int b = nowCount; b >= 0; b--) {
			if (nowBlock - b >= 0) {
				blockNumber[depth] = b;
				searchBlock(depth + 1, b, nowBlock - b);
			}
		}
	}
	
	public static void showArray(int end) {
		if (end == 1) {
			System.out.println(blockNumber[0]);
			return;
		}
		
		System.out.print(blockNumber[0]);
		for(int i = 1; i < end - 1; i++) {
			System.out.print(" " + blockNumber[i]);
		}
		System.out.println();
	}
}