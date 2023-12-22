import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);
		char[][] c=new char[3][3];
		for(; sc.hasNext();){
			String s=sc.next();
			for(int j=0; j<3; j++)
				for(int i=0; i<3; i++)
					c[j][i]=s.charAt(j*3+i);
			String ans="d";
			for(int i=0; i<3; i++){
				if(c[i][0]==c[i][1]&&c[i][1]==c[i][2]&&c[i][0]!='s')
					ans=c[i][0]+"";
				if(c[0][i]==c[1][i]&&c[1][i]==c[2][i]&&c[0][i]!='s')
					ans=c[0][i]+"";
			}
			if(c[0][0]==c[1][1]&&c[1][1]==c[2][2]&&c[0][0]!='s')
				ans=c[0][0]+"";
			if(c[0][2]==c[1][1]&&c[1][1]==c[2][0]&&c[0][2]!='s')
				ans=c[0][2]+"";
			println(ans);
		}
		sc.close();
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