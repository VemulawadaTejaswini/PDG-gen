import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	new Main().run();
    }
    
    final long mo=998244353;

    void run(){
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=s.length();
	{
	    boolean flag=true;
	    for(int i=0;i+1<s.length();++i){
		flag&=s.charAt(i)==s.charAt(i+1);
	    }
	    if(flag){
		System.out.println(1);
		return;
	    }
	}
	int sum=0;
	for(char c:s.toCharArray()){
	    if(c=='a'){
		sum+=0;
	    }else if(c=='b'){
		sum+=1;
	    }else if(c=='c'){
		sum+=2;
	    }
	    sum%=3;
	}
	long[][][][] dp=new long[n][3][3][2];//[長さ-1][sum][末尾][flag=連続が存在]
	dp[0][0][0][0]=1;
	dp[0][1][1][0]=1;
	dp[0][2][2][0]=1;
	for(int i=1;i<n;++i){
	    for(int j=0;j<3;++j){//sum
		for(int k=0;k<3;++k){//前に選んだ数
		    for(int m=0;m<3;++m){//次に選ぶ数
			for(int l=0;l<2;++l){
			    dp[i][(j+m)%3][m][l|(k==m?1:0)]+=dp[i-1][j][k][l];
			    dp[i][(j+m)%3][m][l|(k==m?1:0)]%=mo;
			}
		    }
		}
	    }
	}
	long ans=0;
	for(int i=0;i<3;++i){
	    ans+=dp[n-1][sum][i][1];
	}
	{
	    boolean flag=true;
	    for(int i=0;i+1<s.length();++i){
		flag&=s.charAt(i)!=s.charAt(i+1);
	    }
	    if(flag)++ans;
	}
	ans%=mo;
	System.out.println(ans);
    }
    
}