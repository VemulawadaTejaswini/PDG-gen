import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ5
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ1154();
	}
	
	void AOJ1154(){
		final int MAX=300000;
		boolean[] list=list(MAX);
		//debug
		//for(int i=6; i<=MAX; i++)	if(list[i])	out.print(" "+i);
		//out.println();
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==1)	break;
			out.print(n+":");
			for(int i=6; i<=n; i+=7){
				if(list[i] && n%i==0)	out.print(" "+i);
				if(list[i+2] && n%(i+2)==0)	out.print(" "+(i+2));
			}
			out.println();
		}
	}
	boolean[] list(int MAX){
		boolean[] b=new boolean[MAX+1];
		Arrays.fill(b, false);
		for(int i=6; i<=MAX; i+=7){
			b[i]=true;	b[i+2]=true;
		}
		for(int i=6; i<=MAX; i+=7){
			if(b[i])	for(int j=i+i; j<=MAX; j+=(i))	b[j]=false;
			if(b[i+2])	for(int j=i+i+4; j<=MAX; j+=(i+2))	b[j]=false;
		}
		return b;
	}
	
	void A(){
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int [] taro = new int[n];
			int [] hanako = new int[m];
			int sum1 = 0,sum2 = 0;
			for(int i = 0; i < n; i++){
				taro[i] = sc.nextInt();
				sum1 += taro[i];
			}
			for(int i = 0; i < m ;i++){
				hanako[i] = sc.nextInt();
				sum2 += hanako[i];
			}
			Arrays.sort(taro);
			Arrays.sort(hanako);
			boolean flg = true;
			for(int i =0; i < n ;i++){
				for(int j = 0; j < m; j++){
					int temp1 = sum1 - taro[i] + hanako[j];
					int temp2 = sum2 - hanako[j] + taro[i];
					if(temp1 ==  temp2){
						flg = false;
						System.out.println(taro[i] + " " + hanako[j]);
						break;
					} 
				}
				if(! flg){
					break;
				}
			}
			if(flg){
				System.out.println(-1);
			}
		}
		
	}
}