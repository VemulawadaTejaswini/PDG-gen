import java.util.*;
public class Main
{
    static int dp[][];
    static String longest;
    public static int lcs(String s,String t,int index1,int index2,String current)
    {
        if(index1>=s.length()){if(current.length()>longest.length())longest=current;return 0;}
        if(index2>=t.length()){if(current.length()>longest.length())longest=current;return 0;}
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        int temp1=0,temp2=0;
        if(s.charAt(index1)==t.charAt(index2)) temp1=1+lcs(s,t,index1+1,index2+1,current+Character.toString(s.charAt(index1)));
        else
        {
          temp1=lcs(s,t,index1,index2+1,current);
          temp2=lcs(s,t,index1+1,index2,current);
        }
        return Math.max(temp1,temp2);
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
		//System.out.println(lcs(s,t,0,0,""));
		System.out.println(longest);
	}
}
