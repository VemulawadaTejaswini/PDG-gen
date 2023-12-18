import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//       while(true) {
    	   int n = sc.nextInt();
    	   int k = sc.nextInt();
    	   String s = sc.next();
    	   if(k==1) 
    		   s = s.substring(0, 1).toLowerCase()+s.substring(1);
    	   else
    		   s = s.substring(0, k-1)+s.substring(k-1, k).toLowerCase()+s.substring(k);
    	   System.out.println(s);
//      }
    }
}