import java.util.*;
import java.math.*;
public class Main{
    public static void main(String args[]){
       Scanner cin = new Scanner(System.in);
       BigInteger a, b;
       while (cin.hasNext()){
           a = cin.nextBigInteger();
           b = cin.nextBigInteger();
       while(a>0){
       	   a.subtract(b)
       }
       if(a.compareTo(0) == 0)
           System.out.println(0);
       else{
        	if((a.add(b)).compareTo(a.abs()) > 0)
            	System.out.println(a.abs());
        	else
            	System.out.println(a.add(b));
       }
       }
    }
}