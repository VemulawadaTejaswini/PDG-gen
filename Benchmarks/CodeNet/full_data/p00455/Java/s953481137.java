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
		for(int i=0; i<3; i++){
			int h1=sc.nextInt();
			int m1=sc.nextInt();
			int s1=sc.nextInt();
			int h2=sc.nextInt();
			int m2=sc.nextInt();
			int s2=sc.nextInt();
			int h=h2-h1;
			int m=m2-m1;
			int s=s2-s1;
			if(s<0){
				s+=60;
				m--;
			}
			if(m<0){
				m+=60;
				h--;
			}
			println(h+" "+m+" "+s);
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