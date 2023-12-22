//No sorceries shall prevail.
import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	
	
	//Main
	void main() {
		
		int n=inp.nextInt();
		int m=inp.nextInt();
		int q=inp.nextInt();
		int a[][]=new int[n][m];
		while(q-->0) {
			int x=inp.nextInt()-1;
			int y=inp.nextInt()-1;
			a[x][y]=1;
		}
		int rowSum[]=new int[n];
		int colSum[]=new int[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				rowSum[i]+=a[i][j];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				colSum[i]+=a[j][i];
			}
		}
		int gg=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				gg=Math.max(gg, a[i][j]==1?rowSum[i]+colSum[j]-1:rowSum[i]+colSum[j]);
			}
		}
		System.out.println(gg);
	}
    
    
		
}
