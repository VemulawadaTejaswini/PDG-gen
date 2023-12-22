import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int a, b, c, d, e;
	int na, nb, nc;

	void run(){
		for(;;){
			a=sc.nextInt();
			if(a==0){
				break;
			}
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			na=sc.nextInt();
			nb=sc.nextInt();
			nc=sc.nextInt();
			solve();
		}
	}

	void solve(){
		int tot;
		if(nc>=d){
			tot=e*nc+b*nb+a*na;
		}else{
			// nc<d
			int sum=c*nc, count=nc;
			int D=min(d-count, nb);
			nb-=D;
			sum+=b*D;
			count+=D;
			D=min(d-count, na);
			na-=D;
			sum+=a*D;
			count+=D;
//			debug(sum, count, na, nb, nc);

			sum=min(sum, d*e);
			tot=sum+b*nb+a*na;
		}
//		debug(tot);
		println(tot+"");
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
		new Main().run();
	}
}