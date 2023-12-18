import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			double[] xArray = new double[n];
			double[] yArray = new double[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				xArray[i] = sc.nextDouble();
				yArray[i] = sc.nextDouble();
			}
			
			double sum = 0f;
		
			for(int i = 0 ; i < n ; i++ ) {
				List<Integer> remainingNodes = new ArrayList<>();
				for(int j = 0 ; j < n ; j++ ) {
					if ( i != j ) {
						remainingNodes.add(j);
					}
				}
				
				sum += calc(xArray, yArray, i, remainingNodes);
				
			}
			
			//calc pattern
			double p = calcPermutation(n);
			
			System.out.println(sum / p);
		}
	}
	
	private static double calcPermutation(int n) {
		if ( n == 0 || n == 1 ) { 
			return 1f;
		}
		else {
			return calcPermutation(n-1) * n;
		}
	}
	
	private static double calc(double[] xArray, double[] yArray, int startIndex, List<Integer> remainingNodes) {
		if ( remainingNodes.size() == 0 ) {
			return 0f;
		}
		
		double sum = 0f;
		for(int i  : remainingNodes ) {
			List<Integer> copiedRemainingNodes = new ArrayList<>(remainingNodes);
			copiedRemainingNodes.remove(new Integer(i));
			
			double p = calcPermutation(copiedRemainingNodes.size());
			
			sum += p * dist(xArray, yArray,startIndex, i) + calc(xArray, yArray, i, copiedRemainingNodes);
		}
		
		return sum;
	}
	
	private static double dist(double[] xArray, double[] yArray, int startIndex, int endIndex) {
		return Math.pow(Math.pow((xArray[startIndex] - xArray[endIndex]), 2) + Math.pow((yArray[startIndex] - yArray[endIndex]), 2), 0.5);
	}
	
}