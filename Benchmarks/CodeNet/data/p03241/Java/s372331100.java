import java.util.*;
 

class Main {
	public static void main (String[] args){
     Scanner scan = new Scanner(System.in);
     
     int N = scan.nextInt();
     int M = scan.nextInt();
     
    
     int k = (int)M/N;
     
     
     int ans=1;
     
     for(int i=k;i>1;i--){
    	 if(M%i==0){
    		 ans=i;
    		 break;
    	 }
     }	 
     System.out.println(ans);
}
}
