import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	LinkedList<R>[] lists;
	int n,m,r,q;
	
	@SuppressWarnings("unchecked")
	void run() {
		for(;;){
			n=sc.nextInt(); //pc
			m=sc.nextInt(); // student
			if((n|m)==0){
				break;
			}
			r=sc.nextInt();
			R[] rs=new R[n];
			lists=new LinkedList[m]; // st
			for(int i=0;i<m;i++){
				lists[i]=new LinkedList<R>();
			}
			for(int i=0;i<r;i++){
				int t=sc.nextInt();
				int p=sc.nextInt()-1;
				int s=sc.nextInt()-1;
				int log=sc.nextInt();
				if(log==1){
					rs[p]=new R(p,t);
					lists[s].add(rs[p]);
				}else{
					rs[p].end=t;
				}
			}
			/*
			for(int i=0;i<m;i++){
				debug(i);
				for(R r:lists[i]){
					debug(r.pc,r.start,r.end);
				}
			}
			*/
			
			q=sc.nextInt();
			for(int i=0;i<q;i++){
				int start=sc.nextInt();
				int end=sc.nextInt();
				int student=sc.nextInt()-1;
				solve(start,end,student);
			}
		}
	}

	void solve(int start,int end,int student) {
		int s=0,p=-INF;
		for(R r:lists[student]){
			int left=max(r.start,start);
			int right=min(r.end,end);
			s+=max(0,right-max(p,left));
			p=max(p,right);
		}
		//debug(s);
		println(""+s);
	}
	
	class R{
		int pc;
		int start, end;
		R(int pc,int start){
			this.pc=pc;
			this.start=start;
		}
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}