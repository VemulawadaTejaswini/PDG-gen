import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0142();
	}
	
	
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
	
	void AOJ0145(){
		int n=sc.nextInt();
		
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
	
	// RE
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
			if(a!=a0)	continue;
			int[] v=new int[a], len=new int[a];
			lx=sc.nextInt();	ly=sc.nextInt();
			for(int j=1; j<a; j++){
				int x=sc.nextInt(),y=sc.nextInt();
				v[j]=v1136(x,y,lx,ly);
				len[j]=max(abs(y-ly),abs(x-lx));
				lx=x;	ly=y;
			}
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
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			String s=sc.next();
			for(int i=1; i<s.length(); i++){
				String a=s.substring(0, i), b=s.substring(i);
				String aa=new StringBuilder(a).reverse().toString(), bb=new StringBuilder(b).reverse().toString();
				//out.println("A:"+a+" AA:"+aa+" B:"+b+" BB:"+bb);
				map.put(a+b,1);
				map.put(aa+b,1);
				map.put(a+bb,1);
				map.put(aa+bb,1);
				map.put(b+a,1);
				map.put(bb+a, 1);
				map.put(b+aa, 1);
				map.put(bb+aa, 1);
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
	
	// 途中
	void AOJ0141(){
		int N=sc.nextInt();
		for(int I=1; I<=N; I++){
			int n=sc.nextInt();
			char[][] c=new char[n+4][n+4];
			int[] vx={0, 1, 0, -1};
			int[] vy={-1, 0, 1, 0};
			c=solve141(2, n+1, n, c, vx, vy);
			for(int j=2; j<=n+1; j++){
				for(int i=2; i<=n+1; i++)	out.print(c[i][j]);
				out.println();
			}
			out.println();
		}
	}
	char[][] solve141(int x, int y, int n, char[][] c, int[] vx, int[] vy){
		//範囲を超えていないか
		if(x<2&&x>n+1 && y<2&&y>n+1)	return c;
		//周りが#
		//return c;
		
		c[x][y]='#';
		
		// 1周目
		if(x==2){
			if(y!=2)	solve141(x, y-1, n, c, vx, vy);
			else	solve141(x+1, y, n, c, vx, vy);
		}
		if(y==2){
			if(x!=n+1)	solve141(x+1, y, n, c, vx, vy);
			else	solve141(x, y+1, n, c, vx, vy);
		}
		if(x==n+1){
			if(y!=2)	solve141(x, y+1,n,c,vx,vy);
			else	solve141(x-1, y,n,c,vx,vy);
		}
		if(y==n+1){
			if(x!=3)	solve141(x-1,y,n,c,vx,vy);
			else	solve141(x,y-1,n,c,vx,vy);
		}
		
		// それ以降
		for(int i=0; i<4; i++){
			if(c[x+vx[i]][y+vy[i]]!='#'){
				solve141(x+vx[i], y+vy[i],n,c,vx,vy);
			}
		}

		return c;
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