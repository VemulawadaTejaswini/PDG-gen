import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	// Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	int[] a;

	void run(){
		try{
			String[] ss=br.readLine().split(" ");
			n=Integer.parseInt(ss[0]);
			m=Integer.parseInt(ss[1]);
			a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=Integer.parseInt(br.readLine());
			}
			solve();
		}catch(IOException e){}
	}

	void solve(){
		TreeSet<Integer> set=new TreeSet<Integer>();
		int count=0;
		for(int i=n-1; i>=0; i--){
			if(!set.contains(a[i])){
				println(a[i]+"");
				if(++count==m){
					break;
				}
			}
			set.add(a[i]);
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
		new Main().run();
	}
}