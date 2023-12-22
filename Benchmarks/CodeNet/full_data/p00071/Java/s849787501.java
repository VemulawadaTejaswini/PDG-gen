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

	int n=8;

	int[][] map;

	void run(){
		sc=new Scanner(System.in);
		int d=sc.nextInt();
		for(int t=0; t<d; t++){
			map=new int[n][n];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<n; i++)
					map[j][i]=s.charAt(i)=='0'?0:1;
			}
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			bomb(x, y);
			println("Data "+(t+1)+":");
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++)
					print(map[j][i]+"");
				println("");
			}
		}
		sc.close();
	}

	void bomb(int x, int y){
		map[y][x]=0;
		for(int i=-3; i<=3; i++){
			if(i==0)
				continue;
			int x2=x+i;
			int y2=y;
			if(x2>=0&&x2<n&&y2>=0&&y2<n)
				if(map[y2][x2]==1)
					bomb(x2, y2);
			x2=x;
			y2=y+i;
			if(x2>=0&&x2<n&&y2>=0&&y2<n)
				if(map[y2][x2]==1)
					bomb(x2, y2);
		}
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