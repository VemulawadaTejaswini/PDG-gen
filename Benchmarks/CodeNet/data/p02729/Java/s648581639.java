import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    	 int N = sc.nextInt();
      	 int M = sc.nextInt();
		if(M<=1){
      		int number = N*(N-1)/2;
	    	System.out.println(number);
        }else if(M==2){
			int number = N*(N-1)/2+1;
         	 System.out.println(number);
        }else{
       		int number = N*(N-1)/2+M; 
        	System.out.println(number);
        }
    }
}