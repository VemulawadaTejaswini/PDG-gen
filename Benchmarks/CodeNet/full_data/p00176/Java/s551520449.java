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
			String s=sc.next();
			if(s.equals("0")){
				break;
			}
			int r=Integer.parseInt(s.substring(1, 3), 16);
			int g=Integer.parseInt(s.substring(3, 5), 16);
			int b=Integer.parseInt(s.substring(5, 7), 16);
			int k=-1;
			double min=INF;
			for(int i=0; i<8; i++){
				int dr=r-(i/4)*0xff;
				int dg=g-((i/2)%2)*0xff;
				int db=b-(i%2)*0xff;
				double d=Math.sqrt(dr*dr+dg*dg+db*db);
				if(d+EPS<min){
					k=i;
					min=d;
				}
			}
			println(new String[]{"black", "blue", "lime", "aqua", "red",
					"fuchsia", "yellow", "white",}[k]);
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