
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int N,K;
		N=sc.nextInt();
		K=sc.nextInt();
		
		
		Integer Health[]=new Integer[N];
		
		
		for(int i=0;i<N;i++)
		{
			Health[i]=sc.nextInt();				
		}
		int temp;
		for(int i=0;i<K;i++)
		{
			List<Integer> iList = Arrays.asList(Health);
		    int index=(iList.indexOf(Collections.max(iList)));
		    Health[index]=0;
			
		}
	     
	    	long  mov=0;
	    	 N=N-K;
	    	 for(int i=0;i<N;i++)
	 		{
	 			mov+=Health[i];
	 				
	 		}
	    	 System.out.println(mov);
	    	 
	     	
		sc.close();
		
	}

public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



