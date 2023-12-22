import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m, d;
	double[] ps, rests, ts;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();
		ps=new double[n];
		rests=new double[n];
		ts=new double[n];
		for(int i=0; i<n; i++){
			ps[i]=sc.nextDouble()/100.0;
			rests[i]=sc.nextDouble();
			double v=sc.nextDouble();
			ts[i]=d/v;
		}
		long[][] C=new long[m+1][m+1];
		C[0][0]=1;
		for(int j=1; j<=m; j++){
			C[j][0]=1;
			for(int i=1; i<=m; i++){
				C[j][i]=C[j-1][i-1]+C[j-1][i];
			}
			// debug(C[j]);
		}

		for(int a=0; a<n; a++){
			double totP=0;
			for(int i=0; i<=m; i++){
				double ta=ts[a]+i*rests[a];
				double pp=C[m][i]*pow(ps[a], i)*pow(1-ps[a], m-i);
				for(int b=0; b<n; b++){
					if(b==a){
						continue;
					}
					double p=0;
					int j;
					for(j=0; j<=m; j++){
						double tb=ts[b]+j*rests[b];
						if(ta+EPS<tb){
							p+=C[m][j]*pow(ps[b], j)*pow(1-ps[b], m-j);
						}
					}
					pp*=p;
				}
				totP+=pp;
			}
			// debug(totP);
			println(String.format("%.7f", totP));
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