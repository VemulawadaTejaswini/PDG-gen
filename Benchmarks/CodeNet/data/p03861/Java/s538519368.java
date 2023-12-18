import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextLong();
		long b=sc.nextLong();
		long x=sc.nextLong();
		
		long result=func(b,x)-func(a-1,x);
		
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

