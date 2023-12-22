import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		BigInteger n = BigInteger.ONE;
		int q = Integer.parseInt(sc.next());
		for(int i = 0 ; i < q ; i++) n = n.multiply(BigInteger.valueOf(Long.parseLong(sc.next())));
		sc.close();
		BigInteger hi = BigInteger.ONE;
		hi = n.subtract(BigInteger.valueOf((long)Math.pow(10 , 18) + 1));
		if(!hi.equals(hi.abs())){
			ou.println(n);
		}else{
			ou.println(-1);
		}
		ou.flush();
	}
}