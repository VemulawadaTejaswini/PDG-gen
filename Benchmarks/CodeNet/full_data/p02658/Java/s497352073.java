import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int factorAmount = scanner.nextInt();
      	long[] factors = new long[factorAmount];
      	for(int i = 0; i < factorAmount; i++) {
      		factors[i] = scanner.nextLong(); 
      	}
      	
      		System.out.print(Calculate(factors));
	}
	
	private static long Calculate(long[] numbers) {
		long result = 1l;
      	long limit = (long) Math.pow(10, 18);
      	for(int i = 0; i < numbers.length; i++) {
      		long factor = numbers[i];
      		if(factor == 0)
      			return 0;
     		if ((factor * result) > limit || (factor * result) < result)
      		return -1; 
     		result *= factor;
      	}
      	
		return result;
	}
}