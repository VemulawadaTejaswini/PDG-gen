import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      
      	int res = 0;
        	
      	char[] c = s.toCharArray();
      	int left = 0;
      	int right = c.length-1;
      	while ( left < right ){
        	if ( c[left] != c[right] ){
            	res++;
            }
         	left++;
          	right--;
        }
      	System.out.println( res );
      	
    }
}
