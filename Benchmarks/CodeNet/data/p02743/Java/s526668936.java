import java.util.*;
public class Main {
	final static double eqs=1e-18;
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 long a=input.nextLong();long b=input.nextLong();long c=input.nextLong();
	 double k1=Math.sqrt(a)+Math.sqrt(b);
	 double k2=Math.sqrt(c);
	 if(k1-k2>eqs)
		 System.out.println("No");
	 else
		 System.out.println("Yes");
	 
 }
}