import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	String s;

	void run(){
		for(;;){
			s=sc.nextLine();
			if(s.equals("#")){
				break;
			}
			solve();
		}
	}

	void solve(){
		int n=s.length();
		boolean[] f=new boolean[n];
		boolean[] v=new boolean[n];
		match("[ksthp]y?([iu])[ksthp]", f);
		match("[ksthp]y?([iu])$", f);
		match("[ksthp]y?([ao])[ksthp]y?\\1", f);
		match("([aiueo])", v);
		// debug(f);
		// debug(v);
		int p=-1;
		String ans="";
		for(int i=0; i<n; i++){
			String next=s.charAt(i)+"";
			if(v[i]){
				if(f[i]&&(p==-1||!f[p])){
					next="("+next+")";
				}
				p=i;
			}
			ans+=next;
		}
		println(ans);
	}

	void match(String pattern, boolean[] f){
		int start=0;
		for(Matcher m=Pattern.compile(pattern).matcher(s); m.find(start);){
			for(int i=0; i<=m.groupCount(); i++){
				// debug(m.group(i), m.start(i), m.end(i));
			}
			start=m.start(0)+1;
			f[m.start(1)]=true;
			// debug();
		}
	}

	boolean hit(char c, String pattern){
		return pattern.indexOf(c)>=0;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}