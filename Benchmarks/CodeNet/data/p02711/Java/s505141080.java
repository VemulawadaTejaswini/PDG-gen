import java.util.*;
public class First{
 
     public static void main(String []args){
     	   Scanner s = new Scanner(System.in);
       		int n = s.nextInt();
       		
       		int rem = 0;
       		while( n != 0){
            	rem = n % 10;
              
                if(rem == 7){
              		System.out.println("Yes");
                  	break;
                }
            }
       		System.out.println("No");
     }
}