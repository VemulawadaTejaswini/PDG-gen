import java.util.*;
public class Main
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   
    
    String t=sc.next();
	
    int dp[][]=new int[s.length()+1][t.length()+1];
   
    for(int i=1;i<=s.length();i++)
    {
      for(int j=1;j<=t.length();j++)
      {
        if(s.charAt(i-1)==t.charAt(j-1))
        {
          dp[i][j]=dp[i-1][j-1]+1;
        }
        else
        {
          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
      
    }
	String res="";
	int i=s.length(),j=t.length();
	while(i>0&&j>0)
	{
		if(s.charAt(i-1)==t.charAt(j-1))
		{
			res=s.charAt(i-1)+res;
			i--;j--;
		}
		else if(dp[i-1][j]>=dp[i][j-1])
		{
			i--;
		}
		else{
			j--;
	}  
	}
	System.out.println(res);
}
}