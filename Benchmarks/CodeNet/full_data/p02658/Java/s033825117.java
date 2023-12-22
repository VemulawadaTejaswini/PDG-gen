import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int factors = scanner.nextInt();
      	long result = 1l;
      	int result2 = 1;
      	long limit = (long) Math.pow(10, 18);
      	for(int i = 0; i < factors; i++) {
      		long factor = scanner.nextLong();
      		result *= factor;
      		if(factor == 0)
      			result2 = 0;
      		if(result > limit || result <= 0)
        		result = 0;
      	}
      	
      	if(result2 == 0)
      		System.out.print(result2);
      	else if(result != 0)
      		System.out.print(result);
      	else
      		System.out.print(-1);
	}
}