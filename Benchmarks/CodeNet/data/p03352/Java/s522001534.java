import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	double num = sc.nextInt();
      	
      	if(num==1){
      	    System.out.println(num);
      	}
      	
      	for(int n=2; 2.0<=Math.pow(num,1.0/n);n++){
      	    double num1=Math.pow(num,1.0/n);
      	    double numfloor = Math.floor(num1);
      	    
      	    if(num1-numfloor==0.00000000000){
      	        System.out.println(numfloor);
      	    }
      	}
      	
      	
      	
 
    }
}