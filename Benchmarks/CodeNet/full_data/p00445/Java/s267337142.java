import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(; sc.hasNext();){
			char[] s=sc.next().toCharArray();
			int a1=0, a2=0;
			for(int i=0; i<s.length-2; i++){
				if(s[i]=='J'&&s[i+1]=='O'&&s[i+2]=='I'){
					a1++;
				}
				if(s[i]=='I'&&s[i+1]=='O'&&s[i+2]=='I'){
					a2++;
				}
			}
			println(a1+"");
			println(a2+"");
		}
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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}