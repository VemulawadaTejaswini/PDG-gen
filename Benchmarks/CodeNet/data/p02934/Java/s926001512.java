import java.util.*;


public class Main {
		
    public static void main(String agr[]) {
    	Scanner sc = new Scanner(System.in);
    	double sum = 0; 
    	
    	for(int i = 0, k = sc.nextInt(); i < k; i++){
    		sum+= 1/sc.nextInt();
    	}	
    	
    	System.out.println(1/sum);	
    }
    
    
}