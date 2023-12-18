import java.util.*;
import java.io.*;


public class code{
	public static int max(int a,int b){
		if(a>b)return a;
		else return b;
	}
	public static double max(double a,double b){
		if(a>b)return a;
		else return b;
	}
	public static String fun(String a,String b){
				int n=a.length();
				int m=b.length();


				int [][]dp=new int[n+1][m+1] ;
				for(int i=1;i<=n;i++){
					for(int j=1;j<=m;j++){
						if(a.charAt(i-1)==b.charAt(j-1)){
							dp[i][j]=1+dp[i-1][j-1];
						}
						else{
							dp[i][j]=max(dp[i][j-1],dp[i-1][j]);
						}
					}
				}
				//System.out.println(dp[n][m]);

String ans="";
int i=n;
int j=m;
try{
while(i>0&&j>0){
	if(a.charAt(i-1)==b.charAt(j-1)){
		ans+=a.charAt(i-1);
		i--;
		j--;
	}
	else{
		if(dp[i][j-1]<dp[i-1][j]){
			i--;
		}
		else{
			j--;
		}
	}
}}
catch(Exception e){
	System.out.println(i+" "+j);
}
StringBuilder sb =new StringBuilder();
for(int ii=ans.length()-1;ii>=0;ii--){
	sb.append(ans.charAt(ii));
}

return sb.toString();

	} 
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.println(fun(a,b));
	}
}