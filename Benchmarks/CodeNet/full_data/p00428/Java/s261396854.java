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
		for(;;){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			class R{
				int id, count;
			}
			R[] rs=new R[m];
			for(int i=0; i<m; i++){
				rs[i]=new R();
				rs[i].id=i+1;
			}
			for(int j=0; j<n; j++){
				for(int i=0; i<m; i++){
					rs[i].count+=sc.nextInt();
				}
			}
			Arrays.sort(rs, new Comparator<R>(){
				@Override
				public int compare(R r1, R r2){
					if(r1.count!=r2.count){
						return r2.count-r1.count;
					}else{
						return r1.id-r2.id;
					}
				}
			});
			for(int i=0; i<m; i++){
				print(rs[i].id+(i==m-1?"\n":" "));
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