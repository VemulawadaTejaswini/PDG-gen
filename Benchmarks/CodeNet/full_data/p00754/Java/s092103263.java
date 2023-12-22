import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Solve{
	final Scanner in = new Scanner(System.in);
	char[] s;
	boolean solve(){
		idx = 0;
		char[] tmp = in.nextLine().toCharArray();
		if(tmp[0] == '.') return false;
		int n = 0;
		for(int i=0; i<tmp.length; i++) if(curl.indexOf(tmp[i]) != -1) n++;
		s = new char[n];
		for(int i=0; i<tmp.length; i++) if(curl.indexOf(tmp[i]) != -1) s[idx++] = tmp[i];
		idx = 0;
		System.out.println(dfs()&&idx==s.length ? "yes" : "no");
		return true;
	}
	
	int idx;
	String curl = "()[]";
	boolean dfs(){
		if(idx >= s.length) return true;
		if(s[idx] == '('){
			idx++;
			if(s[idx] != ')' && (!dfs() || idx>=s.length || s[idx] != ')')) return false;
			idx++;
		}else if(s[idx] == '['){
			idx++;
			if(s[idx] != ']' && (!dfs() || idx>=s.length || s[idx] != ']')) return false;
			idx++;
		}
		if(idx < s.length && (s[idx] == '(' || s[idx] == '[')) return dfs();
		return true;
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}