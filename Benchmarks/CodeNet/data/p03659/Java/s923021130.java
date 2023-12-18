import java.util.Scanner;
import java.util.Arrays;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] cards = new int[NUM];
		int allSum = 0;
		for(int i = 0; i < NUM; i++){
			cards[i] = scan.nextInt();
			allSum += cards[i];
		}
		
		// sort
		Arrays.sort(cards);
		
		// search
		int sunuke = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < NUM - 1; i++){
			sunuke += cards[i];
			if(Math.abs((allSum - sunuke) - sunuke) < min){
				min = Math.abs((allSum - sunuke) - sunuke);
			}
		}
		
		// answer
		System.out.println(min);
		
	}
}