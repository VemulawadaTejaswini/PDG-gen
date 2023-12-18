
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int N,K;
		N=sc.nextInt();
		K=sc.nextInt();
		int sum=0;
		Integer Health[]=new Integer[N];
		
		for(int i=0;i<N;i++)
		{
			Health[i]=sc.nextInt();
			
			
		}
		if(K>=N)
		{
			System.out.println("0");			
		}
		else
		{
			  int  maxx = Collections.max(Arrays.asList(Health)); 
			    System.out.println(maxx);
			
			
		}
		
		
		
		
		
	}

public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



