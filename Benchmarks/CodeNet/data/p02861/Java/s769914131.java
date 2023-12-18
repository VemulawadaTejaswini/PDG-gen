
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
        double ans=0;
        int f=1;
        for(int i=1;i<=n-1;i++)
        {
        	f=f*i;
        }
        f=f*2;
        int[][]cor=new int[n][2];
        for(int i=0;i<n;i++)
        {
        	int[]ar=split();
        	cor[i][0]=ar[0];
        	cor[i][1]=ar[1];
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		double d=Math.sqrt((cor[i][0]-cor[j][0])*(cor[i][0]-cor[j][0])+(cor[i][1]-cor[j][1])*(cor[i][1]-cor[j][1]));
        		ans=ans+d*(double)(f);
        	}
        }
        f=(f/2)*n;
        ans=ans/f;
        System.out.println(ans);
    }
}