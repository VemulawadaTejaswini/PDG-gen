
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final int MAX_NUM_INPUTS = 5000;
	private static Scanner sc = new Scanner(System.in);
	private static int[] sequence = new int[MAX_NUM_INPUTS];
	private static ArrayList<Long> maxSums = new ArrayList<Long>();
	
	public static void main(String[] args) {
		while(true){
			int numNumbers = sc.nextInt();
			if(numNumbers == 0){
				break;
			}
			for(int i = 0; i < numNumbers; i++){
				sequence[i] = sc.nextInt();
			}
			maxSums.add(getMaxSumSequence(sequence, numNumbers));
		}
		
		for(int i = 0; i < maxSums.size(); i++){
			System.out.println(maxSums.get(i));
		}
	}
	
	public static long getMaxSumSequence(int[] sequence, int numNumbers){
		long maxSum = 0;
		int pointerRight = numNumbers - 1;
			for(int i = 0; i < pointerRight + 1; i++){
				long tmp = 0;
				for(int j = pointerRight; j > i - 1; j--){
					tmp += sequence[j];
				}
				if(maxSum < tmp){
					maxSum = tmp;
				}
			}
		
		return maxSum;
	}
}