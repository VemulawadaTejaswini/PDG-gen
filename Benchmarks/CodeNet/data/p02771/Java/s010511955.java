import java.util.*;
public class Main{

	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
         int array[]=new int[3];
         for(int i=0;i<3;i++)
        	 array[i]=sc.nextInt();
         find(array);
	}

	private static void find(int[] array) 
	{	
		int count=0;
		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(array[i]==array[j])
					count++;
			}
		}
		if(count==1)
			System.out.println("Yes");
		else 
			System.out.println("No");
		
		
	}

}
