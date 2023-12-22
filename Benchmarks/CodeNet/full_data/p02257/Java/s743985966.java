import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		int i, size, count = 0;
		List<Integer> numbers = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);
		
		size = Integer.parseInt(in.nextLine());
		for(i = 0; i < size; i++) numbers.add(Integer.parseInt(in.nextLine()));

		for(i = 0; i < size; i++){
			if(isPrime(numbers.get(i)) == true) count++;
		}
		System.out.println(count);
		}
	
	private static boolean isPrime(int number){
		int i;
		int route = (int)Math.sqrt(number) + 1;

		if(number == 1) return false;

		for(i = 2; i < route; i++){
			if(number % i == 0) return false;
		}
		return true;	
	}
}