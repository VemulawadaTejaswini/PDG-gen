 
import java.io.*; 
import java.util.*; 
 
public class Main
{ 
    public static void main(String args[]) 
    { 
      
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long k = sc.nextInt();
		
		long sum;
	
		
		
		for(int i = 1; i < 100; i++){
			
			sum = 0;
			sum = k - x + i; 
			System.out.print(sum + " ");
			if(sum == k+x-1){
				
				break;
				
			}
		
		}	
    } 
} 
