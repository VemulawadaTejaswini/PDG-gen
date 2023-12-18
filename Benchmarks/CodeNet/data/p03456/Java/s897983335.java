import java.util.*;

public class Main{
	public static void main(String[] args){
    	
     	Scanner sc = new Scanner(System.in);
      	
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      
      	int abMultiply = a * b;
      
      	boolean isSquaredNumber = false;
      	int i = 1;
      	while(i * i < abMultiply){
        	if (i * i == abMultiply){
            	isSquaredNumber = true;
              	break;
            }
          	i++;
        }
      	
      	if(isSquaredNumber){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}