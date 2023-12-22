import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		long count=0;
		while(scan.hasNext()){	
			num= scan.nextInt();
			boolean[] prime = new boolean[num]; 
		      for (int i=2; i<num; i++) prime[i] = true; 		      
		      for (int i=2; i<num; i++) {
		    	  if (prime[i]) { 
		    		  //System.out.println(i); 
		    		  for (int j=i+i; j<num; j+=i) prime[j] = false;
			  }
		      }
			for(int i=0;i<num-1;i++){
				if(prime[i]==true)
					count++;
			}
			System.out.println(count);
			count=0;
		}
	}	
}