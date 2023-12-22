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
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
			int out=0;
			int score=0;
			boolean[] runner=new boolean[3];
			for(; out<3;){
				String s=sc.next();
				if(s.equals("HIT")){
					if(runner[2])
						score++;
					runner[2]=runner[1];
					runner[1]=runner[0];
					runner[0]=true;
				}else if(s.equals("HOMERUN")){
					for(int j=0; j<3; j++){
						if(runner[i])
							score++;
						runner[i]=false;
					}
					score++;
				}else{
					out++;
				}
			}
			println(score+"");
			
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