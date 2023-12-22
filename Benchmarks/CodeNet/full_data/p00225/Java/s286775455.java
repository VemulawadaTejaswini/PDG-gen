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
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int[] a=new int['z'-'a'+1];
			for(int i=0; i<n; i++){
				String s=sc.next();
				a[s.charAt(0)-'a']++;
				a[s.charAt(s.length()-1)-'a']--;
			}
			boolean f=true;
			for(int i=0; i<'z'-'a'+1; i++){
				f&=a[i]==0;
			}
			println(f?"OK":"NG");
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