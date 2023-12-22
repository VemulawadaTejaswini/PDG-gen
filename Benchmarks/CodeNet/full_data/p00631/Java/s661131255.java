import java.lang.reflect.Member;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ1045().doIt();
	}
	
	class AOJ1045{
		int n;
		int[] member;
		int dfs(int index,int a,int b){
//			System.out.println(index+" "+a+" "+b);
			int result = Integer.MAX_VALUE;
			if(index == n){
//				if(Math.abs(a-b)==0)System.out.println(a+" "+b);
				return Math.abs(a-b);
			}
			result = Math.min(result, dfs(index+1,a+member[index], b));
			result = Math.min(result, dfs(index+1,a, b+member[index]));
			return result;
		}
		
		void solve(){
			member = new int[n];
			for(int i=0;i<n;i++)member[i] = in.nextInt();
			System.out.println(dfs(0, 0, 0));
		}
		void doIt(){
			while(true){
				n = in.nextInt();
				if(n==0)break;
				solve();
			}
		}
	}
	
}