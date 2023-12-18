import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int numPerson = sc.nextInt();
		int initialPoint = sc.nextInt();
		int problemCount = sc.nextInt();
		
		int[] personPoints = new int[numPerson];
		for(int i = 0 ; i < numPerson ; i++ ) {
			personPoints[i] = initialPoint - problemCount;
		}
		
		for(int i = 0 ; i < problemCount ; i++ ) {
			int numOfPerson = sc.nextInt();
			personPoints[numOfPerson - 1]++;
		}
		
		for(int i = 0 ; i < numPerson ; i++ ) {
			System.out.println(personPoints[i] > 0 ? "Yes" : "No");
		}
		
	}
}