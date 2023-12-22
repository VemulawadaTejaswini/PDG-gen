import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		String str;
		
		int sum1=a/b;
		int sum2=a%b;
		str = String.format("%.5f", ((double)a / (double)b));
		int sum3=str;
		System.out.println(sum1+" "+sum2+" "+sum3);
		
	}
}