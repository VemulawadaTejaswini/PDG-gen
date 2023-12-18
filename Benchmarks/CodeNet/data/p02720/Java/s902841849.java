import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long ans;
	static int l;
	static int k;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		for(int j=1; j<=10; j++){
			for(int i=1; i<=9; i++){
				l=j;
				dfs(i,i,1);
			}
		}
		System.out.println(ans);
	}
	static void dfs(long t,int last,int len){
		if(len==l){
			k--;
			if(k==0){
				ans=t;
			}
			return;
		}
		for(int i=0; i<10; i++){
			if(Math.abs(i-last)<2){
				dfs(t*10+i,i,len+1);
			}
		}
	}
}
