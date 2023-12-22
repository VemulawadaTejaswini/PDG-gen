import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Integral Rectangles
// 2013/08/13
public class Main{
	Scanner sc=new Scanner(System.in);

	String line;

	void run(){
		for(int T=sc.nextInt(); T>0; T--){
			line=sc.next();
			solve();
		}
	}

	void solve(){
		println(dfs(0, line.length())+"");
	}

	int dfs(int s, int t){
		if(line.charAt(s+1)!='['){
			return Integer.parseInt(line.substring(s+1, t))/2+1;
		}
		int stack=0, left=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=s+1; i<=t-1; i++){
			if(line.charAt(i)=='['){
				if(stack++==0){
					left=i;
				}
			}else if(line.charAt(i)==']'){
				if(--stack==0){
					int right=i;
					list.add(dfs(left, right));
				}
			}
		}
		sort(list);
		int sum=0;
		for(int i : list.subList(0, list.size()/2+1)){
			sum+=i;
		}
		return sum;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}