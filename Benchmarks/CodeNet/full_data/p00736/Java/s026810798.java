import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ5
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	
	//AOJ1155
	String str;
	char p,q,r;
	int ind;
	//AOJ1155
	
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ1155();
	}
	void AOJ1155(){
		while(true){
			 str = sc.next();
			 
			 if(str.equals(".")){
				 break;
			 }
			 ind = 0;
			 int count  = 0;
			 for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 3; k++){
						p = (char) (i + '0');
						q = (char) (j + '0');
						r = (char) (k + '0');
						char res = formula();
						if(res == '2'){
							count++;
						}
						ind = 0;
					}
				}
			 }
			 System.out.println(count);
		}
	}
	
	private char formula() {
		char now = str.charAt(ind++);
		if(now == '-'){
			return rev(formula());
		}
		else if(now == '('){
			char temp1 = formula();
			char temp2 = str.charAt(ind++);
			char temp3 = formula();
			str.charAt(ind++);
			if(temp2 == '+'){
				return add(temp1, temp3);
			}
			else{
				return mul(temp1, temp3);
			}
			
		}
		else if(now == 'P'){
			return p;
		}
		else if(now == 'Q'){
			return q;
		}
		else if(now == 'R'){
			return r;
		}
		else{
			return now;
		}
	}
	private char mul(char c1, char c2) {
		int t1 = c1 - '0';
		int t2 = c2 - '0';
		int t3 = Math.min(t1, t2);
		char ans = (char) (t3 + '0');
		return ans;
	}
	private char add(char c1, char c2) {
		int t1 = c1 - '0';
		int t2 = c2 - '0';
		int t3 = Math.max(t1, t2);
		char ans = (char) (t3 + '0');
		return ans;
	}
	private char rev(char c) {
		switch (c){
		case '0': return '2';
		case '1': return '1';
		case '2': return '0';
		}
		return '0';
	}
	
	
	void AOJ1156(){
		while(sc.hasNext()){
			int W=sc.nextInt(),H=sc.nextInt();
			if((W|H)==0)	break;
			int[][] b=new int[W][H];
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++)	b[x][y]=sc.nextInt();
			}
			int[] c=new int[4];
			for(int i=0; i<4; i++)	c[i]=sc.nextInt();
			LinkedList<C1156> open=new LinkedList<C1156>();
			int[][][] close=new int[W][H][4];	// [x][y][v]
			for(int i=0; i<W; i++){
				for(int j=0; j<H; j++){
					for(int k=0; k<4; k++)	close[i][j][k]=Integer.MAX_VALUE;
				}
			}
			open.add(new C1156(0,0,1,0));
			close[0][0][1]=0;
			int ans=Integer.MAX_VALUE;
			while(!open.isEmpty()){
				C1156 now=open.poll();
				for(int i=0; i<=4; i++){
					if(i==b[now.x][now.y])	continue;
					C1156 temp=m(now,(i<4?i:b[now.x][now.y]));
					if(temp==null)	continue;
					if(!Point.ok(temp.x, temp.y, W, H))	continue;
					temp.cost+=(i<4?c[i]:0);
					if(temp.x==W-1 && temp.y==H-1){
						ans=min(ans,now.cost);
						continue;
					}
					if(close[temp.x][temp.y][temp.v]<temp.cost)	continue;
					open.add(temp);
					close[temp.x][temp.y][temp.v]=temp.cost;
				}
			}
			out.println(ans);
		}
	}
	C1156 m(C1156 c1156,int m){
		C1156 now=new C1156(c1156);
		if(m==4)	return null;
		else	now.v=4%(now.v+m);
		/*
		else if(m==1)	;	// 右折
		else if(m==2)	now.v=4%(now.v+2);	// 反転
		else if(m==3)	now.v=4%(now.v+3);	// 左折
			now.v=(now.v>0?now.v-1:3);
		}else	return null;
		*/
		now.x+=vx[now.v];	now.y+=vy[now.v];
		return now;
	}
	// v: 0=上 1=右 2=下 3=左
	class C1156 implements Comparable<C1156>{
		int x,y,v,cost;
		C1156(int x,int y,int v,int cost){this.x=x; this.y=y; this.v=v; this.cost=cost;}
		C1156(C1156 a){this.x=a.x; this.y=a.y; this.v=a.v; this.cost=a.cost;}
		@Override
		public int compareTo(C1156 o) {
			if(this.cost<o.cost)	return -1;
			if(this.cost>o.cost)	return 1;
			return 0;
		}
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