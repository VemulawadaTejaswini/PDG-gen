
import java.io.*;
import java.util.*;
public class Main {
	static long fact(long n)
	{
		long ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int n=Integer.valueOf(br.readLine());
		int x=n%10;
		if(x==2 || x==4 || x==5 || x==7 || x==9)
			System.out.println("hon");
		else if(x==0 || x==1 || x==6 || x==8)
			System.out.println("pon");
		else
			System.out.println("bon");
	}

}
