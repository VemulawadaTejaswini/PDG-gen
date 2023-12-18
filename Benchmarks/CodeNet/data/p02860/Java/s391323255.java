
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main{
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}                                              
		return ans;
	} 
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n=cin();
        String s=br.readLine();
        if(n%2!=0)
        	System.out.println("No");
        else
        {
        	int x=n/2;
        	String t=s.substring(0,x);
        	if((t+t).equals(s))
        		System.out.println("Yes");
        	else
        		System.out.println("No");
        }
    }
}