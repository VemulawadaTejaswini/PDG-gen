import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		int[] S;
		int[] T;
		int C = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		int S_length = keyboard.nextInt();
		S = new int[S_length];
		
		keyboard.nextLine();
		
		String S_inputString = keyboard.nextLine();
		
		Scanner S_input = new Scanner(S_inputString);
		
		int T_length = keyboard.nextInt();
		T = new int[T_length];
		
		keyboard.nextLine();
		
		String T_inputString = keyboard.nextLine();
		
		Scanner T_input = new Scanner(T_inputString);
		
		for(int i = 0; i < S_length; i++) {
			S[i] = S_input.nextInt();
		}
		
		for(int i = 0; i < T_length; i++) {
			T[i] = T_input.nextInt();
		}
		
		for(int i = 0; i < T.length; i++) {
			if(contains(T[i], S)) C++;
		}
		
		System.out.println(C);
		
	}
	
	public static boolean contains(int query, int[] check) {
		
		boolean containsInt = false;
		
		int low_index = 0;
		int high_index = check.length - 1;
		int middle_index = check.length / 2;
//		int iteration = 0;
		
		while(containsInt == false && high_index - low_index > 1) {
			
//			iteration++;
//			
//			System.out.println("----------------");
//			System.out.println("Query: " + query);
//			System.out.println("Iteration: " + iteration);
//			System.out.println("L: " + low_index);
//			System.out.println("M: " + middle_index);
//			System.out.println("H: " + high_index);
			
			if(check[middle_index] == query) {
				containsInt = true;
			}
			else if(check[middle_index] > query) {
				high_index = middle_index;
				middle_index = (high_index + low_index) / 2;
			}
			else if(check[middle_index] < query) {
				low_index = middle_index;
				middle_index = (high_index + low_index) / 2;
			}
			
		}
		
		if(check[high_index] == query) {
			containsInt = true;
		}
		
		return containsInt;
		
	}
}
