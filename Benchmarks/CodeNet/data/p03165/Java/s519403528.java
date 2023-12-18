import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine(), s2=br.readLine();
		int[][]dp=new int[s1.length()][s2.length()];
		int[][][]prev=new int[s1.length()][s2.length()][2];
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				prev[i][j][0]=-1;
				prev[i][j][1]=-1;
			}
		}
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					dp[i][j]=1;
					if(i*j!=0){
						dp[i][j]=dp[i-1][j-1]+dp[i][j];
						prev[i][j][0]=i-1;
						prev[i][j][1]=j-1;
					}
				}else{
					if(i==0&&j==0)continue;
					else if(i!=0&&(j==0||dp[i-1][j]>dp[i][j-1])){
						dp[i][j]=dp[i-1][j];
						prev[i][j][0]=i-1;
						prev[i][j][1]=j;
					}else {
						dp[i][j]=dp[i][j-1];
						prev[i][j][0]=i;
						prev[i][j][1]=j-1;
					}
				}
			}
		}
		int cr=s1.length()-1,cc=s2.length()-1; 
		String ans="";
		while(true){
			if(cr==-1)break;
			if(s1.charAt(cr)==s2.charAt(cc))ans=s1.charAt(cr)+ans;
			int temp=cr;
			cr=prev[cr][cc][0];
			cc=prev[temp][cc][1];
		}
		System.out.println(ans);
	}
}
