import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),count=0;
		while(n>0)
		{
		n=n%10;
		n=n/10;
		count++;
		}
		if(count!=0)
		{
		int p=count;
		System.out.print(p);
		}
		}

	}


