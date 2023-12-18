import java.util.*;
public class Main
{
    static int dp[][];
    static String longest;
    public static int lcs(String s,String t,int index1,int index2)
    {
        if(index1>=s.length())return 0;
        if(index2>=t.length())return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        int temp1=0,temp2=0;
        if(s.charAt(index1)==t.charAt(index2)) temp1=1+lcs(s,t,index1+1,index2+1);
        else
        {
          temp1=lcs(s,t,index1+1,index2);
          temp2=lcs(s,t,index1,index2+1);
        }
        return dp[index1][index2]=Math.max(temp1,temp2);
    }
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		String t=kb.next();
		dp=new int[s.length()][t.length()];
		longest="";
		for(int i=0;i<dp.length;i++)
		for(int j=0;j<dp[i].length;j++)
		dp[i][j]=-1;
		lcs(s,t,0,0);
// 		for(int i=0;i<dp.length;i++)
// 		{
// 		for(int j=0;j<dp[i].length;j++)
// 		System.out.print(dp[i][j]+" ");
// 		System.out.println();
// 		}
		
		int i=0,j=0;
		StringBuilder ans=new StringBuilder();
		while(i<s.length() && j<t.length())
		{
		    if(s.charAt(i)==t.charAt(j))
		    {
		        ans.append(Character.toString(s.charAt(i)));
		        i++;j++;
		    }
		    else 
		    {
		        if((i+1)<s.length() && (j+1)<t.length())
		        {
		           if(dp[i+1][j]>dp[i][j+1]){i++;}
		           else j++;
		        }
		        else if((i+1)<s.length())i++;
		        else if((j+1)<t.length())j++;
		        else break;
		    }
		}
		System.out.println(ans);
	}
}
