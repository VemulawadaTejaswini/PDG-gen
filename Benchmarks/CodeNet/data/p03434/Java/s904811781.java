import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a,Comparator.reverseOrder());
		int x=0,y=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				x+=a[i];
			else
				y+=a[i];
		}

		System.out.println(x-y);
	}
}