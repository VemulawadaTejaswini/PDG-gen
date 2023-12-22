import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long fact = factorial(sc.nextLong());
		System.out.println(fact);
	}
	
	public static long factorial(long fact){
		if(fact == 0){
			fact = 1;
		}else{
			for(int i = fact-1;i >= 1;i--){
				fact *= i;
			}
		}
		return fact;
	}
}