import java.math.BigInteger;
import java.util.*;
public class Main
 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(factorial(num));
		

	}

	public static int factorial(int number) 
	{ 
	   BigInteger factorial = BigInteger.ONE; 
	   for (int i = number; i > 0; i=i-2) 
	   { 
		   factorial = factorial.multiply(BigInteger.valueOf(i));
	   }
	   int count=0;
	   String s=String.valueOf(factorial);
	   for(int i=s.length()-1;i>0;i--)
	   {
		   if(s.charAt(i)=='0')
			   count++;
		   else
			   break;
		     
	   }
	   return count;
	   
	 }

	

}
