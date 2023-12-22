import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static long mod = 1000000007;
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	long a = s.nextLong();
	long b = s.nextLong();
	long c = s.nextLong();
	long d = s.nextLong();
	
	long max = Long.MIN_VALUE;
	max = Math.max(max, a*c);
	max = Math.max(max, a*d);
	max = Math.max(max, b*c);
	max = Math.max(max, b*d);

	System.out.println(max);
    
  }
}