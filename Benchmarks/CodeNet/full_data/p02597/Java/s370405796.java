import java.io.*;
import java.math.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int ans = 0;
		for (int i=0; i<n-1; i++)
		{
		    if (s.charAt(i)=='W' && s.charAt(i+1)=='R')
		    ans++;
		}
		System.out.println(ans);
	}
}