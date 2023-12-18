import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextInt();
		long b=sc.nextInt();
		long x=sc.nextInt();
		
		long result=func(b,x)-func(a,x);
		
		System.out.println(result);
		
		
		sc.close();


	}

	public static long func(long n,long x) {
		
		if(n>=0) {
			return n/x+1;
		}else {
			return 0;
		}
		
	}

}

