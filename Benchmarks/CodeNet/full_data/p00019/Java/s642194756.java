import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fact = factorial(sc.nextInt());
		System.out.println(fact);

	}

	public static int factorial(int fact){
		if(fact != 0){
			for(int i = fact-1;i >= 1;i--){
				fact *= i;
			}
		}
		return fact;
	}
}