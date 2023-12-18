import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	String s = scan.next();
      	int counterW = 0;
      	int counterB = 0;
      	for(int i = 0; i < N; i++){
        	if(s.substring(i, i+1).contains(".")){
            	counterW++;
            }
          	else{
            	counterB++;
            }
        }
      	if(counterW < counterB){
        	System.out.print(counterW);
        }
      	else{
        	System.out.print(counterB);
        }
    
    }
 
}