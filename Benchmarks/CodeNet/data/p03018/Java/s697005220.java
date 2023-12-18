import java.util.*;
import java.lang.*;
import java.math.BigInteger; 

class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	BigInteger count = new BigInteger("0");
    BigInteger x = new BigInteger("1");
	String s = sc.next();
	while(s.contains("ABC")==true){
	s=s.replaceFirst("ABC","BCA");
	count=count.add(x);
	}
    System.out.println(count);
	}
}