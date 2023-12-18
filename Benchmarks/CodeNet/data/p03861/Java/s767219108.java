import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
      	long x = scn.nextLong();
      	long aa = a/x;
      	long bb = b/x;
      	if(a%x==0) System.out.println(bb-aa+1);
      	else System.out.println(bb-aa);
	}
}
