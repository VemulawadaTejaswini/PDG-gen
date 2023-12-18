import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a*n;
		int ans=Math.min(sum,b);
		
		System.out.println(ans);
	}
}