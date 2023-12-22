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
			int b=sc.nextInt();// rbO{[iX 5
			int r=sc.nextInt();// M[{[iX 3
			int g=sc.nextInt();// ÊíuhE
			int c=sc.nextInt();// `F[
			int s=sc.nextInt();// X^[
			int t=sc.nextInt();// Q[
			if((b|r|g|c|s|t)==0){
				break;
			}
			int ans=100+95*b+63*r+7*g+2*c+3*s-3*t;
			println(""+ans);
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