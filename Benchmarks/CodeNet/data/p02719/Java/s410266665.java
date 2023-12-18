import java.util.*;
import java.math.*;
public class Main{
    public static void main(String args[]){
       Scanner cin = new Scanner(System.in);
       BigInteger a, b;
       while (cin.hasNext()){
           a = cin.nextBigInteger();
           b = cin.nextBigInteger();
           BigInteger c = BigInteger.valueOf(0); 
           if(a.remainder(b).compareTo(c) == 0)
        	   System.out.println(0);
           else{
        	   if((a.remainder(b).add(b)).compareTo(a.remainder(b).abs()) > 0)
        		   System.out.println(a.abs());
        	   else
        		   System.out.println(a.add(b));
       }
       }
    }
}