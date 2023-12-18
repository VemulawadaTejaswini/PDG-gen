import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();  
      int b = sc.nextInt();  
      int c = sc.nextInt();  
      int x = sc.nextInt();  
      
      int count=0;
      boolean fragJ = true;
      boolean fragK = true;
      
      for(int i = 1; i<=a ; i++){
       if(500*i == x){
      	count += 1;
       }
       
        for(int j = 1; j<=b ; j++){
         
         if(fragJ){
            if(100*j == x){
         	    count += 1;
         	    fragJ = false;
 
            }
         }
         
            if(500*i + 100*j == x){
                count += 1;
            }
        
        	for(int k = 1; k<=c ; k++){
                 if(fragK){
         		    if(50*k == x){
         			    count += 1;
         			    fragK = false;
        		    }
                 }
 
        	     if(j==1){
        		    if(500*i + 50*k == x){
            		    count += 1;
        	        }
        	     }
        	     
         	     if(500*i + 100*j + 50*k == x){
            		count += 1;
 
            		
        	     }
             }   
         }
      }
      
    System.out.println(count);
  }
}