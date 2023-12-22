import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		while(sc.hasNextLine()){

			int  maxNumber= sc.nextInt();
			int sum = sc.nextInt();
			
			if(maxNumber == 0 && sum == 0){
				break;
			}
			
			setNumCombinations(maxNumber, sum);
		}
		

		printAllNumCombinations();
	}
	
	private static int findCombinations(int maxNumber, int sum){
		int numCombinations = 0;
		for(int i = 1; i < maxNumber - 1; i++){
			for(int j = i + 1; j < maxNumber; j++){
				for(int k = j + 1; k < maxNumber + 1; k++){
					if(isSame(i, j, k, sum)){
						numCombinations++;
					}
				}
			}
		}
		return numCombinations;
	}
	
	private static boolean isSame(int a, int b, int c, int sum){
		if(sum == a + b + c){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static void setNumCombinations(int maxNumber, int sum){
		result.add(findCombinations(maxNumber, sum));
	}
	
	private static void printNumCombinations(int i){
		System.out.println(result.get(i));
	}
	
	private static void printAllNumCombinations(){
		for(int i = 0; i < result.size(); i++){
			printNumCombinations(i);
		}
	}
}