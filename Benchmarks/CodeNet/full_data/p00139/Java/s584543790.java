import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0139();
	}
	
	void AOJ0139(){
		int N=sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=N; i++){
			String s=sc.nextLine();
			Matcher m=Pattern.compile("^>'=+#=+~$").matcher(s);
			Matcher m2=Pattern.compile("^>\\^[Q=]+~~$").matcher(s);
			if(m.matches()){
				m=Pattern.compile("=+").matcher(s);
				if(m.find()){
					String a1=m.group();
					if(m.find()){
						if(a1.equals(m.group())){
							out.println("A");
							continue;
						}
					}
				}
			}
			if(m2.matches()){
				if(s.replaceAll("Q=", "").length()==4){
					out.println("B");
					continue;
				}
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
	
	void AOJ0133(){
		char[][] a=new char[9][9];
		for(int i=1; i<=8; i++){
			char[] s=sc.next().toCharArray();
			for(int j=1; j<=8; j++)	a[j][i]=s[j-1];
		}
		
		out.println("90");
		for(int j=1; j<=8; j++){
			for(int i=1; i<=8; i++)	out.print(a[j][9-i]);
			out.println();
		}
		out.println("180");
		for(int j=1; j<=8; j++){
			for(int i=1; i<=8; i++)		out.print(a[9-i][9-j]);
			out.println();
		}
		out.println("270");
		for(int j=1; j<=8; j++){
			for(int i=1; i<=8; i++)		out.print(a[9-j][i]);
			out.println();
		}
	}
	
	// 途中
	void AOJ0230(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			int[] a=new int[n+1], b=new int[n+1];
			for(int i=1; i<=n; i++)	a[i]=sc.nextInt();
			for(int i=1; i<=n; i++)	b[i]=sc.nextInt();
			out.println(min(solve230(n,a,b),solve230(n,b,a)));
		}
	}
	int solve230(int n, int[] a, int[] b){
		int ans=0;
		ArrayList<Integer> dp=new ArrayList<Integer>();
		dp.add(0);
		for(int i=1; dp.get(dp.size()-1)<n; i++){
			int temp=min(dp.get(i-1),min(dp.get(i-2),dp.get(i-3)));
		}
		
		return ans;
	}
	
	// TLE -> OK
	void AOJ0070(){
		while(sc.hasNext()){
			int n=sc.nextInt(), s=sc.nextInt(), ans=0;
			for(int i=0; i<=9; i++){
				boolean[] b=new boolean[10];
				b[i]=true;
				ans+=solve70(1,0,i,n,s,b);
			}
			out.println(ans);
		}
	}
	int solve70(int nn, int ss, int x, int n, int s, boolean[] b){	// nn番目 合計ss 次x
		int ans=0;
		if(ss>s)	return 0;
		if(nn>n)	return 0;
		if(nn==n)	ans+=ss+nn*x==s?1:0;
		else if(nn<n){
			for(int i=0; i<=9; i++){
				if(!b[i]){
					// コピーしない
					//boolean[] bb=b.clone();
					//bb[i]=true;
					b[i]=true;
					ans+=solve70(nn+1, ss+nn*x, i, n,s,b);
					b[i]=false;
				}
			}
		}
		return ans;
	}
	
	int p31, q31, a31, n31;
	void AOJ1131(){
		while(sc.hasNext()){
			p31=sc.nextInt(); q31=sc.nextInt(); a31=sc.nextInt(); n31=sc.nextInt();
			int ans=0;
			if(p31==0)	break;
			int G=gcd(max(p31,q31),min(p31,q31));
			p31/=G;	q31/=G;
			for(int i=1; i<=a31; i++)	ans+=solve1131(1, i, 1, i);
			out.println(ans);
		}
	}
	int solve1131(int nn, int aa, int pp, int Q){
		if(aa>a31)	return 0;
		// 2秒近く縮まる
		double D=(double)aa/q31;
		if((double)pp/p31>D)	return 0;
		int ans=0;
		if(nn<=n31){
			if((double)pp/p31==(double)aa/q31)	ans++;
			else if(nn<n31 && aa<=a31){
				for(int i=Q; i*aa<=a31; i++)	ans+=solve1131(nn+1, aa*i, pp*i+1*aa, i);
			}
		}
		return ans;
	}
	
	void AOJ0089(){	// The Shortest Path on A Rhombic Path
		int[][] dp=new int[200][200];
		dp[1][1]=sc.nextInt();
		int idx=2, lastLen=1;
		while(sc.hasNext()){
			String[] s=sc.next().split(",");
			for(int i=1; i<=s.length; i++){
				if(s.length>lastLen)	dp[i][idx]=Integer.parseInt(s[i-1])+max(dp[i][idx-1], dp[i-1][idx-1]);
				else	dp[i][idx]=Integer.parseInt(s[i-1])+max(dp[i][idx-1], dp[i+1][idx-1]);
			}
			
			/*
			String s=sc.nextLine();
			Scanner sc2=new Scanner(s).useDelimiter(","); <-【こいつがRE】
			int len=(int)round(s.length()/2.0);
			for(int i=1; i<=len; i++){
				if(len>lastLen)	dp[i][idx]=sc2.nextInt()+max(dp[i][idx-1], dp[i-1][idx-1]);
				else	dp[i][idx]=sc2.nextInt()+max(dp[i][idx-1], dp[i+1][idx-1]);
			}
			lastLen=len;
			*/
			lastLen=s.length;
			idx++;
		}
		//debug
		/*
		for(int i=0; i<=idx; i++){
			for(int j=0; j<=(int)round(idx/2.0); j++)	out.printf("%4d",dp[j][i]);
			out.println();
		}
		*/
		out.println(dp[1][idx-1]);
		
	}
	
	void AOJ0191(){
		while(sc.hasNext()){
			int n=sc.nextInt(), m=sc.nextInt(), last=0;	// m回
			if(n==0)	break;
			double[][] h=new double[n+1][n+1];
			double[][] dp=new double[n+1][m+1];
			for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++)	h[j][i]=sc.nextDouble();
			}
			for(int i=1; i<=n; i++)	dp[i][1]=1;
			for(int j=2; j<=m; j++){
				for(int i=1; i<=n; i++){
					for(int k=1; k<=n; k++){
						dp[i][j]=max(dp[i][j], dp[k][j-1]*h[i][k]);
						//debug
						//out.print(dp[k][j-1]*h[i][k]+" ");
					}
				}
				//out.println();
			}
			//debug
			/*
			for(int j=1; j<=m; j++){
				for(int i=1; i<=n; i++)	out.print(dp[i][j]+" ");
				out.println();
			}
			*/
			double ans=0;
			for(int i=1; i<=n; i++)	ans=max(ans,dp[i][m]);
			out.printf("%.2f\n",ans);
		}
	}
	
	void AOJ0203(){	// A New Plan of Aizu Ski Resort
		while(sc.hasNext()){
			int x=sc.nextInt(), y=sc.nextInt();
			if(x==0)	break;
			int[][] dp=new int[x+3][y+3],b=new int[x+2][y+2];
			for(int j=1; j<=y; j++){
				for(int i=1; i<=x; i++)	b[i][j]=sc.nextInt();
			}
			for(int i=1; i<=x; i++)	dp[i][1]= b[i][1]==1?0:1;
			for(int j=1; j<=y; j++){
				for(int i=1; i<=x; i++){
					// jump2連続を見落としてた
					// if(b[i][j]==2)	dp[i][j]= dp[i][j-1];
					if(b[i][j]==2)	dp[i][j]= b[i][j-1]!=2?dp[i][j-1]:0;
					else if(b[i][j]==0){
						for(int k=i-1; k<=i+1; k++)	dp[i][j]+= b[k][j-1]==0?dp[k][j-1]:0;	
					}
					if(j>2 && b[i][j]!=1)	dp[i][j]+= b[i][j-2]==2?dp[i][j-2]:0;
				}
			}
			
			// debug
			/*
			for(int j=1; j<=y; j++){
				for(int i=1; i<=x; i++)	out.print(dp[i][j]+" ");
				out.println();
			}
			*/
			int ans=0;
			for(int i=1; i<=x; i++)	ans+= dp[i][y]+(b[i][y-1]==2?dp[i][y-1]:0);
			out.println(ans);
		}
		
	}
	
	void AOJ0042(){	// A Thief
		int num=1;
		while(sc.hasNext()){
			int w=sc.nextInt();
			if(w==0)	break;
			int n=sc.nextInt();
			int[][] dp=new int[n+1][w+1];
			int[] ww=new int[n+1], pp=new int[n+1];
			for(int i=1; i<=n; i++){
				Scanner sc2=new Scanner(sc.next()).useDelimiter(",");
				pp[i]=sc2.nextInt();
				ww[i]=sc2.nextInt();
			}
			int ans=0, wei=Integer.MAX_VALUE;
			for(int i=1; i<=n; i++){
				for(int j=1; j<=w; j++){
					dp[i][j]=max(dp[i-1][j], j>=ww[i]?dp[i-1][j-ww[i]]+pp[i]:dp[i-1][j]);
					if(dp[i][j]>ans){
						wei=j;
						ans=dp[i][j];
					}else if(dp[i][j]==ans){
						wei=min(wei,j);
					}
				}
			}
			
			//debug
			/*
			for(int i=0; i<=w; i++){
				for(int j=0; j<=n; j++)	out.printf("%4d",dp[j][i]);
				out.println();
			}
			*/
			
			out.println("Case "+(num++)+":");
			out.println(ans);
			out.println(wei);
		}
	}

	void AOJ0003(){
		int n=sc.nextInt();
		while(n-->0){
			int[] a=new int[3];
			for(int i=0; i<3; i++)	a[i]=sc.nextInt();
			Arrays.sort(a);
			if(a[2]*a[2]==(a[1]*a[1])+(a[0]*a[0]))	out.println("YES");
			else	out.println("NO");
		}
	}
	
	void AOJ0002(){
		while(sc.hasNext())	out.println(new String(""+(sc.nextInt()+sc.nextInt())).length());
	}
	
	void AOJ0516(){
		while(sc.hasNext()){
			int n=sc.nextInt(), k=sc.nextInt(), ans=0;
			if(n==0)	break;
			int[] sum=new int[n+1];
			for(int i=1; i<=n; i++)	sum[i]=sum[i-1]+sc.nextInt();
			for(int i=k; i<=n; i++)	ans=max(ans, sum[i]-sum[i-k]);
			out.println(ans);
		}
	}
	
	c547[][] r;
	final int MOD547=100000;
	void AOJ0547(){	// Commute routes
		while(sc.hasNext()){
			int w=sc.nextInt(), h=sc.nextInt();
			if(w<2)	break;
			r=new c547[w+1][h+1];
			r[2][1]=new c547(0,0,0,1);	r[1][2]=new c547(0,1,0,0);
			for(int x=1; x<=w; x++){
				for(int y=1; y<=h; y++)	r[x][y] = r[x][y]==null?solve547(x,y): r[x][y];
			}
			//r[w][h].list();
			out.println(r[w][h].sum());
		}
	}
	c547 solve547(int x, int y){
		int s1=y-1>0? r[x][y-1].w2:0;
		int s2=y-1>0? (r[x][y-1].s1+r[x][y-1].s2)%MOD547:0;
		int w1=x-1>0? r[x-1][y].s2:0;
		int w2=x-1>0? (r[x-1][y].w1+r[x-1][y].w2)%MOD547:0;
		return new c547(s1, s2, w1, w2);
	}
	class c547{
		int s1, s2, w1, w2;
		c547(int s1, int s2, int w1, int w2){
			this.s1=s1; this.s2=s2; this.w1=w1; this.w2=w2;
		}
		int sum(){
			return (this.s1 + this.s2 + this.w1 + this.w2)%MOD547;
		}
		void list(){
			out.println("("+this.s1+" "+this.s2+" "+this.w1+" "+this.w2+")");
		}
	}
	
	int[][] a1209;
	void AOJ1209(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n<=0)	break;
			a1209=new int[18][n+1];
			for(int i=0; i<=n; i++)	a1209[1][i]=1;
			for(int x=2; x<=17; x++){
				for(int y=1; y<=n; y++)	a1209[x][y]=solve1209(x,y);
			}
			int ans=0;
			for(int i=1; i<=17; i++)	ans+=a1209[i][n];
			out.println(ans);
			
			// debug
			/*
			for(int i=0; i<=n; i++){
				for(int j=0; j<=17; j++)	out.print(a1209[j][i]+" ");
				out.println();
			}
			*/
		}
	}
	int solve1209(int x, int y){
		int ans=0;
		for(int i=x;i>0; i--)	ans+= y-(x*x)>=0?a1209[i][y-(x*x)]:0;
		return ans;
	}
	
	int[][] r515;
	boolean[][] b515;
	void AOJ0515(){	// School Road
		while(sc.hasNext()){
			int xn=sc.nextInt(), yn=sc.nextInt();
			if(xn<=0)	break;
			int n=sc.nextInt();
			b515 = new boolean[xn+1][yn+1];
			for(int i=0; i<n; i++)	b515[sc.nextInt()][sc.nextInt()]=true;
			r515=new int[xn+1][yn+1];
			r515[1][1]=1;
			for(int x=1; x<=xn; x++){
				for(int y=1; y<=yn; y++){
					if(x==1&&y==1)	continue;
					r515[x][y]=solve515(x,y);
				}
			}
			out.println(r515[xn][yn]);
		}
	}
	int solve515(int x, int y){
		int ans=0;
		if(!b515[x][y]){
			ans+= y-1>0? r515[x][y-1]:0;
			ans+= x-1>0? r515[x-1][y]:0;
		}
		return ans;
	}
	
	
	int[] a168;
	void AOJ0168(){	// Kannondou
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n<=0)	break;
			a168=new int[n+1];
			a168[0]=1;
			for(int i=1; i<=n; i++)	a168[i]=solve168(i);
			int day=(a168[n]/10) + (a168[n]%10==0? 0: 1);
			// out.println("n"+a168[n]+" day"+day);
			out.println(((day/365) + (day%365==0?0 :1)));
		}
	}
	int solve168(int a){
		int ans=0;
		for(int i=a-1; i>=a-3; i--)	ans+= i>=0? a168[i]: 0;
		return ans;
	}
	
	void AOJ0176(){	// What Color?
		int[] R = {0,0,0,0,255,255,255,255};
		int[] G = {0,0,255,255,0,0,255,255};
		int[] B = {0,255,0,255,0,255,0,255};
		HashMap<Integer,String> dic = new HashMap<Integer,String>();
		dic.put(0, "black");	dic.put(1, "blue");	dic.put(2, "lime");	dic.put(3, "aqua");
		dic.put(4, "red");	dic.put(5, "fuchsia");	dic.put(6, "yellow");	dic.put(7, "white");
		while(sc.hasNext()){
			String s=sc.next();
			if(s.equals("0"))	break;
			int r=Integer.parseInt(""+s.charAt(1)+s.charAt(2),16), g=Integer.parseInt(""+s.charAt(3)+s.charAt(4),16), b=Integer.parseInt(""+s.charAt(5)+s.charAt(6),16);
			int index=0;
			double last=Double.MAX_VALUE;
			for(int i=0; i<8; i++){
				double d=sqrt((abs(r-R[i])<<1)+(abs(g-G[i])<<1)+(abs(b-B[i])<<1));
				index = last>d? i : index;
				last = last>d? d : last;
			}
			out.println(dic.get(index));
		}
	}
	
	void AOJ0175(){	// A King in Hawaii
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n<0)	break;
			StringBuilder sb = new StringBuilder();
			while(n!=0){
				//out.println(n&3);
				sb.append(n&3);
				n=n>>2;
			}
			out.println(sb.length()>0? sb.reverse(): 0);
		}
	}
	
	void AOJ0031(){	// Weight
		while(sc.hasNext()){
			int n=sc.nextInt();
			int temp=Integer.lowestOneBit(n);
			out.print(temp);
			n=(n^temp);
			while(n!=0){
				temp=Integer.lowestOneBit(n);
				out.print(" "+temp);
				n=(n^temp);
			}
			out.println();
		}
	}
	
	void AOJ0051(){	// Differential II
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
			char[] c = sc.next().toCharArray();
			int[] a = new int[8];
			for(int j=0; j<8; j++)	a[j]=Character.digit(c[j], 10);
			Arrays.sort(a);
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<8; j++)	sb.append(a[j]);
			int min=Integer.parseInt(sb.toString());
			sb=new StringBuilder();
			for(int j=7; j>=0; j--)	sb.append(a[j]);
			int max=Integer.parseInt(sb.toString());
			out.println(max-min);
		}
	}
	
	void AOJ0196(){	// Baseball Championship
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			Team196[] teams = new Team196[n];
			for(int i=0; i<n; i++){
				String s=sc.next();
				int win=0, lose=0;
				for(int j=0; j<n-1; j++){
					int temp=sc.nextInt();
					if(temp==0)	win++;
					if(temp==1)	lose++;
				}
				teams[i] = new Team196(s,win,lose,i);
			}
			Arrays.sort(teams);
			for(int i=0; i<n; i++)	out.println(teams[i].name);
		}
	}
	class Team196 implements Comparable<Team196>{
		String name;
		int win,lose,index;
		Team196(String name, int win, int lose, int index){
			this.name=name;	this.win=win;	this.lose=lose;	this.index=index;
		}
		@Override
		public int compareTo(Team196 o) {
			if(this.win<o.win)	return 1;
			if(this.win>o.win)	return -1;
			if(this.lose<o.lose)	return -1;
			if(this.lose>o.lose)	return 1;
			if(this.index<o.index)	return -1;
			if(this.index>o.index)	return 1;
			return 0;
		}
	}
	
	int gcd(int x, int y){
		if(y==0)	return x;
		else	return gcd(y, x%y);
	}
}