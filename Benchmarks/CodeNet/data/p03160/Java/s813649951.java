import java.io.*;
//import javafx.util.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 int dp[]=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	 }
	 dp[0]=0;
	 dp[1]=Math.abs(a[1]-a[0]);
	 for(int i=2;i<n;i++) {
		 dp[i]=Math.min(Math.abs(a[i]-a[i-2])+dp[i-2],Math.abs(a[i]-a[i-1])+dp[i-1] );
	 }
	 System.out.println(dp[n-1]);
	}
}