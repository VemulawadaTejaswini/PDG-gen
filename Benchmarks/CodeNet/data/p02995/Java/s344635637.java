import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	long a = scan.nextInt();
      	long b = scan.nextInt();
      	long c = scan.nextInt();
      	long d = scan.nextInt();
      	long counter = b - a + 1;
      	for(long i = a; i <= b; i++){
        	if(i % c == 0 && i % d == 0){
            	counter--;
            }
          	else if(i % c == 0){
            	counter --;
            }
          	else if(i % d == 0){
            	counter --;
            }
        }
      	System.out.print(counter);
    
    }
 
}