import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Treasure Hunt
// 2012/09/19
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	int[] xs, ys;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		xs=new int[n];
		ys=new int[n];
		for(int i=0; i<n; i++){
			xs[i]=sc.nextInt();
			ys[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		TreeSet<Integer> xSet=new TreeSet<Integer>();
		TreeSet<Integer> ySet=new TreeSet<Integer>();

		for(int i=0; i<n; i++){
			xSet.add(xs[i]);
			ySet.add(ys[i]);
		}
		xSet.add((int)1e9);
		ySet.add((int)1e9);
		xSet.add((int)-1e9);
		ySet.add((int)-1e9);

		Integer[] xss=xSet.toArray(new Integer[0]);
		Integer[] yss=ySet.toArray(new Integer[0]);
		
		int w=xss.length;
		int h=yss.length;

		int[][] a=new int[h+1][w+1];
		for(int i=0; i<n; i++){
			int x=binarySearch(xss, xs[i]);
			int y=binarySearch(yss, ys[i]);
			a[y+1][x+1]++;
		}

		for(int j=0; j<h; j++){
			for(int i=0; i<w; i++){
				a[j+1][i+1]+=a[j+1][i]+a[j][i+1]-a[j][i];
			}
		}

		StringBuilder sb=new StringBuilder();
		for(int i=0; i<m; i++){
			int x1=binarySearch(xss, xSet.ceiling(sc.nextInt()));
			int y1=binarySearch(yss, ySet.ceiling(sc.nextInt()));
			int x2=binarySearch(xss, xSet.floor(sc.nextInt()))+1;
			int y2=binarySearch(yss, ySet.floor(sc.nextInt()))+1;
			sb.append(a[y2][x2]-a[y1][x2]-a[y2][x1]+a[y1][x1]);
			sb.append('\n');
		}
		print(sb.toString());
	}

	class Scanner{
		BufferedReader br;
		StringTokenizer st;

		Scanner(InputStream in){
			br=new BufferedReader(new InputStreamReader(in));
			eat("");
		}

		void eat(String s){
			st=new StringTokenizer(s);
		}

		String nextLine(){
			try{
				return br.readLine();
			}catch(IOException e){
				throw new IOError(e);
			}
		}

		boolean hasNext(){
			while(!st.hasMoreTokens()){
				String s=nextLine();
				if(s==null)
					return false;
				eat(s);
			}
			return true;
		}

		String next(){
			hasNext();
			return st.nextToken();
		}

		int nextInt(){
			return Integer.parseInt(next());
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