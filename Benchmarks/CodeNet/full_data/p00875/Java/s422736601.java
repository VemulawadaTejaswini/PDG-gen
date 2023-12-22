import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		new Main().solve();
	}


	String[] a, b;
	String from, go;
	int MAX = 99999999;
	void solve(){

		Scanner cin = new Scanner(System.in);

		while(true)
		{
			int n = cin.nextInt();
			if(n==0) return;
			a = new String[n];
			b = new String[n];
			for(int i=0;i<n;i++){
				a[i] = cin.next();
				b[i] = cin.next();
			}
			from = cin.next();
			go = cin.next();
			hm = new HashMap<String, Integer>();
			int ret = dfs(from);
			if(ret < MAX) System.out.println(dfs(from));
			else System.out.println(-1);
		}
	}

	HashMap<String, Integer> hm;

	int dfs(String now){
		int ret = MAX;
		if(hm.containsKey(now)) return hm.get(now);
		if(now.length()>=go.length()){
			if(now.equals(go)) return 0;
			else return MAX;
		}
		for(int i = 0; i < a.length;i++){
			String next = sed(now, a[i], b[i]);
			if(now.equals(next)) continue;
			ret = Math.min(dfs(next) + 1 , ret);
		}

		hm.put(now, ret);
		return ret;
	}

	String sed(String now, String from, String to){
		String ret = "";
		for(int i=0;i<now.length();i++){
			if(i<now.length()-from.length()+1 && now.subSequence(i, i + from.length()).equals(from)){
				ret += to;
				i += from.length()-1;
			}
			else ret += now.charAt(i);
		}
		return ret;
	}
}