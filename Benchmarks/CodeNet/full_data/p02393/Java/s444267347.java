import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		long[] inputs = new long[3];
		for(int i = 0; i < 3; i++){
			inputs[i] = sc.nextLong();
		}
		
		Arrays.sort(inputs);
		
		
		for(int i = 0; i < 3; i++){
			System.out.print(inputs[i] + ((i != 2) ? " " : ""));
		}
		System.out.println();
		
		
	}
	
}