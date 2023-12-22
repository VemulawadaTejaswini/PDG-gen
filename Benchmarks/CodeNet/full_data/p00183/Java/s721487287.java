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

	int[][] a;
	int n;

	void run(){
		n=3;
		for(;;){
			a=new int[n][n];
			for(int j=0; j<n; j++){
				String s=sc.next();
				if(s.equals("0")){
					return;
				}
				for(int i=0; i<n; i++){
					switch(s.charAt(i)){
					case 'b':
						a[j][i]=0;
						break;
					case 'w':
						a[j][i]=1;
						break;
					case '+':
						a[j][i]=-1;
						break;
					}
				}
			}
			solve();
		}
	}

	void solve(){
		if(check(0)){
			println("b");
		}else if(check(1)){
			println("w");
		}else{
			println("NA");
		}
	}

	boolean check(int e){
		boolean f=false;
		for(int j=0; j<n; j++){
			boolean f1=true, f2=true;
			for(int i=0; i<n; i++){
				f1&=a[j][i]==e;
				f2&=a[i][j]==e;
			}
			f|=f1|f2;
		}
		boolean f1=true, f2=true;
		for(int i=0; i<n; i++){
			f1&=a[i][i]==e;
			f2&=a[i][n-1-i]==e;
		}
		return f|f1|f2;
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