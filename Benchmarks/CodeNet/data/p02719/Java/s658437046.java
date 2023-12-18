import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
	  Scanner s = new Scanner(System.in);
	  BigInteger nBig = new BigInteger(s.next());
	  BigInteger kBig = new BigInteger(s.next());
	  
	  int n = nBig.intValue();
	  int k = kBig.intValue();
	  
	  int min = Math.abs(n-k);
	 
	  while (true) {
		  int temp = Math.abs(min - k);
		  if (temp < min)
			  min = temp;
		  else if (temp > min)
			  break;
	  }
	  System.out.println(min);
  }
	

}