

import java.util.*;

public class Main {
	
   public static void main(String args[]){
		
	 Scanner sc= new Scanner(System.in);
	 
	 int n =sc.nextInt();
	 
	 String ans = "second";
	 
	 for(long i=0;i<n;i++){
		 if(sc.nextLong()%2!=0)ans="first";
	 }
	 
	 
	 System.out.println(ans);
   }
}
