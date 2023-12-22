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

	int[][] cost, time;
	int n, m, k;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			cost=new int[m][m];
			time=new int[m][m];
			for(int j=0; j<m; j++){
				fill(cost[j], INF);
				fill(time[j], INF);
			}
			for(int i=0; i<n; i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				int c=sc.nextInt();
				int t=sc.nextInt();
				cost[a][b]=cost[b][a]=c;
				time[a][b]=time[b][a]=t;
			}
			for(int k=0; k<m; k++){
				for(int i=0; i<m; i++){
					for(int j=0; j<m; j++){
						cost[i][j]=min(cost[i][j], cost[i][k]+cost[k][j]);
						time[i][j]=min(time[i][j], time[i][k]+time[k][j]);
					}
				}
			}
			k=sc.nextInt();
			for(int i=0; i<k; i++){
				int p=sc.nextInt()-1;
				int q=sc.nextInt()-1;
				int r=sc.nextInt();
				if(r==0){
					println(cost[p][q]+"");
				}else{
					println(time[p][q]+"");
				}
			}
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