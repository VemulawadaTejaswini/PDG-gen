import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long sum =A^A+1;
		
		for(long i = A+2;i<=B;i++) {
			sum = sum^i;
			
		}
		if(A==B)System.out.println(A);
		else System.out.println(sum);
		
		
		
	}
	
		}
		
		
		