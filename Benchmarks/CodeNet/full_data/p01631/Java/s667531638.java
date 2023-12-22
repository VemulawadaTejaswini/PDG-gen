import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// English
// 2013/09/21
public class Main{
	Scanner sc=new Scanner(System.in);

	int n;
	String[] words;
	int[] scores;
	int m=4;
	char[][] cs;
	int maxT;

	void run(){
		n=sc.nextInt();
		words=new String[n];
		scores=new int[n];
		for(int i=0; i<n; i++){
			words[i]=sc.next();
			scores[i]=sc.nextInt();
		}
		cs=new char[m][];
		for(int i=0; i<m; i++){
			cs[i]=sc.next().toCharArray();
		}
		maxT=sc.nextInt();
		solve();
	}

	void solve(){
		visited=new boolean[m][m];
		long[] dp=new long[maxT+1];
		for(int j=0; j<n; j++){
			int num=0;
			for(int y=0; y<m; y++){
				for(int x=0; x<m; x++){
					num+=dfs(x, y, words[j], 0);
				}
			}
			int weight=words[j].length(), value=scores[j];
			for(int k=1; num>0; k<<=1){
				int mul=min(k, num);
				for(int i=maxT; i-weight*mul>=0; i--){
					dp[i]=max(dp[i], dp[i-weight*mul]+value*mul);
				}
				num-=mul;
			}
		}
		println(dp[maxT]+"");
	}

	boolean[][] visited;

	int dfs(int x, int y, String word, int at){
		if(x<0||x>=m||y<0||y>=m||cs[y][x]!=word.charAt(at)||visited[y][x]){
			return 0;
		}
		if(at==word.length()-1){
			return 1;
		}
		visited[y][x]=true;
		int sum=0;
		for(int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				sum+=dfs(x+i, y+j, word, at+1);
			}
		}
		visited[y][x]=false;
		return sum;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}