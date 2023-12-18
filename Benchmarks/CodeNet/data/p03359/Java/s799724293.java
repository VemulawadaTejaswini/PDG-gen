import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		if(n==m){
			System.out.println(n);
		} else if(n<m){
				System.out.println(n);
		} else System.out.println(n-1);
		// your code goes here
	}
}
