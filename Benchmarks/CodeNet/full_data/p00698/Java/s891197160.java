import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int n, m;
	int[][] a;
	boolean[][] q;
	ArrayList<P> list;

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

	void run(){
		boolean first=true;
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			m=sc.nextInt();
			a=new int[n+1][m+1];
			q=new boolean[n+1][m+1];
			list=new ArrayList<P>();
			for(int j=0; j<=n; j++){
				for(int i=0; i<=m; i++){
					String s=sc.next();
					if(s.equals("?")){
						q[j][i]=true;
						list.add(new P(i, j));
					}else{
						a[j][i]=Integer.parseInt(s);
					}
				}
			}
			if(first){
				first=false;
			}else{
				println("");
			}
			solve();
		}
	}

	void solve(){
		for(;;){
			int[] sumM=new int[m];
			int[] sumN=new int[n];
			int[] qM=new int[m];
			int[] qN=new int[n];
			boolean[] oneM=new boolean[m];
			boolean[] oneN=new boolean[n];

			for(int i=0; i<m; i++){
				int count=0;
				for(int j=0; j<n; j++){
					if(q[j][i]){
						qM[i]=j;
						count++;
					}else{
						sumM[i]+=a[j][i];
					}
				}
				oneM[i]=count==1;
			}

			for(int j=0; j<n; j++){
				int count=0;
				for(int i=0; i<m; i++){
					if(q[j][i]){
						qN[j]=i;
						count++;
					}else{
						sumN[j]+=a[j][i];
					}
				}
				oneN[j]=count==1;
			}

			boolean update=false;

			for(int i=0; i<m; i++){
				if(oneM[i]){
					oneN[qM[i]]=false;// ツつ「ツづァツづア
					q[qM[i]][i]=false;
					a[qM[i]][i]=a[n][i]-sumM[i];
					update=true;
				}
			}

			for(int j=0; j<n; j++){
				if(oneN[j]){
					q[j][qN[j]]=false;
					a[j][qN[j]]=a[j][m]-sumN[j];
					update=true;
				}
			}

			if(!update){
				break;
			}
		}

		boolean all=true;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				all&=!q[j][i];
			}
		}
		if(all){
			for(P p : list){
				println(""+a[p.y][p.x]);
			}
		}else{
			println("NO");
		}
	}

	void dfs(){
		boolean[] oneM=new boolean[m];
		boolean[] oneN=new boolean[n];

		for(int i=0; i<m; i++){
			int count=0;
			for(int j=0; j<n; j++){
				if(q[j][i]){
					count++;
				}
			}
			oneM[i]=count==1;
		}

		for(int j=0; j<n; j++){
			int count=0;
			for(int i=0; i<m; i++){
				if(q[j][i]){
					count++;
				}
			}
			oneN[j]=count==1;
		}

		for(int j=0; j<n; j++){
			// 1ツづ按づ個つェツつ?づェツづ篠個按津ィ
			if(oneN[j]){

			}
		}
	}

	void debug(Object... os){
		System.err.println(deepToString(os));
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