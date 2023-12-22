package p1136;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		while(true){
			int n  =cin.nextInt();
			if(n==0){
				break;
			}
			Line[] a = new Line[n+1];
			for(int i = 0;i<=n;i++){
				int m = cin.nextInt();
				a[i]=new Line(m);
				for(int j = 0;j<m;j++){
					int x=cin.nextInt();
					int y=cin.nextInt();
					a[i].lines[j][0]=x;
					a[i].lines[j][1]=y;
				}
			}
			for(int i = 1;i<=n;i++){
				if(a[0].equal(a[i])){
					System.out.println(i);
				}
			}
			System.out.println("+++++");
		}
		
	}
}
class Line{
	int size;
	int[][] lines; 
	Line(int a){
		size=a;
		lines=new int[a][2];
	}
	int[] v(int a,int b){
		int[] re = new int[2];
		re[0]=lines[b][0]-lines[a][0];
		re[1]=lines[b][1]-lines[a][1];
		return re;
	}
	void roll(){

			for(int i = 0;i<size;i++){
				int v1[]=this.lines[i].clone();
				this.lines[i][0]=-v1[1];
				this.lines[i][1]=v1[0];
			}
			
	}
	boolean equal(Line a){
		if(this.size!=a.size){
			return false;
		}
//		System.out.println("**************");
		for(int j = 0;j<4;j++){
			boolean f =true;
			for(int i = 0;i<size-1;i++){
				int[] v1=this.v(i+1, i);
				int[] v2=a.v(i+1, i);
//				System.out.println(v1[0]+" "+v1[1] + "   " + v2[0]+" "+v2[1]);
				if(!(v1[0]==v2[0]&&v1[1]==v2[1])){
					f=false;
				}
			}
			if(f){
				return true;
			}
//			System.out.println("-------------");
			f=true;
			for(int i = 0;i<size-1;i++){
				int[] v1=this.v(i+1, i);
				int[] v2=a.v(size-1-i,size-i-2);
//				System.out.println(v1[0]+" "+v1[1] + "   " + v2[0]+" "+v2[1]);
				if(!(v1[0]==v2[0]&&v1[1]==v2[1])){
					f=false;
				}
			}
			if(f){
				return true;
			}
			//System.out.println("-------------");
			a.roll();
		}
		return false;
	}
}