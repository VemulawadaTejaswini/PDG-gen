
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main{
	static BufferedReader br;
	static int in() throws Exception
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
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ar=split();
        int a=ar[0];
        int b=ar[1];
        int c=ar[2];
        int n=in();
        while(n>0 && b<=a)
        {
        	b=b*2;
        	n--;
        }
        while(n>0 && c<=b)
        {
        	c=c*2;
        	n--;
        }
        if(c>b && b>a)
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}
