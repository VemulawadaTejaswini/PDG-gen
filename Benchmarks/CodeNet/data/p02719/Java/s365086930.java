import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  BigInteger n = new BigInteger(s.next());
	  BigInteger k = new BigInteger(s.next());
	  
	  int min = Math.abs(n.intValue()-k.intValue());
	 
	  while (true) {
		  int temp = Math.abs(min - k.intValue());
		  if (temp < min)
			  min = temp;
		  else if (temp > min)
			  break;
	  }
	  System.out.println(min);
  }
	

}
