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
		int[][] h=new int[4][2];
		double[] ts={1.1, 0.6, 0.2, 0};
		for(; sc.hasNext();){
			for(int j=0; j<2; j++){
				double s=sc.nextDouble();
				for(int i=0; i<4; i++){
					if(s+EPS>ts[i]){
						h[i][j]++;
						break;
					}
				}
			}
		}
		for(int i=0; i<4; i++){
			println(h[i][0]+" "+h[i][1]);
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