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
		int max=1000001;
		int[] memo=new int[max];// nツ暗按可コ
		boolean[] f=new boolean[max];
		LinkedList<Integer> que=new LinkedList<Integer>();
		que.offer(1);
		f[1]=true;
		int[] ms={2, 3, 5};
		for(; !que.isEmpty();){
			int n=que.poll();
			for(int m : ms){
				if(n*m<max&&!f[m*n]){
					que.offer(n*m);
					f[n*m]=true;
				}
			}
		}
		for(int i=1; i<max; i++){
			memo[i]=memo[i-1]+(f[i]?1:0);
		}

		for(;;){
			int m=sc.nextInt();
			if(m==0){
				break;
			}
			int n=sc.nextInt();
			println(""+(memo[n]-memo[m-1]));
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