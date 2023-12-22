import java.util.Scanner;

public class Main
{
	private static int calcDebt(int debt,int n)
	{
		if(n==0){
			return debt;
		}else{
			int nextdebt=(int)(debt*1.05);
			int rest=nextdebt%1000;
			if(rest==0){
				return calcDebt(nextdebt,n-1);
			}else{
				return calcDebt((nextdebt/1000)*1000+1000,n-1);
			}
		}
	}
	
	public static void main(String[] args)
	{
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		scan.close();
		System.out.println(calcDebt(100000,n));
	}
}