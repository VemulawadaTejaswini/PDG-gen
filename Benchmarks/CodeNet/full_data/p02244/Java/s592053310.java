

import java.util.Scanner;

public class Main {
	public static final int N=8;
	public static final int free=-1;
	public static final int not_free=1;

	static int row[]=new int [N];
	static int col[]=new int [N];
	static int dpos[]=new int [2*N-1];
	static int dneg[]=new int [2*N-1];
	static boolean x[][]=new boolean [N][N];

	public static void initialize(){
		for(int i=0;i<N;i++){
			row[i]=free;
			col[i]=free;
		}
		for(int i=0;i<2*N-1;i++){
			dpos[i]=free;
			dneg[i]=free;
		}
	}
	public static void print(){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(x[i][j]){
					if(row[i]!=j){
						return;
					}
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(row[i]==j?"Q":".");
			}
			System.out.println();
		}
	}
	public static void solve(int i){
		if(i==N){
			print();
			return;
		}
		for(int j=0;j<N;j++){
			if(col[j]==not_free || dpos[i+j]==not_free || dneg[i-j+N-1]==not_free)
				continue;
			row[i]=j;
			col[i]=dpos[i]=dneg[i]=not_free;
			solve(i+1);
			row[i]=col[i]=dpos[i]=dneg[i]=free;
		}
	}
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		initialize();
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				x[i][j]=false;
			}
		}
		int k=stdIn.nextInt();
		for(int i=0;i<k;i++){
			int r=stdIn.nextInt();
			int c=stdIn.nextInt();
			x[r][c]=true;
		}
		solve(0);
	}
}