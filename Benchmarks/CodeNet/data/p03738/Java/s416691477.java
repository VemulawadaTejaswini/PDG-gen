import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		BigInteger a = scn.nextBigInteger();
		BigInteger b = scn.nextBigInteger();
      	if(a.compareTo(b)>0){
          System.out.println("GREATER");
        }else if(a.compareTo(b)<0){
          System.out.println("LESS");
        }else{
          System.out.println("EQUAL");
        }
	}
}