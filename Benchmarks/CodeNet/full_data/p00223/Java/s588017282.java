import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0223();
	}
	
	
	
	// TLE
	int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	void AOJ0223(){
		while(sc.hasNext()){
			int X=sc.nextInt(),	Y=sc.nextInt();
			if(X==0)	break;
			int tx=sc.nextInt(), ty=sc.nextInt(), kx=sc.nextInt(), ky=sc.nextInt();
			int[][] b=new int[X][Y];
			for(int y=0; y<Y; y++){
				for(int x=0; x<X; x++)	b[x][y]=sc.nextInt();
			}
			LinkedList<C0223> open=new LinkedList<C0223>();
			open.add(new C0223(tx,ty,kx,ky,0));
			HashSet<C0223> close=new HashSet<C0223>();
			close.add(new C0223(tx,ty,kx,ky,0));
			int ans=-1;
			while(!open.isEmpty()){
				C0223 now=open.getFirst();
				open.removeFirst();
				close.add(now);
				if(now.ans()){
					ans=now.sec;
					break;
				}
				if(now.sec>100)	break;
				for(int i=0; i<4; i++){
					if(0<=now.tx+vx[i]&&now.tx+vx[i]<X && 0<=now.ty+vy[i]&&now.ty+vy[i]<Y && 0<=now.kx+vx[i]*-1&&now.kx+vx[i]*-1<X && 0<=now.ky+vy[i]*-1&&now.ky+vy[i]*-1<Y){
						tx=now.tx;	ty=now.ty;	kx=now.kx;	ky=now.ky;
						if(b[tx+vx[i]][ty+vy[i]]==0){
							tx+=vx[i];	ty+=vy[i];
						}
						if(b[kx+vx[i]*-1][ky+vy[i]*-1]==0){
							kx+=vx[i]*-1;	ky+=vy[i]*-1;
						}
						C0223 temp=new C0223(tx,ty,kx,ky,now.sec+1);
						if(!close.contains(temp)){
							if(temp.diff<now.diff){
								//out.println(tx+" "+ty+" "+kx+" "+ky);
								open.add(temp);
								close.add(temp);
							}
						}
					}
				}
			}
			out.println(ans<0? "NA": ans);
		}
	}
	class C0223{
		int tx,ty,kx,ky,sec,diff;
		C0223(int tx, int ty, int kx, int ky, int sec){
			this.tx=tx;	this.ty=ty;	this.kx=kx;	this.ky=ky;	this.sec=sec;
			this.diff=abs(tx-kx)+abs(kx-ky);
		}
		public boolean equals(Object obj){
			if(obj==null)	return false;
			if(!(obj instanceof C0223))	return false;
			if(this.kx==((C0223)obj).kx && this.ky==((C0223)obj).ky && this.tx==((C0223)obj).tx && this.ty==((C0223)obj).ty)	return true;
			return false;
		}
		boolean ans(){
			if(this.tx==this.kx && this.ty==this.ky)	return true;
			else	return false;
		}
	}
	
	LinkedList<N0179> open0179;
	TreeSet<String> close0179;
	String r0179, g0179, b0179;
	void AOJ0179(){
		while(sc.hasNext()){
			String s=sc.next();
			if(s.equals("0"))	break;
			r0179="";	g0179="";	b0179="";
			for(int i=0; i<s.length(); i++){
				r0179+="r";	g0179+="g";	b0179+="b";
			}
			open0179=new LinkedList<N0179>();
			close0179=new TreeSet<String>();
			open0179.add(new N0179(s,0));
			close0179.add(s);
			int ans=solve0179();
			out.println(ans<0? "NA": ans);
		}
	}
	int solve0179(){
		while(!open0179.isEmpty()){
			N0179 n=open0179.getFirst();
			open0179.removeFirst();
			//out.println("NOW:"+n.s+" "+n.sec);
			if(r0179.equals(n.s) || g0179.equals(n.s) || b0179.equals(n.s))	return n.sec;
			for(int i=0; i<n.s.length()-1; i++){
				char[] c=n.s.toCharArray();
				if(c[i]!=c[i+1]){
					if(c[i]!='r' && c[i+1]!='r'){
						c[i]='r';	c[i+1]='r';
					}else if(c[i]!='g' && c[i+1]!='g'){
						c[i]='g';	c[i+1]='g';
					}else if(c[i]!='b' && c[i+1]!='b'){
						c[i]='b';	c[i+1]='b';
					}
					String temp=new String(c);
					if(!close0179.contains(temp)){
						//out.println(temp);
						open0179.add(new N0179(temp, n.sec+1));
						close0179.add(temp);
					}
					
				}
			}
		}
		//if(!open.isEmpty())	return solve0179();
		return -1;
	}
	// 再帰だとStackOverFlow
	int Oldsolve0179(){
		N0179 n=open0179.getFirst();
		open0179.removeFirst();
		//out.println("NOW:"+n.s+" "+n.sec);
		if(r0179.equals(n.s) || g0179.equals(n.s) || b0179.equals(n.s))	return n.sec;
		for(int i=0; i<n.s.length()-1; i++){
			char[] c=n.s.toCharArray();
			if(c[i]!=c[i+1]){
				if(c[i]!='r' && c[i+1]!='r'){
					c[i]='r';	c[i+1]='r';
				}else if(c[i]!='g' && c[i+1]!='g'){
					c[i]='g';	c[i+1]='g';
				}else if(c[i]!='b' && c[i+1]!='b'){
					c[i]='b';	c[i+1]='b';
				}
				String temp=new String(c);
				if(!close0179.contains(temp)){
					//out.println(temp);
					open0179.add(new N0179(temp, n.sec+1));
					close0179.add(temp);
				}
				
			}
		}
		if(!open0179.isEmpty())	return solve0179();
		return -1;
	}
	class N0179{
		String s;	int sec;
		N0179(String s, int sec){
			this.s=s;	this.sec=sec;
		}
	}
	
	// WA
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
	
	void AOJ0207(){
		while(sc.hasNext()){
			int w=sc.nextInt(), h=sc.nextInt();
			if(w==0)	break;
			int sx=sc.nextInt(), sy=sc.nextInt(), gx=sc.nextInt(), gy=sc.nextInt(), n=sc.nextInt();
			int[][] b=new int[w+2][h+2];
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
			//debug
			//de0207(b,w,h);
			int[] vx={1,0,-1,0}, vy={0,1,0,-1};
			int xx=sx, yy=sy, cc=b[sx][sy], v=0, count=0, max=w*h;
			if(cc<1){
				out.println("NG");
				System.exit(0);
			}
			while(true){
				if(xx==gx && yy==gy && b[xx][yy]==cc){
					out.println("OK");
					break;
				}
				count++;
				if(count>=max){
					out.println("NG");
					break;
				}
				//b[xx][yy]=6;
				boolean flag=false;
				for(int i=0; i<4; i++){
					if(b[xx+vx[i]][yy+vy[i]]==cc){
						xx+=vx[i];	yy+=vy[i];	v=i;
						flag=true;
						out.println("X"+xx+" Y"+yy);
						break;
					}
				}
				if(flag)	continue;
				xx-=vx[v];	yy-=vy[v];
				for(int i=0; i<4; i++){
					if(b[xx+vx[i]][yy+vy[i]]==cc){
						xx+=vx[i];	yy+=vy[i];	v=i;
						flag=true;
						break;
					}
				}
				if(flag)	continue;
				out.println("END : X"+xx+" Y"+yy);
				out.println("NG");
				break;
			}
			//debug
			de0207(b,w,h);
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
	
	void AOJ1136(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			solve1136(n);
			out.println("+++++");
		}
	}
	void solve1136(int N){	// N本の折れ線
		// 元の直線0
		int a0=sc.nextInt();
		int[] v0=new int[a0], len0=new int[a0];
		int lx=sc.nextInt(), ly=sc.nextInt();
		for(int i=1; i<a0; i++){
			int x=sc.nextInt(), y=sc.nextInt();
			v0[i]=v1136(x,y,lx,ly);
			len0[i]=max(abs(y-ly),abs(x-lx));
			lx=x;	ly=y;
		}
		for(int i=1; i<=N; i++){
			int a=sc.nextInt();
			//if(a!=a0)	continue;
			// a!=a0で飛ばした時に読み込みがずれる
			int[] v=new int[a], len=new int[a];
			lx=sc.nextInt();	ly=sc.nextInt();
			for(int j=1; j<a; j++){
				int x=sc.nextInt(),y=sc.nextInt();
				v[j]=v1136(x,y,lx,ly);
				len[j]=max(abs(y-ly),abs(x-lx));
				lx=x;	ly=y;
			}
			if(a!=a0)	continue;
			if(isSame(v0,len0,v,len))	out.println(i);
			else if(isSame2(v0,len0,v,len))	out.println(i);
		}
	}
	int v1136(int x, int y, int lx, int ly){
		if(y>ly)	return 1;
		else if(x>lx)	return 2;
		else if(y<ly)	return 3;
		else if(x<lx)	return 4;
		return 0;
	}
	boolean isSame(int[] v0, int[] len0, int[] v, int[] len){
		for(int i=1; i<len.length; i++){
			if(len0[i]!=len[i])	return false;
		}
		int ans=0;
		for(int j=0; j<4; j++){
			for(int i=1; i<v.length; i++){
				if(v0[i]!=v[i]){
					v=turn1136(v,1);
					ans++;
					break;
				}
			}
			if(ans==j)	break;
		}
		return ans!=4;
	}
	boolean isSame2(int[] v0, int[] len0, int[] v, int[] len){
		for(int i=1; i<v.length; i++){
			if(len0[i]!=len[v.length-i])	return false;
		}
		int ans=0;
		for(int j=0; j<4; j++){
			for(int i=1; i<v.length; i++){
				if(v0[i]!=v[v.length-i]){
					v=turn1136(v,1);
					ans++;
					break;
				}
			}
			if(ans==j)	break;
		}
		return ans!=4;
	}
	int[] turn1136(int[] v, int n){
		if(n==0)	return v;
		int[] ans=new int[v.length];
		for(int i=1; i<v.length; i++){
			ans[i]=v[i]+n>4? 1: v[i]+n;
		}
		return ans;
	}
	
	void AOJ0141(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			int n=sc.nextInt();
			if(n==1){
				out.println("#\n");
				continue;
			}
			char[][] c=new char[n+1][n+1];
			for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++)	c[i][j]=' ';
			}
			for(int i=n; i>0; i--)	c[1][i]='#';
			for(int i=1; i<=n; i++)	c[i][1]='#';
			if(n>2){
				for(int i=1; i<=n; i++)	c[n][i]='#';
			}
			if(n>3){
				for(int i=n; i>2; i--)	c[i][n]='#';
			}
			if(n>4){
				int[] vx={0, 1, 0, -1,1,1,-1,-1};
				int[] vy={-1, 0, 1, 0,-1,1,-1,1};
				c=solve141(3, n-1, n, c, vx, vy, 0);
			}
			for(int j=1; j<=n; j++){
				for(int i=1; i<=n; i++)	out.print(c[i][j]);
				out.println();
			}
			if(I!=N)	out.println();	// 最後のデータセットの改行
		}
	}
	// 今のx,y　n縦横　c版　vx,vy移動,　f方向
	char[][] solve141(int x, int y, int n, char[][] c, int[] vx, int[] vy, int f){
		while(true){
			int xx=x-vx[f], yy=y-vy[f];
			boolean flag=true;
			for(int i=0; i<4; i++){
				if(x+vx[i]==xx || y+vy[i]==yy)	continue;
				if(0>=x+vx[i]||x+vx[i]>n || 0>=y+vy[i]||y+vy[i]>n){
					flag=false;
					break;
				}
				if(c[x+vx[i]][y+vy[i]]=='#')	{
					flag=false;
					break;
				}
			}
			if(!flag){
				//out.println("A:"+x+" "+y);
				break;
			}
			if(c[x+vx[f]][y+vy[f]]==' '){
				c[x][y]='#';
				//return solve141(x+vx[f], y+vy[f], n,c,vx,vy,f);
				x+=vx[f];	y+=vy[f];
				continue;
			}else{
				x=xx;	y=yy;
				f= f+1<4? f+1: 0;
				if(c[x+vx[f]][y+vy[f]]==' '){
					//return solve141(x, y, n,c,vx,vy,f);
					x+=vx[f];	y+=vy[f];
					continue;
				}
			}
			//out.println("B:"+x+" "+y);
			break;
		}
		return c;
		//if(0<x+vx[f]&&x+vx[f]<=n && 0<y+vy[f]&&y+vy[f]<=n)
	}
	// 再帰だとスタックオーバーフロー（手元では106まで行けたが）
	char[][] solve141old(int x, int y, int n, char[][] c, int[] vx, int[] vy, int f){
		int xx=x-vx[f], yy=y-vy[f];
		boolean flag=true;
		for(int i=0; i<4; i++){
			if(x+vx[i]==xx || y+vy[i]==yy)	continue;
			if(0>=x+vx[i]||x+vx[i]>n || 0>=y+vy[i]||y+vy[i]>n){
				flag=false;
				break;
			}
			if(c[x+vx[i]][y+vy[i]]=='#')	{
				flag=false;
				break;
			}
		}
		if(!flag){
			//out.println("A:"+x+" "+y);
			return c;
		}
		if(c[x+vx[f]][y+vy[f]]==' '){
			c[x][y]='#';
			return solve141(x+vx[f], y+vy[f], n,c,vx,vy,f);
		}else{
			x=xx;	y=yy;
			f= f+1<4? f+1: 0;
			x+=vx[f];	y+=vy[f];
			if(c[x+vx[f]][y+vy[f]]==' '){
				return solve141(x, y, n,c,vx,vy,f);
			}
		}
		//out.println("B:"+x+" "+y);
		return c;
		//if(0<x+vx[f]&&x+vx[f]<=n && 0<y+vy[f]&&y+vy[f]<=n)
	}
	
	void AOJ0140(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			int n=sc.nextInt(), m=sc.nextInt();
			StringBuilder sb=new StringBuilder();
			if(n>5){
				if(m<6){
					for(int i=n; i<=9; i++)	sb.append(i+" ");
					for(int i=5; i>=m; i--)	sb.append(i+" ");
				}else{
					if(n<m)	for(int i=n; i<=m; i++)	sb.append(i+" ");
					else{
						for(int i=n; i<=9; i++)	sb.append(i+" ");
						for(int i=5; i>=0; i--)	sb.append(i+" ");
						for(int i=1; i<=m; i++)	sb.append(i+" ");
					}
				}
				
			}else{
				if(n<m)	for(int i=n; i<=m; i++)	sb.append(i+" ");
				else	for(int i=n; i>=m; i--)	sb.append(i+" ");
			}
			sb.deleteCharAt(sb.length()-1);
			out.println(sb);
		}
	}
	
	void AOJ1135(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			int a=sc.nextInt(), year=sc.nextInt(), n=sc.nextInt(), ans=0;
			for(int i=0; i<n; i++){
				if(sc.nextInt()==1)	ans=max(ans, huku(a,year,sc.nextDouble(),sc.nextInt()));
				else	ans=max(ans, tan(a,year,sc.nextDouble(), sc.nextInt()));
			}
			out.println(ans);
		}
	}
	int huku(int a, int year, double rate, int t){
		for(int i=0; i<year; i++){
			int temp=(int) (a*rate);
			a+=temp-t;
		}
		return a;
	}
	int tan(int a, int year, double rate, int t){
		int r=0;
		for(int i=0; i<year; i++){
			r+=a*rate;
			a-=t;
		}
		return a+r;
	}
	
	void AOJ1142(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			HashSet<String> map=new HashSet<String>();
			String s=sc.next();
			for(int i=1; i<s.length(); i++){
				String a=s.substring(0, i), b=s.substring(i);
				String aa=new StringBuilder(a).reverse().toString(), bb=new StringBuilder(b).reverse().toString();
				//out.println("A:"+a+" AA:"+aa+" B:"+b+" BB:"+bb);
				map.add(a+b);
				map.add(aa+b);
				map.add(a+bb);
				map.add(aa+bb);
				map.add(b+a);
				map.add(bb+a);
				map.add(b+aa);
				map.add(bb+aa);
				//out.println(map);
			}
			
			out.println(map.size());
		}
	}
	
	void AOJ1137(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			int a=toInt(sc.next()),b=toInt(sc.next());
			//out.println("A:"+a+" B:"+b);
			out.println(toMcxi(a+b));
		}
	}
	int toInt(String s){
		int ans=0,temp=1;
		char[] c=s.toCharArray();
		for(int i=0; i<c.length; i++){
			if(c[i]=='m'){
				ans+=temp*1000;
				temp=1;
			}else if(c[i]=='c'){
				ans+=temp*100;
				temp=1;
			}else if(c[i]=='x'){
				ans+=temp*10;
				temp=1;
			}else if(c[i]=='i'){
				ans+=temp;
				temp=1;
			}else{
				temp=Character.digit(c[i],10);
			}
		}
		return ans;
	}
	String toMcxi(int n){
		StringBuilder sb=new StringBuilder();
		if(n/1000>0){
			sb.append(n/1000==1?"m":(n/1000)+"m");
			n%=1000;
		}
		if(n/100>0){
			sb.append(n/100==1?"c":(n/100)+"c");
			n%=100;
		}
		if(n/10>0){
			sb.append(n/10==1?"x":(n/10)+"x");
			n%=10;
		}
		if(n>0)	sb.append(n==1?"i":n+"i");
		return sb.toString();
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
	
	void AOJ0137(){
		int N=sc.nextInt();
		for(int i=1; i<=N; i++){
			long s=sc.nextLong();
			out.println("Case "+i+":");
			for(int j=0; j<10; j++){
				s*=s;	s/=100;	s%=10000;
				out.println(s);
			}
		}
	}
	
	ArrayList<Integer> Sieve2(int N){
	    ArrayList<Integer> prime = new ArrayList<Integer>();
	    boolean[] list = new boolean[N+1];
	    Arrays.fill(list, true);
	    list[1]=false;
	    for (int i=2; i<=N; i++) {
	        if(list[i]) {
	            prime.add(i);
	            for (int j=i+i; j<=N; j+=i)    list[j] = false;
	        }
	    }
	    return prime;
	}

	boolean[] Sieve(int N){
	    boolean[] list = new boolean[N+1];
	    Arrays.fill(list, true);
	    list[1]=false;
	    for(int i=2; i<=N; i++) {
	        if(list[i]) {
	            for (int j=i+i; j<=N; j+=i)     list[j] = false;
	        }
	    }
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