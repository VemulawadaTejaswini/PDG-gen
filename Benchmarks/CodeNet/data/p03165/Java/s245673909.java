import java.util.*;

public class Main{

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String a =sc.nextLine();
		String b =sc.nextLine();
		
	 char res[] =checkLCS(a.toCharArray(),b.toCharArray());
	 System.out.println(res);
	}
	
	public static char[] checkLCS(char[] a,char[] b)
	{
	
		int lcs[][]=new int [a.length+1][b.length+1];
		
		 
		
		for(int i=1;i<=a.length;i++)
		{
			for(int j=1;j<=b.length;j++)
			{
				if(i==0 || j==0) lcs[i][i]=0;
				

				else if(a[i-1]==b[j-1]) lcs[i][j]=lcs[i-1][j-1]+1;
				else
				{
				lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
				}
			}
		}
		
		int len =lcs[a.length][b.length];
		//System.out.println(len);
		char[] str =new char[len];
		
		
		int i=a.length-1;
		int j=b.length-1;
		int k=len;
		if(k==0) return str;
		while(i>0 && j>0)
		{
			if(a[i]==b[j])
			
			{
				str[k-1]=a[i];
				k--;
				i--;
				j--;
			}
			else if(lcs[i-1][j] > lcs[i][j-1])
			{
		i--;
		}
		else j--;
	}
	return str;
}
}