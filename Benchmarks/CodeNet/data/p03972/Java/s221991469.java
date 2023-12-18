import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	int W,H,N;
	long[]p;
	long[]q;
	long INF=Long.MAX_VALUE/2;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		W=sc.nextInt();
		H=sc.nextInt();
		N=(W+1)*(H+1);
		p=new long[W];
		q=new long[H];
		for(int i=0;i<W;i++) {
			p[i]=sc.nextLong();
		}
		for(int i=0;i<H;i++) {
			q[i]=sc.nextLong();
		}
		
		System.out.println(prim());
		
	}
	
	//プライオリティキューを使うプリム法大変
	long prim() {
		PriorityQueue<Long> que=new PriorityQueue<Long>();
		long[]d=new long[N];
		boolean[] used=new boolean[N];
		
		Arrays.fill(d, INF);
		long res=0;
		que.add((long)0);
		d[0]=0;
		used[0]=true;
		W+=1;
		
		while(!que.isEmpty()) {
			long v=que.poll();
			
			int vx=(int)v%W;
			int vy=(int)v/W;
			
			int n1=vy*W+vx-1;
			int n2=vy*W+vx+1;
			int n3=(vy-1)*W+vx;
			int n4=(vy+1)*W+vx;
			
			if(vx>0 && d[vy*W+vx-1]>d[vy*W+vx]+p[vx-1] && !used[n1]) {
				d[vy*W+vx-1]=d[vy*W+vx]+p[vx-1];
				que.add((long)vy*W+vx-1);
				used[vy*W+vx-1]=true;
			}
			if(vx<W-1 && d[vy*W+vx+1]>d[vy*W+vx]+p[vx] && !used[n2]) {
				d[vy*W+vx+1]=d[vy*W+vx]+p[vx];
				que.add((long)vy*W+vx+1);
				used[vy*W+vx+1]=true;
			}
			if(vy>0 && d[vy*W+vx]>d[(vy-1)*W+vx]+q[vy-1] && !used[n3]) {
				d[vy*W+vx]=d[(vy-1)*W+vx]+q[vy-1];
				que.add((long)(vy-1)*W+vx);
				used[(vy-1)*W+vx]=true;
			}
			if(vy<H-1 && d[(vy+1)*W+vx]>d[vy*W+vx]+q[vy] && !used[n4]) {
				d[(vy+1)*W+vx]=d[vy*W+vx]+q[vy];
				que.add((long)(vy+1)*W+vx);
				used[(vy+1)*W+vx]=true;
			}
		}
		return res;
	}
}
