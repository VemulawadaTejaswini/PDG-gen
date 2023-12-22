import java.util.*;

public class Corona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k;
		int A;
		int B;
		 Scanner k1 = new Scanner(System.in); 
		  
		 // Read the next integer from the screen 
		 	k= k1.nextInt(); 
		 	Scanner A1 = new Scanner(System.in); 
	        
	        // Read the next integer from the screen 
	        A = A1.nextInt(); 
	        
	        Scanner B1 = new Scanner(System.in); 
	        
	        // Read the next integer from the screen 
	        B= B1.nextInt();
	        check(k,A,B);
	        }
	public static void check(int k,int A,int B)
	{
		int l=0;
		for(int i=A;i<=B;i++)
		{
			if(i%k==0)
			{
			l=1	;
			}
		}
		
		if(l==1)
		{
			System.out.print("OK");
		}
		else 
		{
			System.out.print("NG");	
		}	
	}
}
