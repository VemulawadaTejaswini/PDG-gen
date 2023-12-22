import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);

		double r=scan.nextDouble();
		double sum1=0;
		double sum2=0;
		
		sum1=r*r*3.14;
		sum2=r*2*3.14;
		
		System.out.println(sum1+" "+sum2);
		
	}
}