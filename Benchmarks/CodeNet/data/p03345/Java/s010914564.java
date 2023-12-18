import java.util.*;
import java.io.*;

	
public class wangji {
	public static void main(String[] args) throws IOException {
//		InputReader cin = new InputReader(System.in);
//	    PrintWriter cout = new PrintWriter(System.out);
		Scanner cin = new Scanner(System.in);
		long a, b, c, k;
		a = cin.nextLong();
		b = cin.nextLong();
		c = cin.nextLong();
		k = cin.nextLong();
		if(k%2 == 0)System.out.println(a-b);
		else System.out.println(b-a);
	}
}
