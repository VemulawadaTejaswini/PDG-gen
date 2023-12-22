import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// Cosmic Market
// 2012/12/04
public class Main{
	Scanner sc=new Scanner(System.in);

	int r, c, q;
	int[] a, b, order;

	void run(){
		for(;;){
			r=sc.nextInt();
			c=sc.nextInt();
			q=sc.nextInt();
			if((r|c|q)==0){
				return;
			}
			a=new int[q];
			b=new int[q];
			order=new int[q];
			for(int i=0; i<q; i++){
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
				order[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		boolean[] row=new boolean[r];
		boolean[] col=new boolean[c];
		int nRow=0, nCol=0;
		int win=0, lose=0;
		for(int j=q-1; j>=0; j--){
			if(a[j]==0){
				if(row[b[j]]){
					continue;
				}
				row[b[j]]=true;
				if(order[j]==0){
					lose+=c-nCol;
				}else{
					win+=c-nCol;
				}
				nRow++;
			}else{
				if(col[b[j]]){
					continue;
				}
				col[b[j]]=true;
				if(order[j]==0){
					lose+=r-nRow;
				}else{
					win+=r-nRow;
				}
				nCol++;
			}
		}
		println(win+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}