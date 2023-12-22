import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int memory;
		
		int[] numbers = new int[3];
		numbers[0] = in.nextInt();
		numbers[1] = in.nextInt();
		numbers[2] = in.nextInt();
		
		if(numbers[0] >= numbers[1]){
			memory = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = memory;
		}
		if(numbers[1] >= numbers[2]){
			memory = numbers[1];
			numbers[1] = numbers[2];
			numbers[2] = memory;
		}
		if(numbers[0] >= numbers[1]){
			memory = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = memory;
		}
		
		System.out.println(numbers[0] + " " + numbers[1] + " "  + numbers[2]);
	}
}