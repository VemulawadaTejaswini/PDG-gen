import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		int quotient=n/k;
		int reminder;
		reminder=n-(k*(quotient-1));
		int res;
		if(reminder<k)
			res=reminder;
		else
			res=reminder-k;
		System.out.println(res);
	}
}
