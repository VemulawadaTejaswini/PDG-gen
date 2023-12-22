import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
  		Scanner in = new Scanner(System.in);
		String A = in.next();
		String B = in.next();
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);

		int d,r;
        float f;

		d = a / b;
        r = a % b;
        f = (float)a / b;

        System.out.println(d + " " + r + " " + f);
	}
    
}