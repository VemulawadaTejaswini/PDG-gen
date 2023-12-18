import java.util.*;

class A
{
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int	a=sc.nextInt();
	int b=sc.nextInt();

	int min=a*n;

	if(b>=min)
		{
		System.out.println(min);
		}
	else
		{
		System.out.println(b);
		}

	}


}