import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
        int size = scan.nextInt();
        int price = 0;
        int[] prices = new int[size];
        while(total>0){
          boolean hasChanged = false;
          int cand = scan.nextInt();
          for(int i=0;i<prices.length;i++){
            if(prices[i] == 0){
              prices[i] = cand;
              hasChanged = true;
            break;
            }
            }
          if(hasChanged){
        	  total--;
            continue;
          }
          
           for(int i=0;i<prices.length;i++){
            if(prices[i]>cand){
              prices[i] = cand;
            break;
            }
            }
           total--;
        }
      
        
        int result = 0;
		for(int i=0;i<prices.length;i++){
          result += prices[i];
        }
        
				
		System.out.println(result);
 
	}
 
}
