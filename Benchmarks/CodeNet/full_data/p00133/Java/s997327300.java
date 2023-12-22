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
		int n=8;
		String[] ss=new String[n];
		for(int j=0; j<n; j++){
			ss[j]=sc.next();
		}
		println("90");
		for(int i=0; i<n; i++){
			for(int j=n-1; j>=0; j--){
				print(""+ss[j].charAt(i));
			}
			println("");
		}
		println("180");
		for(int j=n-1; j>=0; j--){
			for(int i=n-1; i>=0; i--){
				print(""+ss[j].charAt(i));
			}
			println("");
		}
		println("270");
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<n; j++){
				print(""+ss[j].charAt(i));
			}
			println("");
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