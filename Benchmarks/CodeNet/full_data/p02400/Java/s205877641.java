import java.util.Scanner;
import java.math.BigDecimal;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		double r=scan.nextDouble();
		double sum1=0;
		double sum2=0;
				
		sum1=r*r*3.141592653589;
		sum2=r*2*3.141592653589;
		
		System.out.println(sum1+" "+sum2);
		
	}
}