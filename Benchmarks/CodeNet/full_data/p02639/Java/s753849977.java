import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){

      Scanner sc1 = new Scanner(System.in); 
      Scanner sc2 = new Scanner(System.in);	
     
	int num1 = sc1 nextInt();
	int num2 = sc2 nextInt();
      
      if((num2 % 4) % 2 ==0){
        System.out.println("Yes");
      }else{
        System.out.println("No");        
      }
      
      
    }      
}
