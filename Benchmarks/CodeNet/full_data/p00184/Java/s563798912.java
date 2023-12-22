import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){
			return (min<=x&&x<X && min<=y&&y<Y)?true:false;
		}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
		static void DE(char[][] c,int sx,int sy,int ex,int ey){
			out.println("--------------------");
			for(int y=sy; y<ey; y++){
				for(int x=sx; x<ex; x++)out.print(c[x][y]);
				out.println();
			}
			out.println("--------------------");
		}
		static void DE(int[][] c,int sx,int sy,int ex,int ey){
			out.println("--------------------");
			for(int y=sy; y<ey; y++){
				for(int x=sx; x<ex; x++)out.print(c[x][y]+" ");
				out.println();
			}
			out.println("--------------------");
		}
	}
	public static void main(String[] args) {
		new Main().AOJ0184();
	}
	
	void AOJ0184(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int[] ans=new int[7];
			for(int i=0; i<n; i++){
				int in=sc.nextInt(),p=0;
				while(true){
					in-=10;
					if(in<0){
						ans[p]++;
						break;
					}
					if(++p>=6){
						ans[6]++;
						break;
					}
				}
			}
			for(int i=0; i<7; i++)	out.println(ans[i]);
		}
	}
	
	void AOJ0183(){
		while(sc.hasNext()){
			int[][] b=new int[3][3],w=new int[3][3];
			for(int y=0; y<3; y++){
				String line=sc.next();
				if(line.equals("0"))	System.exit(0);
				for(int x=0; x<3; x++){
					b[x][y]=(line.charAt(x)=='b'?1:0);
					w[x][y]=(line.charAt(x)=='w'?1:0);
				}
			}
			String ans="NA";
			for(int i=0; i<3; i++){
				if(b[i][0]+b[i][1]+b[i][2]==3){
					ans="b";
					break;
				}
				if(w[i][0]+w[i][1]+w[i][2]==3){
					ans="w";
					break;
				}
				if(b[0][i]+b[1][i]+b[2][i]==3){
					ans="b";
					break;
				}
				if(w[0][i]+w[1][i]+w[2][i]==3){
					ans="w";
					break;
				}
			}
			if(!ans.equals("NA")){
				out.println(ans);
				continue;
			}
			if(b[0][0]+b[1][1]+b[2][2]==3 || b[2][0]+b[1][1]+b[0][2]==3)	ans="b";
			if(w[0][0]+w[1][1]+w[2][2]==3 || w[2][0]+w[1][1]+w[0][2]==3)	ans="w";
			out.println(ans);
		}
	}
	
	// DP
	void AOJ1126(){
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			if((W|H)==0)	break;
			char[][] c=new char[W][H];
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++)	c[x][y]=line.charAt(x);
			}
			String[][] dp=new String[W][H];
			for(int i=0; i<W; i++){
				for(int j=0; j<H; j++)	dp[i][j]="";
			}
			String ans="";
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++){
					if(Character.isDigit(c[x][y])){
						dp[x][y]=max1126((x-1>=0?dp[x-1][y]:""),(y-1>=0?dp[x][y-1]:""))+Character.digit(c[x][y], 10);
						ans=max1126(ans,dp[x][y]);
					}
				}
			}
			out.println(ans);
		}
	}
	String max1126(String a,String b){
		if(a=="")	return b;
		if(b=="")	return a;
		while(a.charAt(0)=='0'){
			if(a.length()<=1){
				a="";
				break;
			}else	a=a.substring(1);
		}
		while(b.charAt(0)=='0'){
			if(b.length()<=1){
				b="";
				break;
			}else	b=b.substring(1);
		}
		if(a=="")	return b;
		if(b=="")	return a;
		if(a.length()>b.length())	return a;
		if(b.length()>a.length())	return b;
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)>b.charAt(i))	return a;
			if(a.charAt(i)<b.charAt(i))	return b;
		}
		return a;
	}
	
	// TODO TLE
	void AOJ0185(){
		ArrayList<Integer> prime=SieveList(1000000);
		while(sc.hasNext()){
			int n=sc.nextInt(),ans=0;
			if(n==0)	break;
			for(int i=0; i<prime.size(); i++){
				if(prime.get(i)>=n)	break;
				for(int j=i; j<prime.size(); j++){
					int temp=prime.get(i)+prime.get(j);
					if(temp>=n){
						//if(temp==n)	out.println("  "+prime.get(i)+" + "+prime.get(j)+" = "+temp);
						ans+=(temp==n?1:0);
						break;
					}
				}
			}
			out.println(ans);
		}
	}
	
	void AOJ0174(){
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			if(c[0]=='0')	break;
			int a=0,b=0;
			for(int i=1; i<c.length; i++){
				if(c[i]=='A')	a++;
				else if(c[i]=='B')	b++;
			}
			a+=(a>b?1:0);	b+=(b>a?1:0);
			out.println(a+" "+b);
		}
	}
	
	void AOJ0173(){
		for(int i=0; i<9; i++){
			String s=sc.next();	int a=sc.nextInt(),b=sc.nextInt();
			out.println(s+" "+(a+b)+" "+(a*200+b*300));
		}
	}
	
	
	// 途中
	void AOJ0121(){
		while(sc.hasNext()){
			int[] b=new int[8];
			for(int i=0; i<8; i++)	b[i]=sc.nextInt();
			LinkedList<int[]> open=new LinkedList<int[]>();
			open.add(b);
			HashSet<int[]> close=new HashSet<int[]>();
			close.add(b);
			int ans=0;
			while(!open.isEmpty()){
				int[] now=open.poll();
				if(solve121(now))	break;
				for(int i=0; i<7; i++){
					int[] temp=now.clone();
					int temp2=temp[i+1];
					temp[i+1]=temp[i];
					temp[i]=temp2;
					if(close.contains(temp))	continue;
					if(solve121(temp)){
						open.clear();
						break;
					}
					open.add(temp);
					close.add(temp);
				}
				ans++;
			}
			out.println(ans);
		}
	}
	boolean solve121(int[] b){
		for(int i=0; i<8; i++)	if(b[i]!=i)	return false;
		return true;
	}
	boolean cont121(int[] a,int[] b){
		for(int i=0; i<8; i++)	if(a[i]!=b[i])	return false;
		return true;
	}
	
	void AOJ1104(){
		while(sc.hasNext()){
			int W=sc.nextInt(),H=sc.nextInt();
			if((W|H)==0)	break;
			int x=1,y=1,d=2;
			// 右-1 左+1
			while(true){
				String s=sc.next();
				if(s.equals("STOP"))	break;
				else if(s.equals("FORWARD")){
					int n=sc.nextInt();
					x=max(1,min(W,x+n*vx[d]));
					y=max(1,min(H,y+n*vy[d]));
				}else if(s.equals("BACKWARD")){
					int n=sc.nextInt();
					x=max(1,min(W,x+n*-1*vx[d]));
					y=max(1,min(H,y+n*-1*vy[d]));
				}else if(s.equals("RIGHT"))	d=(d==0?3:d-1);
				else if(s.equals("LEFT"))	d=(d==3?0:d+1);
				//out.println("D"+x+" "+y+" "+d);
			}
			out.println(x+" "+y);
		}
	}
	
	void AOJ1114(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			int[][] b=new int[5][5];
			for(int y=0; y<5; y++){
				for(int x=0; x<5; x++)	b[x][y]=sc.nextInt();
			}
			int ans=0;
			for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					if(b[i][j]==1)	ans=max(ans,solve1114(i,j,b));
				}
			}
			out.println(ans);
		}
	}
	int solve1114(int x,int y,int[][] b){
		int ans=0;
		for(int i=0; i+x<5; i++){
			if(b[i+x][y]==0)	break;
			boolean flag=true;
			for(int j=0; j+y<5; j++){
				for(int k=0; k<=i; k++){
					for(int l=0; l<=j; l++){
						if(b[k+x][l+y]==0){
							flag=false;
							break;
						}
					}
					if(!flag)	break;
				}
				if(!flag)	break;
				ans=max(ans,(i+1)*(j+1));
			}
		}
		return ans;
	}
	
	int step=0;
	// バックトラック（TLE）
	void Old2AOJ1126(){
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			if((W|H)==0)	break;
			char[][] c=new char[W][H];
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++)	c[x][y]=line.charAt(x);
			}
			String ans="";
			for(int x=0; x<W; x++){
				for(int y=0; y<H; y++){
					if(Character.isDigit(c[x][y])){
						if(x>0)	if(Character.isDigit(c[x-1][y]) && c[x-1][y]!='0')	continue;
						if(y>0)	if(Character.isDigit(c[x][y-1]) && c[x][y-1]!='0')	continue;
						if(c[x][y]=='0')	continue;
						String temp=solve1126(x,y,""+c[x][y],c,W,H);
						ans=compara1126(temp,ans)?temp:ans;
					}
				}
			}
			out.println(ans);
		}
		// debug
		out.println(step+"steps");
	}
	String solve1126(int x,int y,String ans,char[][] c,int W,int H){
		String r=ans;
		// debug
		step++;
		//out.println(ans);
		for(int i=1; i<3; i++){
			int xx=x+vx[i], yy=y+vy[i];
			if(!Point.ok(xx,yy,W,H))	continue;
			if(Character.isDigit(c[xx][yy])){
				String temp=solve1126(xx,yy,ans+c[xx][yy],c,W,H);
				r=compara1126(r,temp)?r:temp;
				out.println(temp);
			}
		}
		return r;
	}
	// 第一引数aの方が大きい時のみtrue
	boolean compara1126(String a,String b){
		if(a.length()>b.length())	return true;
		if(a.length()==b.length()){
			for(int i=0; i<a.length(); i++){
				if(a.charAt(i)>b.charAt(i))	return true;
				if(a.charAt(i)<b.charAt(i))	return false;
			}
		}
		return false;
	}
	// 横型探索（MLE）
	void OldAOJ1126(){
		int step=0;
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			String ans="";
			if((W|H)==0)	break;
			char[][] c=new char[W][H];
			String[][] close=new String[W][H];
			LinkedList<C1126> open=new LinkedList<C1126>();
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++){
					c[x][y]=line.charAt(x);
					if(Character.isDigit(line.charAt(x))){
						if(x>0)	if(Character.isDigit(c[x-1][y]))	continue;
						if(y>0)	if(Character.isDigit(c[x][y-1]))	continue;
						open.add(new C1126(x,y,""+c[x][y]));
						close[x][y]=""+c[x][y];
					}
				}
			}
			while(!open.isEmpty()){
				C1126 now=open.poll();
				// debug
				out.println("ANS"+ans+" NOW"+now.ans);
				ans=now.compara(ans)?new String(now.ans):ans;
				for(int i=1; i<3; i++){
					int xx=now.x+vx[i], yy=now.y+vy[i];
					if(!Point.ok(xx,yy,W,H))	continue;
					if(Character.isDigit(c[xx][yy])){
						C1126 temp=new C1126(xx,yy,now.ans+c[xx][yy]);
						if(close[xx][yy]==null){
							open.add(temp);
							close[xx][yy]=temp.ans;
							step++;
						}else if(temp.compara(close[xx][yy])){
							open.add(temp);
							close[xx][yy]=temp.ans;
							step++;
						}
					}
				}
			}
			out.println(ans);
		}
		out.println(step+"step");
	}
	class C1126{
		int x,y;	String ans;
		C1126(int x,int y,String ans){
			this.x=x;	this.y=y;
			if(ans.length()>0){
				int i=0;
				while(ans.charAt(i)=='0'){
					if(++i>=ans.length()-1)	break;
					ans=ans.substring(i);
				}
			}
			this.ans=ans;
		}
		boolean compara(String ans){
			if(this.ans.length()>ans.length())	return true;
			if(this.ans.length()==ans.length()){
				for(int i=0; i<ans.length(); i++){
					if(ans.charAt(i)<this.ans.charAt(i))	return true;
					if(ans.charAt(i)>this.ans.charAt(i))	return false;
				}
			}
			return false;
		}
	}
	
	void AOJ0165(){
		final int MAX=1000000;
		boolean[] prime=Sieve(MAX);
		int[] prime2=new int[MAX+1];
		for(int i=2; i<=MAX; i++)	prime2[i]=(prime[i]?prime2[i-1]+1:prime2[i-1]);
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			int ans=0;
			for(int i=1; i<=N; i++){
				int p=sc.nextInt(), m=sc.nextInt();
				int min=max(1,p-m), max=min(MAX, p+m);
				ans+=prime2[max]-prime2[min-1]-1;
			}
			out.println(max(0,ans));
		}
	}
	
	void AOJ1144(){
		while(sc.hasNext()){
			int X=sc.nextInt(), Y=sc.nextInt();
			if((X|Y)==0)	break;
			char[][] c=new char[X][Y];
			for(int y=0; y<Y; y++){
				String line=sc.next();
				for(int x=0; x<X; x++){
					c[x][y]=line.charAt(x);
				}
			}
		}
	}
	
	
	// TODO 果樹園　RE　横型
	void AOJ0118(){
		while(sc.hasNext()){
			int X=sc.nextInt(), Y=sc.nextInt(), ans=0;
			if((X|Y)==0)	break;
			char[][] c=new char[X+2][Y+2];
			for(int y=0; y<Y; y++){
				String line=sc.next();
				for(int x=0; x<X; x++){
					c[x][y]=line.charAt(x);
				}
			}
			// debug
			//Point.DE(c, 0, 0, X, Y);
			for(int x=0; x<X; x++){
				for(int y=0; y<Y; y++){
					if(c[x][y]=='&')	continue;
					ans++;
					LinkedList<Point> open=new LinkedList<Point>();
					open.add(new Point(x,y));
					c[x][y]='&';
					char mark=c[x][y];
					while(!open.isEmpty()){
						Point now=open.poll();
						for(int i=0; i<4; i++){
							int xx=now.x+vx[i], yy=now.y+vy[i];
							if(!Point.ok(xx,yy,X,Y))	continue;
							if(c[xx][yy]==mark){
								open.add(new Point(xx,yy));
								c[xx][yy]='&';
							}
						}
					}
					//Point.DE(c, 0, 0, X, Y);
					//out.println("ANS"+ans);
				}
			}
			out.println(ans);
		}
	}
	
	// Red and Black 横型探索
	void AOJ1130(){
		while(sc.hasNext()){
			int X=sc.nextInt(), Y=sc.nextInt(),sx=0,sy=0,ans=0;
			if(X==0)	break;
			char[][] c=new char[X][Y];
			for(int y=0; y<Y; y++){
				char[] line=sc.next().toCharArray();
				for(int x=0; x<X; x++){
					c[x][y]=line[x];
					if(line[x]=='@'){
						sx=x;	sy=y;
					}
				}
			}
			LinkedList<Point> open=new LinkedList<Point>();
			open.add(new Point(sx,sy));
			boolean[][] close=new boolean[X][Y];
			while(!open.isEmpty()){
				ans++;
				Point now=open.poll();
				close[now.x][now.y]=true;
				for(int i=0; i<4; i++){
					if(now.x+vx[i]<0 || now.x+vx[i]>=X || now.y+vy[i]<0 || now.y+vy[i]>=Y)	continue;
					if(c[now.x+vx[i]][now.y+vy[i]]=='.' && !close[now.x+vx[i]][now.y+vy[i]]){
						open.add(new Point(now.x+vx[i], now.y+vy[i]));
						close[now.x+vx[i]][now.y+vy[i]]=true;
					}
				}
			}
			out.println(ans);
		}
	}
	
	// TODO デパート　TLE MLE WA
	void AOJ0223(){
		while(sc.hasNext()){
			int X=sc.nextInt(),	Y=sc.nextInt();
			if(X==0)	break;
			int tx=sc.nextInt(), ty=sc.nextInt(), kx=sc.nextInt(), ky=sc.nextInt();
			int[][] b=new int[X+1][Y+1];
			for(int y=1; y<=Y; y++){
				for(int x=1; x<=X; x++)	b[x][y]=sc.nextInt();
			}
			LinkedList<C0223> open=new LinkedList<C0223>();
			open.add(new C0223(tx,ty,kx,ky,0));
			int[][][][] close2=new int[X+1][Y+1][X+1][Y+1];
			close2[tx][ty][kx][ky]=-1;
			int ans=-1;
			while(!open.isEmpty()){
				C0223 now=open.poll();
				if(now.ans()){
					ans=now.sec;
					break;
				}
				if(now.sec>=99)	break;
				for(int i=0; i<4; i++){
					if(0<now.tx+vx[i]&&now.tx+vx[i]<=X && 0<now.ty+vy[i]&&now.ty+vy[i]<=Y && 0<now.kx-vx[i]&&now.kx-vx[i]<=X && 0<now.ky-vy[i]&&now.ky-vy[i]<=Y){
						tx=now.tx;	ty=now.ty;	kx=now.kx;	ky=now.ky;
						if(b[tx+vx[i]][ty+vy[i]]==0){
							tx+=vx[i];	ty+=vy[i];
						}
						if(b[kx-vx[i]][ky-vy[i]]==0){
							kx-=vx[i];	ky-=vy[i];
						}
						//out.println("TEMP:"+tx+" "+ty+" "+kx+" "+ky);
						//if(tx==kx && ty==ky)	ans=ans<0?now.sec+1:min(ans,now.sec+1);
						if(close2[tx][ty][kx][ky]==0 || close2[tx][ty][kx][ky]>now.sec+1){
							//out.println("ADD:"+tx+" "+ty+" "+kx+" "+ky);
							open.add(new C0223(tx,ty,kx,ky,now.sec+1));
							close2[tx][ty][kx][ky]=now.sec+1;
						}
					}
				}
			}
			out.println(ans<0? "NA": ans);
		}
	}
	class C0223{
		int tx,ty,kx,ky,sec;
		C0223(int tx, int ty, int kx, int ky, int sec){
			this.tx=tx;	this.ty=ty;	this.kx=kx;	this.ky=ky;	this.sec=sec;
		}
		boolean ans(){
			if(this.tx==this.kx && this.ty==this.ky)	return true;
			else	return false;
		}
	}
	
	
	// TODO WA
	void AOJ0142(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int nn=(n-1)/2;
			boolean[] b=new boolean[n];
			for(int i=1; i<n; i++)	b[(i*i)%n]=true;
			ArrayList<Integer> ar=new ArrayList<Integer>();
			for(int i=1; i<n; i++){
				if(b[i])	ar.add(i);
			}
			int[] ans=new int[nn+1];
			for(int i=0; i<ar.size(); i++){
				for(int j=0; j<ar.size(); j++){
					if(i==j)	continue;
					int temp=ar.get(i)-ar.get(j);
					temp+= temp<0? n:0;
					temp= temp>nn? n-temp: temp;
					ans[temp]++;
				}
			}
			for(int i=1; i<=nn; i++)	out.println(ans[i]);
		}
	}
	
	
	// レゴ　横型探索
	void AOJ0207(){
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			if((W|H)==0)	break;
			int sx=sc.nextInt(), sy=sc.nextInt(), gx=sc.nextInt(), gy=sc.nextInt(), n=sc.nextInt();
			int[][] b=new int[W+1][H+1];
			for(int i=0; i<n; i++){
				int color=sc.nextInt(), d=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
				if(d==0){	// 横 4x2
					for(int j=y; j<y+2; j++){
						for(int k=x; k<x+4; k++)	b[k][j]=color;
					}
				}else{	// 縦 2x4
					for(int j=y; j<y+4; j++){
						for(int k=x; k<x+2; k++)	b[k][j]=color;
					}
				}
			}
			// debug
			//de0207(b,W,H);
			int c=b[sx][sy];
			if(c==0){
				out.println("NG");
				continue;
			}
			LinkedList<Point> open=new LinkedList<Point>();
			boolean[][] close=new boolean[W+1][H+1];
			open.add(new Point(sx,sy));
			close[sx][sy]=true;
			String ans="NG";
			while(!open.isEmpty()){
				Point now=open.poll();
				for(int i=0; i<4; i++){
					int xx=now.x+vx[i], yy=now.y+vy[i];
					if(!Point.ok(xx, yy, W+1, H+1, 1))	continue;
					if(b[xx][yy]!=c)	continue;
					if(close[xx][yy])	continue;
					open.add(new Point(xx,yy));
					close[xx][yy]=true;
					if(xx==gx && yy==gy){
						ans="OK";
						open.clear();
					}
				}
			}
			out.println(ans);
		}
	}
	void de0207(int[][] b, int w, int h){
		for(int j=0; j<=h; j++){
			for(int i=0; i<=w; i++)	out.print(b[i][j]+" ");
			out.println();
		}
		for(int i=0; i<=w; i++)	out.print("-");
		out.println();
	}
	
	void AOJ0139(){
		int N=sc.nextInt();
		final Pattern ap=Pattern.compile("^>'(=+)#(=+)~$");
		for(int i=1; i<=N; i++){
			String s=sc.next();
			Matcher m=ap.matcher(s);
			if(m.matches()){
				if(m.group(1).length()==m.group(2).length()){
					out.println("A");
					continue;
				}
			}else if(Pattern.compile("^>\\^(Q=)+~~$").matcher(s).matches()){
				out.println("B");
				continue;
			}
			out.println("NA");
		}
	}
	
	ArrayList<Integer> SieveList(int N){
		ArrayList<Integer> prime=new ArrayList<Integer>();
		boolean[] list = new boolean[N+1];
		Arrays.fill(list, true);
		list[0]=false;	list[1]=false;
		prime.add(2);
		for(int j=4; j<=N; j+=2)	list[j]=false;
		for(int i=3; i<=N; i+=2){
			if(list[i]){
				prime.add(i);
				for (int j=i+i; j<=N; j+=i)	list[j]=false;
			}
		}
		return prime;
	}
	
	boolean[] Sieve(int N){
		boolean[] list = new boolean[N+1];
		Arrays.fill(list, true);
		list[0]=false;	list[1]=false;
		for(int j=4; j<=N; j+=2)	list[j]=false;
		for(int i=3; i*i<=N; i+=2)	if(list[i])	for (int j=i+i; j<=N; j+=i)	list[j]=false;
		return list;
	}
	
	boolean isPrime(int n){
		for(int i=2; i*i<=n; i++){
			if(n%i==0)     return false;
		}
		return true;
	}
	
	int gcd(int x, int y){
		if(y==0)	return x;
		else	return gcd(y, x%y);
	}
}