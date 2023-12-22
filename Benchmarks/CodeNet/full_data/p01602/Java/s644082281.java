import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// 2013/03/16
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;

	int n;
	int[] a, b;

	void run(){
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.next().charAt(0);
			b[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		int left=0;
		boolean ok=true;
		for(int i=0; i<n; i++){
			if(a[i]=='('){
				left+=b[i];
			}else{
				left-=b[i];
			}
			ok&=left>=0;
		}
		ok&=left==0;
		println(ok?"YES":"NO");
	}

	void println(String s){
		System.out.println(s);
	}

	void debug(Object... os){
		System.err.println(deepToString(os));
	}

	public static void main(String[] args){
		new Main().run();
	}

}