import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int[] vvx={0,1,0,-1,-1,1}, vvy={-1,0,1,0,-1,1};
	final int INF=1<<24;
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().AOJ1155();
		//out.println((System.currentTimeMillis()-s)+"msec");
	}
	
	void AOJ1155(){
		while(sc.hasNext()){
			String str=sc.next();
			if(str.equals("."))	break;
			int ans=0;
			for(int p=0; p<=2; p++){
				for(int q=0; q<=2; q++){
					for(int r=0; r<=2; r++){
						String s2=str.replaceAll("P", Integer.toString(p)).replaceAll("Q", Integer.toString(q)).replaceAll("R", Integer.toString(r))+"#";
						//out.println(s2+" "+new parsed(s2).intValue());
						if(new parsed(s2).intValue()==2)	ans++;
					}
				}
			}
			//out.print("ANS=");
			out.println(ans);
		}
	}
	// for AOJ1155
	public class parsed{
		String line;
		int pos=0,ans=0;
		parsed(String line){
			this.line=line;
			ans=term();
		}
		private int term(){
			int res=fact();
			while(true){
				char op=line.charAt(pos);
				int old=res;
				if(op=='+'){
					pos++;
					res=fact();
					if(res==2 || old==2)	res=2;
					else if(res==0 && old==0)	res=0;
					else	res=1;
				}else if(op=='*'){
					pos++;
					res=fact();
					if(res==0 || old==0)	res=0;
					else if(res==2 && old==2)	res=2;
					else	res=1;
				}else	break;
			}
			return res;
		}
		private int fact(){
			if(line.charAt(pos)=='-'){
				pos++;
				int temp=fact();
				return temp==0?2:temp==2?0:temp;
			}
			if(Character.isDigit(line.charAt(pos))){
				int r=(line.charAt(pos)-'0');
				pos++;
				return r;
			}else if(line.charAt(pos)=='('){
				pos++;
				int res=term();
				pos++;
				return res;
			}
			return 0;
		}
		public int intValue(){return ans;}
	}
	
	
	// AOJ2255 2011MOGI - D
	HashSet<Integer> ans=new HashSet<Integer>();
	ArrayList<Integer> d,k;	ArrayList<Character> e;
	void D(){
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			if(c[0]=='#')	break;
			d=new ArrayList<Integer>();
			k=new ArrayList<Integer>();
			e=new ArrayList<Character>();
			int p=0;
			for(int i=0; i<c.length; i++){
				if(Character.isDigit(c[i])){
					int dd=c[i]-'0';
					while(i+1<c.length){
						if(!Character.isDigit(c[i+1]))	break;
						dd=dd*10+(c[++i]-'0');
					}
					d.add(dd);
				}else if(c[i]=='(')	p++;
				else if(c[i]==')')	p--;
				else{
					e.add(c[i]);
					k.add(p);
				}
			}
			out.println(d);
			out.println(e);
			out.println(k);
			
			out.println(DtoString(d,e,k));
			for(int i=0; i<k.size(); i++)	solveD(k,new boolean[k.size()],i,k.size());
			
			out.println(ans.size());
		}
	}
	void solveD(ArrayList<Integer> k,boolean[] b,int idx,int n){
		if(n<=0){
			ans.add(new parsed(DtoString(d,e,k)).intValue());
		}else{
			// バックトラック
		}
	}
	String DtoString(ArrayList<Integer> d,ArrayList<Character> e,ArrayList<Integer> k){
		StringBuilder ans=new StringBuilder();
		int kk=0;
		for(int i=0; i<e.size(); i++){
			if(kk<k.get(i)){
				for(int j=0; j<abs(kk-k.get(i)); j++)	ans.append((kk<k.get(i)?"(":")"));
				kk=k.get(i);
			}
			ans.append(d.get(i));
			if(kk>k.get(i)){
				for(int j=0; j<abs(kk-k.get(i)); j++)	ans.append((kk<k.get(i)?"(":")"));
				kk=k.get(i);
			}
			ans.append(e.get(i));
		}
		ans.append(d.get(d.size()-1));
		while(--kk>=0)	ans.append(")");
		return ans.toString();
	}
	
	// 2011MOGI - A 15:02-15:08
	void AOJ2252(){
		HashSet<Character> right=new HashSet<Character>();
		right.add('y');	right.add('h');	right.add('n');	right.add('u');	right.add('j');	right.add('m');
		right.add('i');	right.add('k');	right.add('o');	right.add('l');	right.add('p');
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			if(c[0]=='#')	break;
			boolean r=false;
			if(right.contains(c[0]))	r=true;
			int ans=0;
			for(int i=1; i<c.length; i++){
				if(right.contains(c[i])){
					ans+=!r?1:0;
					r=true;
				}else{
					ans+=r?1:0;
					r=false;
				}
			}
			out.println(ans);
		}
	}
	
	// 2012MOGI - A	14:50-14:57
	void AOJ2399(){
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			boolean[][] b=new boolean[N+1][N+1];
			for(int i=1; i<=N; i++){
				int m=sc.nextInt();
				for(int j=0; j<m; j++)	b[i][sc.nextInt()]=true;
			}
			boolean[] ans=new boolean[N+1];
			Arrays.fill(ans, true);
			int k=sc.nextInt();
			for(int i=0; i<k; i++){
				int p=sc.nextInt();
				for(int j=1; j<=N; j++){
					if(!b[j][p])	ans[j]=false;
				}
			}
			int res=-1;
			for(int i=1; i<=N; i++){
				if(ans[i]){
					if(res<0)	res=i;
					else{
						res=-1;
						break;
					}
				}
			}
			out.println(res);
		}
	}
	
	
	// AOJ2253 2011MOGI - B
	void AOJ2253(){
		while(sc.hasNext()){
			int t=sc.nextInt(),n=sc.nextInt(),ans=0;
			final int BASE=100,MAX=BASE+50;
			if(t==0)	break;
			boolean[][] close=new boolean[MAX][MAX];
			for(int i=0; i<n; i++)	close[sc.nextInt()+BASE][sc.nextInt()+BASE]=true;
			int sx=sc.nextInt()+BASE,sy=sc.nextInt()+BASE;
			LinkedList<ClassB> open=new LinkedList<ClassB>();
			open.add(new ClassB(sx,sy,0));
			close[sx][sy]=true;
			while(!open.isEmpty()){
				ClassB now=open.poll();
				ans++;
				if(now.t>=t)	continue;
				for(int i=0; i<6; i++){
					int xx=now.x+vvx[i],yy=now.y+vvy[i];
					//if(!Point.ok(xx, yy, MAX, MAX))	continue;
					if(close[xx][yy])	continue;
					open.add(new ClassB(xx,yy,now.t+1));
					close[xx][yy]=true;
				}
			}
			out.println(ans);
		}
	}
	class ClassB{
		int x,y,t;
		ClassB(int x,int y,int t){this.x=x; this.y=y; this.t=t;}
	}
}