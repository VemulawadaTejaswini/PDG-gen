/*
Volume0-0018
*/
import java.io.*;
class vol0_0018
{
    public static Integer fac(int n)
    {
	if (n==0) {
	    return(1);
	} else if (n==1) {
	    return(1);
	} else {
	    return(n*(fac(n-1)));
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