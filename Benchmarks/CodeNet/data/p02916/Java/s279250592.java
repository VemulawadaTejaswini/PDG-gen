import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] order = new int[n];
		int[] satisfied = new int[n];
		int[] additinalSatisfied = new int[n];
		
		int firstFoodOrder = 0;
		for(int i = 0 ; i < n ; i++ ) {
			order[i] = sc.nextInt();
			if ( i == 0 ) {
				firstFoodOrder = order[i];
			}
		}
		
		for(int i = 0 ; i < n ; i++ ) {
			satisfied[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n-1 ; i++ ) {
			additinalSatisfied[i+1] = sc.nextInt();
		}
	
		additinalSatisfied[firstFoodOrder-1] = 0;
		
		int sum = 0;
		sum += Arrays.stream(satisfied).sum();
		sum += Arrays.stream(additinalSatisfied).sum();
		
		System.out.println(sum);
		
	}
}