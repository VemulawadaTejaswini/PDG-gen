import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inputs[] = input.split(" ");
          long k = Long.valueOf(inputs[0]);
          long a = Long.valueOf(inputs[1]);
      	  long b = Long.valueOf(inputs[2]);
        if(b-a<=2) {
        	System.out.println(k+1);
          	return;
        }
       if(k-(a-1)<=0) {
       		System.out.println(k+1);
         	return; 
       }
      	long totalBiscuits = a; 
      	k = k-(a-1);
        totalBiscuits += (b-a)*(k/2); 
      	if(k%2==1)
          totalBiscuits++;
      	
      	System.out.println(totalBiscuits);
      
    }
}