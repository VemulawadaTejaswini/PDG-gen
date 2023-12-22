import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			String str1=in.next();
			String str2=in.next();
			out.println(solve(str1,str2));
		}
		out.flush();
	}
	
	static int solve(String str1,String str2) {
		char s1[]=str1.toCharArray(), s2[]=str2.toCharArray();
		int DP[][]=new int[str1.length()][str2.length()];
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(s1[i]==s2[j]) {
					if(i>0 && j>0)DP[i][j]=DP[i-1][j-1]+1;
					else DP[i][j]=1;
				}
				else {
					if(i>0 && j>0)DP[i][j]=Math.max(DP[i][j-1], DP[i-1][j]);
					else if(j==0 && i>0)DP[i][j]=DP[i-1][j];
					else if(i==0 && j>0)DP[i][j]=DP[i][j-1];
					else DP[i][j]=0;
				}
			}
		}
		int res=0;
		for(int i=0;i<str2.length();i++)res=Math.max(DP[str1.length()-1][i], res);
		return res;
	}

}

