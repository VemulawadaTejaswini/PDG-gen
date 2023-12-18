import java.util.*;
public class Main
{
    static String dp[][];
    public static String lcs(String s,String t,int index1,int index2,String current)
    {
        if(index1>=s.length()){return "";}
        if(index2>=t.length()){return "";}
        if(dp[index1][index2]!=null)return dp[index1][index2];
        String temp1="",temp2="";
        if(s.charAt(index1)==t.charAt(index2)) temp1=s.charAt(index1)+lcs(s,t,index1+1,index2+1,current+Character.toString(s.charAt(index1)));
        else
        {
          temp1=lcs(s,t,index1,index2+1,current);
          temp2=lcs(s,t,index1+1,index2,current);
        }
        if(temp1.length()>temp2.length())return dp[index1][index2]=temp1;
        else return dp[index1][index2]=temp2;
    }
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		String t=kb.next();
		dp=new String[s.length()][t.length()];
		for(int i=0;i<dp.length;i++)
		for(int j=0;j<dp[i].length;j++)
		dp[i][j]=null;
		System.out.println(lcs(s,t,0,0,""));
		//System.out.println(longest);
	}
}
