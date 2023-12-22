
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
        int n=in();
        int ans=0;
        if(n>=400 && n<=599)
        	ans=8;
        else if(n>=600 && n<=799)
        	ans=7;
        else if(n>=800 && n<=999)
        	ans=6;
        else if(n>=1000 && n<=1199)
        	ans=5;
        else if(n>=1200 && n<=1399)
        	ans=4;
        else if(n>=1400 && n<=1599)
        	ans=3;
        else if(n>=1600 && n<=1799)
        	ans=2;
        else if(n>=1800 && n<=1999)
        	ans=1;
        System.out.println(ans);
    }
}
