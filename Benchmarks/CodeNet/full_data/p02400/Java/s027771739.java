import java.io.*;
import java.math.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		BigDecimal a = new BigDecimal(new Integer(line));
		System.out.println(a.multiply(a).multiply(BigDecimal.valueOf(Math.PI)).toPlainString() + " " + a.add(a).multiply(BigDecimal.valueOf(Math.PI)).toPlainString());
	}
}