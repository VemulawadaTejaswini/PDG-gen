import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);
	
	int n,count = 0;
	
	do
	    {
		n = In.nextInt();
	    }while(1 >= n && n >= 10000);
	
	int []a = new int[n];

	for(int i = 0; i < n; i++)
	    {
		do
		    {
			a[i] = In.nextInt();
		}while(a[i] <= 2 && a[i] >= Math.pow(10,8));

		if((isprime(a[i])) == 1)
		   count++;
	    }
		System.out.println(count);
    }
    
    public static int isprime(int x)
    {
	if(x == 2)
	    return 1;

	if(x < 2 || x % 2 == 0)
	    return 0;
    
	int j = 3;
	while(j <= Math.sqrt(x))
	    {
		if(x % j == 0)
		    return 0;

		j += 2;
	    }
	return 1;
    }
}