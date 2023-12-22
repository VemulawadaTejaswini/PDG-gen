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
			// 8.4
			String s=sc.next();
			String t=sc.next();
			if(s.equals("0")){
				break;
			}
			int hit=0, blow=0;
			for(int j=0; j<4; j++){
				if(t.charAt(j)==s.charAt(j)){
					hit++;
				}
				for(int i=0; i<4; i++){
					if(t.charAt(j)==s.charAt(i)){
						blow++;
					}
				}
			}
			blow-=hit;
			println(hit+" "+blow);
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