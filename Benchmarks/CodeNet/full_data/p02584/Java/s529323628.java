import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		x = Math.abs(x);
		long k = sc.nextLong();
		long d = sc.nextLong();
		long div = x/d;
		long ans = 0;
		if(div>k) {
			ans = x-(k*d);
		}
		else {
			k=k-div;
			ans = x - (div*d);
			if(k%2!=0) {
				long a = ans - d;
				long b = ans + d;
				if(Math.abs(a)>Math.abs(b))
					ans = b;
				else
					ans = a;
			}

		}
		System.out.println(Math.abs(ans));
		sc.close();

	}
}
