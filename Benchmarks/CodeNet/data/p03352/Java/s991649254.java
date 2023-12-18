import java.util.*;
public class Main {
	public static void main(String[] args){
	    
	    
		Scanner sc = new Scanner(System.in);
        
      	double num = sc.nextInt();
      	int resultx=0;
      	int answer =0;
      	int result =0;
      	
      	if(num==1||num==2||num==3){
      	    System.out.println(1);
      	}
      	
      	
      	for(int n=2; 2.0<=Math.pow(num,1.0/n);n++){
      	    double num1=Math.pow(num,1.0/n);
      	    double numfloor = Math.floor(num1);
      	    result =(int)num1 - (int)numfloor;
      	    
      	    if(result==0 && answer==0){
      	        
      	        if(numfloor>resultx){
      	            resultx = (int)Math.pow(numfloor,2);
      	             System.out.println(resultx);
      	             answer=1;
      	        }
      	       
      	    }
      	}
      	
      	
      	
 
    }
}