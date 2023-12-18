import java.util.*;

class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(div);
		long sum = 0;
		for (int i =0 ;i<n ;i++ ) 
		{
			int aa = s.nextInt();
			sum+=aa;	
		}
		long ans  = sum;
		System.out.println(ans/2);
		/*
		long mul = (long)(Math.pow(2,n-1)) ;
		ans = ans*mul;
		// System.out.println(ans);
		long div = (long)(Math.pow(2,n)) - 1;
		System.out.println(ans/div);
		*/


	}
}