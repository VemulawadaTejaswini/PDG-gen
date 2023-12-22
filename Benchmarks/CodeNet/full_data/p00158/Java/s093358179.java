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

	int n;
	int max=1000001;
	int[] memo=new int[max];

	void run(){
		Arrays.fill(memo, -1);
		LinkedList<Integer> que=new LinkedList<Integer>();
		que.offer(1);
		memo[1]=0;
		for(; !que.isEmpty();){
			int m=que.poll();
			if(m*2<max&&memo[m*2]==-1){
				que.offer(m*2);
				memo[m*2]=memo[m]+1;
			}
			if((m-1)%3==0&&m>=4&&memo[(m-1)/3]==-1){
				que.offer((m-1)/3);
				memo[(m-1)/3]=memo[m]+1;
			}
		}
		//debug("gff");
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			println(""+memo[n]);
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