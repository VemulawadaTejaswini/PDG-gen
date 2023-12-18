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
		Arrays.sort(p);
		Arrays.sort(q);
		
		int a=W, b=H;
		int i=0,j=0;
		long ans=0;
		while(a>0 || b>0) {
			if(i==W) {
				ans+=q[j]*(a+1);
				j++;
				b--;
			}else if(j==H) {
				ans+=p[i]*(b+1);
				i++;
				a--;
			}else if(p[i]<q[j]) {
				ans+=p[i]*(b+1);
				i++;
				a--;
			}else {
				ans+=q[j]*(a+1);
				j++;
				b--;
			}
		}
		System.out.println(ans);
	}
}
