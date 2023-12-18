package Exception;

import java.util.Scanner;

public class asd {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
                int count=0;
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


