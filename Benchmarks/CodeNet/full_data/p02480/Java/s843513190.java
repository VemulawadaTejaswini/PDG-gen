import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
class Scanner
 {
	public static void main(String[] args)
	{
		int x;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		x = sc.nextInt();
		System.out.println(x*x*x);   
	    return;
	}
}