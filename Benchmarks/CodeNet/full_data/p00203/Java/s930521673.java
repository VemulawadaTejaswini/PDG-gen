import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0203();
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
	
	// RE
	void AOJ0089(){	// The Shortest Path on A Rhombic Path
		int[][] dp=new int[200][200];
		dp[1][1]=sc.nextInt();
		int idx=2, lastLen=1;
		while(sc.hasNext()){
			String s=sc.next();
			Scanner sc2=new Scanner(s).useDelimiter(",");
			int len=(int)((double)s.length()/(double)2+0.5);
			for(int i=1; i<=len; i++){
				if(len>lastLen)	dp[i][idx]=sc2.nextInt()+max(dp[i][idx-1], dp[i-1][idx-1]);
				else	dp[i][idx]=sc2.nextInt()+max(dp[i][idx-1], dp[i+1][idx-1]);
			}
			lastLen=len;
			idx++;
		}
		//debug
		
		for(int i=0; i<=idx; i++){
			for(int j=0; j<=(int)((double)idx/2+0.5); j++)	out.printf("%4d",dp[j][i]);
			out.println();
		}
		
		out.println(dp[1][idx-1]);
	}
	
	void AOJ0004(){
		//while(sc.hasNext()){
			// int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt(), e=sc.nextInt(), f=sc.nextInt();
			// ax + by = c
			// dx + ey = f
		//}
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
	
	void AOJ0065(){	// Trading
		final int MAX=1000000;
		int[] current=new int[MAX];
		int[] last=new int[MAX];
		boolean flag=false;
		while(sc.hasNext()){
			String s=sc.nextLine();
			if(s.equals("")){
				flag=true;
				continue;
			}
			Scanner sc2 = new Scanner(s).useDelimiter(",");
			if(flag)	last[sc2.nextInt()]++;
			else	current[sc2.nextInt()]++;
		}
		for(int i=0; i<MAX; i++)		if(current[i]>0 && last[i]>0)	out.println(i+" "+(current[i]+last[i]));
	}
	
	void AOJ0161(){	// Sport Meet
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			Time161[] times = new Time161[n];
			for(int i=0; i<n; i++)	times[i] = new Time161(sc.nextInt(), (sc.nextInt()*60+sc.nextInt() + sc.nextInt()*60+sc.nextInt() + sc.nextInt()*60+sc.nextInt() + sc.nextInt()*60+sc.nextInt()));
			Arrays.sort(times);
			out.println(times[0].num);	out.println(times[1].num);	out.println(times[times.length-2].num);
		}
	}
	class Time161 implements Comparable<Time161>{
		int num, time;
		Time161(int num, int time){
			this.num=num;	this.time=time;
		}
		@Override
		public int compareTo(Time161 o) {
			if(this.time<o.time)	return -1;
			if(this.time>o.time)	return 1;
			return 0;
		}
	}
	
	void AOJ0138(){	// Track and Field Competition
		Time138[] times1st = new Time138[8];
		Time138[] times2nd = new Time138[8];
		Time138[] times3rd = new Time138[8];
		for(int i=0; i<8; i++)	times1st[i] = new Time138(sc.nextInt(), sc.nextDouble());
		for(int i=0; i<8; i++)	times2nd[i] = new Time138(sc.nextInt(), sc.nextDouble());
		for(int i=0; i<8; i++)	times3rd[i] = new Time138(sc.nextInt(), sc.nextDouble());
		Arrays.sort(times1st);	Arrays.sort(times2nd);	Arrays.sort(times3rd);
		for(int i=0; i<2; i++)	out.println(times1st[i].num+" "+times1st[i].time);
		for(int i=0; i<2; i++)	out.println(times2nd[i].num+" "+times2nd[i].time);
		for(int i=0; i<2; i++)	out.println(times3rd[i].num+" "+times3rd[i].time);
		Time138[] times = new Time138[6];
		times[0]=times1st[2]; times[1]=times1st[3];	times[2]=times2nd[2]; times[3]=times2nd[3];	times[4]=times3rd[2]; times[5]=times3rd[3];
		Arrays.sort(times);
		for(int i=0; i<2; i++)	out.println(times[i].num+" "+times[i].time);
	}
	class Time138 implements Comparable<Time138>{
		int num;	double time;
		Time138(int num, double time){
			this.num=num;	this.time=time;
		}
		@Override
		public int compareTo(Time138 o) {
			if(this.time<o.time)	return -1;
			if(this.time>o.time)	return 1;
			return 0;
		}
	}
	
	void AOJ0005(){	// GCD and LCM
		while(sc.hasNext()){
			int a=sc.nextInt(), b=sc.nextInt();
			int temp=gcd(max(a,b), min(a,b));
			out.println(temp+" "+max(a,b)/temp*min(a,b));
		}
	}
	int gcd(int x, int y){
		if(y==0)	return x;
		else	return gcd(y, x%y);
	}
	
	int c197=0;
	void AOJ0197(){	// Greatest Common Divisor: Euclidean Algorithm
		while(sc.hasNext()){
			int x=sc.nextInt(), y=sc.nextInt();
			if(x<2)	break;
			c197=0;
			out.println(gcd197(max(x,y), min(x,y))+" "+c197);
		}
	}
	int gcd197(int x, int y){
		if(y==0)	return x;
		c197++;
		return gcd197(y, x%y);
	}
	
	void AOJ0001(){	// List of Top 3 Hills
		int[] m = new int[10];
		for(int i=0; i<10; i++)	m[i]=sc.nextInt();
		Arrays.sort(m);
		for(int i=9; i>=7; i--)	out.println(m[i]);
	}
	
	void AOJ10029(){	// Sort II
		int n=sc.nextInt();
		int[] ans = new int[n];
		for(int i=0; i<n; i++)	ans[i]=sc.nextInt();
		Arrays.sort(ans);
		out.print(ans[0]);
		for(int i=1; i<n; i++)	out.print(" "+ans[i]);
		out.println();
	}
	
	int[][] p26 = new int[10][10];
	int c26=100;
	void AOJ0026(){	// Dropping Ink
		int ans=0;
		while(sc.hasNext()){
			Scanner sc2 = new Scanner(sc.nextLine()).useDelimiter(",");
			int x=sc2.nextInt(), y=sc2.nextInt(), s=sc2.nextInt();
			// out.println("x"+x+" y"+y+" s"+s);
			ans=max(solve26(x,y),ans);
			ans=max(solve26(x-1,y),ans);	ans=max(solve26(x+1,y),ans);
			ans=max(solve26(x,y-1),ans);	ans=max(solve26(x,y+1),ans);
			if(s>=2){
				ans=max(solve26(x-1,y-1),ans);	ans=max(solve26(x-1,y+1),ans);
				ans=max(solve26(x+1,y-1),ans);	ans=max(solve26(x+1,y+1),ans);
			}
			if(s>=3){
				ans=max(solve26(x-2,y),ans);	ans=max(solve26(x+2,y),ans);
				ans=max(solve26(x,y-2),ans);	ans=max(solve26(x,y+2),ans);
			}
		}
		out.println(c26);
		out.println(ans);
	}
	int solve26(int x, int y){
		int r=-1;
		if(0<=x && x<=9 && 0<=y && y<=9){
			c26 -= p26[x][y]==0? 1: 0;
			p26[x][y]++;
			r=p26[x][y];
		}
		return r;	// RA
	}
	
	void AOJ0008(){	//Sum of 4 Integers
		while(sc.hasNext()){
			int ans=0, n=sc.nextInt();
			for(int a=0; a<10; a++){
				for(int b=0; b<10; b++){
					for(int c=0; c<10; c++){
						for(int d=0; d<10; d++)		if((a+b+c+d)==n)	ans++;
					}
				}
			}
			out.println(ans);
		}
	}
	
	void AOJ0055(){	// Sequence
		while(sc.hasNext()){
			double last=sc.nextDouble(), ans=last;
			for(int i=2; i<=10; i++){
				ans+= i%2==0? last*2: last/3;
				last = i%2==0? last*2: last/3;
				// out.println(last);
			}
			out.println(ans);
		}
	}
	
	void AOJ0084(){	// Search Engine
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()){
			String s=sc.next().replaceAll(",", "").replaceAll("\\.", "").replaceAll(" ", "");
			// out.println(s);
			if(s.length()<=2 || s.length()>=7)	continue;
			sb.append(s+" ");
		}
		out.println(sb.deleteCharAt(sb.length()-1));
	}
	
	void AOJ0077(){	// Run Length
		while(sc.hasNext()){
			char[] c=sc.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<c.length; i++){
				if(c[i]=='@'){
					for(int j=0; j<Character.digit(c[i+1], 10); j++)	sb.append(c[i+2]);
					i+=2;
				}else	sb.append(c[i]);
			}
			out.println(sb.toString());
		}
	}
	
	void AOJ0064(){	// Secret Number
		int ans=0;
		while(sc.hasNext()){
			Matcher m = Pattern.compile("\\d+").matcher(sc.nextLine());
			while(m.find())	ans+=Integer.parseInt(m.group());
		}
		out.println(ans);
	}
	
	void AOJ0050(){	// Apple and Peach
		while(sc.hasNext()) out.println(sc.nextLine().replaceAll("apple", "PEACH").replaceAll("peach", "apple").replaceAll("PEACH", "peach"));
	}
	
	void AOJ0039(){	// Roman Figure
		HashMap<Character,Integer> dic = new HashMap<Character,Integer>();
		dic.put('I', 1);	dic.put('V', 5);	dic.put('X', 10);	dic.put('L', 50);
		dic.put('C', 100);	dic.put('D', 500);	dic.put('M', 1000);
		while(sc.hasNext()){
			char[] c = sc.next().toCharArray();
			int ans=0,last=dic.get(c[0]);
			for(int i=0; i<c.length; i++){
				if(last>=dic.get(c[i])){
					ans+=dic.get(c[i]);
					last=dic.get(c[i]);
				}else{
					ans+=dic.get(c[i])-last-last;
					last=dic.get(c[i]);
				}
			}
			out.println(ans);
		}
	}
	
	void AOJ0020(){	// Capitalize
		while(sc.hasNext())	out.println(sc.nextLine().toUpperCase());
	}
}