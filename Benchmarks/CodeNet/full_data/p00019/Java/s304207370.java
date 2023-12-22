/*
Volume0-0018
*/
import java.io.*;
import java.math.BigDecimal;
class vol0_0018
{
    public static BigDecimal fac(int n)
    {
	//	BigDecimal m = new BigDecimal(n); 
	if (n==0 || n==1) {
	    return(new BigDecimal(1));
	} else {
	    return(new BigDecimal(n).multiply(fac(n-1)));
	}
    }

    public static void main(String[] arg) throws IOException
    {
	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	String str =in.readLine();
	int n = Integer.parseInt(str);
	System.out.println(fac(n));
    }
}