import java.util.Scanner;
public class Main {
public static void main(String[] args){
	int max,min,a=0;
	long goukei=0;
	         Scanner sc = new Scanner(System.in);
	         a =sc.nextInt();
	         int[] n =new int[a];
	         
	        		 for(int i=0;i<a;i++){
	        		  n[i]=sc.nextInt();	
	        		  }
	        		  max=n[0];
	        		  min=n[0];
	        		 
	        		 for(int i=0;i<n.length;i++){ 
	        					 if(max<n[i]){
	        						 max=n[i];
	        						 
	        					 }
	        					 if(min>n[i]){
	        						 min=n[i];
	        					 }
	        					 goukei+=n[i];
	        				 }
	        				 System.out.println(min);
	        				 System.out.println(" ");
	        				 System.out.println(max);
	        				 System.out.println(" ");
	        				 System.out.println(goukei);
	        				 sc.close();
		    
	        	
}
	 		
	 		 
	   
}


