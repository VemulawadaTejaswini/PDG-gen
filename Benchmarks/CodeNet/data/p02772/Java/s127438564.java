import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       String ans="APPROVED";
       
       long[] a = new long[(int)N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }
       
       for (int i=0 ; i<N; i++) {
    	   if(a[i]%2==0) {
    		   if(a[i]%3!=0&&a[i]%5!=0) {
    		       ans="DENIED";
   			   
    		   }
    	   }
       }
       
       System.out.println(ans); 	
              		
   }

}