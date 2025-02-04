import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	long factors = scanner.nextLong();
      	long result = 1l;
      	int result2 = 1;
      	long limit = (long) Math.pow(10, 18);
      	for(long i = 0l; i < factors; i++) {
      		long factor = scanner.nextLong();
      		result *= factor;
      		if(factor == 0)
      			result2 = 0;
      		if(result > limit || result <= 0l)
        		result = 0l;
      	}
      	
      	if(result2 == 0)
      		System.out.print(result2);
      	else if(result != 0)
      		System.out.print(result);
      	else
      		System.out.print(-1);
	}
}