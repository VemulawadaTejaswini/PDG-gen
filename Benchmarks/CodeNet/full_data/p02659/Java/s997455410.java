import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		BigInteger n = BigInteger.ONE;
		Long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next()) * 1000;
		n = n.multiply(BigInteger.valueOf(a));
		n = n.multiply(BigInteger.valueOf((long)b));
		n = n.divide(BigInteger.valueOf((long)1000));
		ou.println(n);
		ou.flush();
	}
}