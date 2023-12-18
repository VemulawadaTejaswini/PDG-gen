import java.io.*; 
import java.util.*; 
 
public class Main
{ 
    public static void main(String args[]) 
    { 
      
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int k = sc.nextInt();
		
		int sum;
	
		if(x == 0 && k == 0){
			
			System.out.print(x);
			
		} else {
		
		for(int i = 1; i < 1000; i++){
			
			sum = 0;
			sum = k - x + i; 
			System.out.print(sum + " ");
			if(sum == k+x-1){
				
				break;
				
				}
			
			}	
		
		}
    } 
} 