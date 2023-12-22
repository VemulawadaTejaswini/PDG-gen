import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		//long start=System.currentTimeMillis();
		new AOJ1268();
		//System.out.println(" ["+ (System.currentTimeMillis()-start) +"msec]");
	}
	
	class AOJ1268{
		HashMap<String,Integer> visited;
		String fin;
		//TODO debug
		int C=0;
		final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
		AOJ1268(){
			while(true){
				int X=sc.nextInt(),Y=sc.nextInt();
				if((X|Y)==0)	break;
				solve(X-1,Y-1);
			}
		}
		void solve(int X,int Y){
			// TODO debug
			C=0;
			StringBuilder tmp=new StringBuilder();
			for(int i=0; i<9; i++){
				String in=sc.next();
				int c=0;
				if(in.equals("W"))	c=1;
				if(in.equals("B"))	c=2;
				if(in.equals("R"))	c=3;
				tmp.append(c);
			}
			fin=tmp.toString();
			int l=-1,r=31,mid=0;
			while(l+1<r){
				mid=(l+r)/2;
				StringBuilder init=new StringBuilder("131313131313131313");
				init.setCharAt((Y*3+X)*2,'0');
				init.setCharAt((Y*3+X)*2+1,'0');
				visited=new HashMap<String, Integer>();
				if(IDDFS(0,mid,init,X,Y))	r=mid;
				else						l=mid;
			}
			System.out.println(r>30?-1:r);
			//System.out.println((r>30?-1:r)+" "+C+"step");
//			int ans=-1;
//			for(int i=0; i<=30; i++){
//				StringBuilder init=new StringBuilder("131313131313131313");
//				init.setCharAt((Y*3+X)*2,'0');
//				init.setCharAt((Y*3+X)*2+1,'0');
//				visited=new HashMap<String, Integer>();
//				if(IDDFS(0,i,init,X,Y)){
//					ans=i;
//					break;
//				}
//			}
//			//System.out.println(ans);
//			System.out.println(ans+" "+C+"step");
		}
		boolean IDDFS(int depth,int lim,StringBuilder dice,int ex,int ey){
			//TODO debug
			++C;
			int hs=0;
			for(int i=0; i<9; i++)	if(dice.charAt(i*2)!=fin.charAt(i) && dice.charAt(i*2)!='0')	hs++;
			if(hs==0)	return true;
			if(depth+hs>lim)	return false;
			for(int v=0; v<4; v++){
				int xx=ex+vx[v], yy=ey+vy[v],offset=(3*yy+xx)*2,eoffset=(3*ey+ex)*2;
				if(!(0<=xx && xx<3 && 0<=yy && yy<3))	continue;
				char nt='a',ns='a',ot=dice.charAt(offset),os=dice.charAt(offset+1);
				if(abs(vx[v])==1){
					nt=turnR((dice.charAt(offset)-'0'),(dice.charAt(offset+1)-'0'));
					ns=dice.charAt(offset+1);
				}else{
					nt=dice.charAt(offset+1);
					ns=dice.charAt(offset);
				}
				dice.setCharAt(offset, dice.charAt(eoffset));
				dice.setCharAt(offset+1, dice.charAt(eoffset+1));
				dice.setCharAt(eoffset, nt);
				dice.setCharAt(eoffset+1, ns);
				if(!visited.containsKey(dice.toString()) || visited.get(dice.toString())>depth){
					visited.put(dice.toString(), depth);
					if(IDDFS(depth+1,lim,dice,xx,yy))	return true;
				}
				dice.setCharAt(eoffset, dice.charAt(offset));
				dice.setCharAt(eoffset+1, dice.charAt(offset+1));
				dice.setCharAt(offset, ot);
				dice.setCharAt(offset+1, os);
			}
			return false;
		}
		char turnR(int t,int s){
			for(int i=1; i<=3; i++)if(t!=i && s!=i)return (char)(i+'0');
			return 'b';
		}
	}
	
	class AOJ1268old{
		HashMap<String,Integer> visited;
		String fin;
		//TODO debug
		int C=0;
		final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
		AOJ1268old(){
			while(true){
				int X=sc.nextInt(),Y=sc.nextInt();
				if((X|Y)==0)	break;
				solve(X,Y);
			}
		}
		void solve(int X,int Y){
			// TODO debug
			C=0;
			StringBuilder tmp=new StringBuilder();
			for(int i=0; i<9; i++){
				String in=sc.next();
				int c=0;
				if(in.equals("W"))	c=1;
				if(in.equals("B"))	c=2;
				if(in.equals("R"))	c=3;
				tmp.append(c);
			}
			fin=tmp.toString();
			int ans=-1;
			for(int i=0; i<=30; i++){
				ColoredDice[][] init=new ColoredDice[3][3];
				for(int j=0; j<9; j++)	init[j%3][j/3]=new ColoredDice(((X-1)+3*(Y-1))==j?0:1);
				visited=new HashMap<String, Integer>();
				if(IDDFS(0,i,init)){
					ans=i;
					break;
				}
			}
			//System.out.println(ans);
			System.out.println(ans+" "+C+"step");
		}
		boolean IDDFS(int depth,int max,ColoredDice[][] d){
			//TODO debug
			++C;
			int hs=0,ex=-1,ey=-1;
			for(int i=0; i<9; i++){
				if(d[i%3][i/3].top==0){
					ex=i%3;	ey=i/3;
				}
				else if(d[i%3][i/3].top!=fin.charAt(i)-'0')hs++;
			}
			if(hs==0)	return true;
			if(depth+hs>max)	return false;
			for(int v=0; v<4; v++){
				int xx=ex+vx[v], yy=ey+vy[v];
				if(!(0<=xx && xx<3 && 0<=yy && yy<3))	continue;
				ColoredDice tmp=d[xx][yy];
				d[xx][yy]=d[ex][ey];
				d[ex][ey]=tmp.turn(vx[v], vy[v]);
				StringBuilder sb=new StringBuilder();
				for(int j=0; j<9; j++)sb.append(d[j%3][j/3].toString());
				if(!visited.containsKey(sb.toString()) || visited.get(sb.toString())>depth){
					visited.put(sb.toString(), depth);
					if(IDDFS(depth+1,max,d))	return true;
				}
				d[ex][ey]=d[xx][yy];
				d[xx][yy]=tmp.turn(vx[v], vy[v]);
			}
			return false;
		}
		class ColoredDice{
			private int top=1,	bottom=1,
						east=2,	west=2,
						north=3,south=3;
			ColoredDice(int t){
				if(t==2)	turnEast();
				if(t==3)	turnNorth();
				if(t==0){
					top=0;	bottom=0;	east=0;
					west=0;	north=0;	south=0;
				}
			}
			ColoredDice turn(int x,int y){
				if(abs(x)==1)	return turnEast();
				if(abs(y)==1)	return turnNorth();
				return null;
			}
			ColoredDice turnEast(){
				int tmp=east;
				east=top;
				top=west;
				west=bottom;
				bottom=tmp;
				return this;
			}
			ColoredDice turnWest(){
				int tmp=west;
				west=top;
				top=east;
				east=bottom;
				bottom=tmp;
				return this;
			}
			ColoredDice turnSouth(){
				int tmp=south;
				south=top;
				top=north;
				north=bottom;
				bottom=tmp;
				return this;
			}
			ColoredDice turnNorth(){
				int tmp=north;
				north=top;
				top=south;
				south=bottom;
				bottom=tmp;
				return this;
			}
			int getTop(){
				return top;
			}
			@Override public String toString(){
				return ""+top+south;
			}
		}
	}

	
	// Asia 2003JP#D Weather forecast(DFS)
	class AOJ1243DFS{
		final int[] v={0,-8,-4,1,2,4,8,-1,-2};
		ArrayList<HashSet<String>> visited;
		AOJ1243DFS(){
			while(true){
				int N=sc.nextInt();
				if(N==0)	break;
				System.out.println(solve(N)?1:0);
			}
		}
		boolean solve(int N){
			boolean[][] s=new boolean[17][N+1];
			visited=new ArrayList<HashSet<String>>();
			visited.add(new HashSet<String>());
			for(int y=1; y<=N; y++){
				visited.add(new HashSet<String>());
				for(int x=1; x<=16; x++)s[x][y]=(sc.nextInt()==1);
			}
			if(s[6][1] || s[7][1] || s[10][1] || s[11][1])	return false;
			return DFS(6,2,N,"11116",s);
		}
		boolean DFS(int cx,int depth,int N,String r,boolean[][] s){
			if(depth>N)	return true;
			for(int i=0; i<9; i++){
				if(!(cx==1||cx==5||cx==9) && v[i]==2)continue;
				if(!(cx==3||cx==7||cx==11) && v[i]==-2)continue;
				int c=cx+v[i];
				if(!((1<=c && c<=3)||(5<=c && c<=7)||(9<=c && c<=11)))	continue;
				if(s[c][depth] || s[c+1][depth] || s[c+4][depth] || s[c+5][depth])	continue;
				int[] r2=decode(r);
				switch(c){
				case 1:r2[0]=-1;	break;
				case 3:r2[1]=-1;	break;
				case 11:r2[2]=-1;	break;
				case 9:r2[3]=-1;	break;
				}
				boolean f=true;
				for(int j=0; j<4; j++)if(++r2[j]>6)f=false;
				if(!f)continue;
				String r3=encode(r2,c);
				if(visited.get(depth).contains(r3))continue;
				visited.get(depth).add(r3);
				if(DFS(c,depth+1,N,r3,s))	return true;
			}
			return false;
		}
		int[] decode(String r){
			int[] ret=new int[4];
			for(int i=0; i<4; i++)ret[i]=r.charAt(i)-'0';
			return ret;
		}
		String encode(int[] r,int c){
			StringBuilder ret=new StringBuilder();
			for(int i=0; i<4; i++)ret.append(r[i]);
			ret.append(c);
			return ret.toString();
		}
	}
	
	
	// Asia 2003JP#D Weather forecast(BFS)
	class AOJ1243BFS{
		final int[] v={0,-8,-4,1,2,4,8,-1,-2};
		AOJ1243BFS(){
			while(true){
				int N=sc.nextInt();
				if(N==0)	break;
				System.out.println(solve(N)?1:0);
			}
		}
		boolean solve(int N){
			boolean[][] s=new boolean[17][N+1];
			ArrayList<HashSet<String>> closed=new ArrayList<HashSet<String>>();
			for(int y=1; y<=N; y++){
				closed.add(new HashSet<String>());
				for(int x=1; x<=16; x++)s[x][y]=(sc.nextInt()==1);
			}
			if(s[6][1] || s[7][1] || s[10][1] || s[11][1])	return false;
			LinkedList<State> open=new LinkedList<Main.AOJ1243BFS.State>();
			open.add(new State(2, 6, "11116"));
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.day>N)	return true;
				for(int i=0; i<9; i++){
					if(!(now.c==1||now.c==5||now.c==9) && v[i]==2)continue;
					if(!(now.c==3||now.c==7||now.c==11) && v[i]==-2)continue;
					int cc=now.c+v[i];
					if(!((1<=cc && cc<=3)||(5<=cc && cc<=7)||(9<=cc && cc<=11)))	continue;
					if(s[cc][now.day] || s[cc+1][now.day] || s[cc+4][now.day] || s[cc+5][now.day])	continue;
					int[] r=now.decode();
					switch(cc){
					case 1:r[0]=-1;		break;
					case 3:r[1]=-1;		break;
					case 11:r[2]=-1;	break;
					case 9:r[3]=-1;		break;
					}
					boolean f=true;
					for(int j=0; j<4; j++)if(++r[j]>6)f=false;
					if(!f)continue;
					State next=new State(now.day+1, cc, r);
					if(next.day>N)	return true;
					if(closed.get(now.day).contains(next.r))continue;
					open.add(next);
					closed.get(now.day).add(next.r);
				}
			}
			return false;
		}
		class State{
			int c,day;
			String r;
			State(int day,int c,String r){
				this.day=day;
				this.c=c;
				this.r=r;
			}
			State(int day,int c,int[] r){
				this.day=day;
				this.c=c;
				StringBuilder tmp=new StringBuilder();
				for(int i=0; i<4; i++)tmp.append(r[i]);
				tmp.append(c);
				this.r=tmp.toString();
			}
			int[] decode(){
				int[] ret=new int[4];
				for(int i=0; i<4; i++)ret[i]=r.charAt(i)-'0';
				return ret;
			}
		}
	}
	
	
	// Confusing Login Names
	class AOJ1252{
		AOJ1252(){
			while(true){
				int N=sc.nextInt();
				if(N==0)	break;
				solve(N);
			}
		}
		void solve(int N){
			int D=sc.nextInt();
			String[] names=new String[N];
			for(int i=0; i<N; i++)	names[i]=sc.next();
			Arrays.sort(names);
			ArrayList<TreeSet<String>> state1=new ArrayList<TreeSet<String>>(),state2=new ArrayList<TreeSet<String>>();
			//ArrayList<HashSet<String>> state1=new ArrayList<HashSet<String>>(),state2=new ArrayList<HashSet<String>>();
			for(int i=0; i<N; i++){
				TreeSet<String> tmp=new TreeSet<String>();
				//HashSet<String> tmp=new HashSet<String>();
				for(int j=0; j<names[i].length(); j++){
					tmp.add(new StringBuilder(names[i]).deleteCharAt(j).toString());
					for(int k=0; k<26; k++){
						char c=(char)('a'+k);
						tmp.add(new StringBuilder(names[i]).insert(j, c).toString());
						StringBuilder sb=new StringBuilder(names[i]);
						sb.setCharAt(j, c);
						tmp.add(sb.toString());
					}
					tmp.add(swap(j,min(j+1,names[i].length()-1),names[i]));
				}
				for(int k=0; k<26; k++)	tmp.add(names[i]+(char)('a'+k));
				state1.add(tmp);
			}
			if(D>1)	state2=state1;
			else{
				for(int i=0; i<N; i++){
					TreeSet<String> tmp=new TreeSet<String>();
					//HashSet<String> tmp=new HashSet<String>();
					tmp.add(names[i]);
					state2.add(tmp);
				}
			}
			
			TreeSet<Pair> ans=new TreeSet<Main.AOJ1252.Pair>();
			for(int i=0; i<N; i++){
				for(int j=i+1; j<N; j++){
					if(names[i].length()-names[j].length()>4)	continue;
					for(String s:state1.get(i)){
						if(state2.get(j).contains(s))	ans.add(new Pair(names[i],names[j]));
					}
				}
			}
			for(Pair p:ans)	System.out.println(p);
			System.out.println(ans.size());
		}
		String swap(int a,int b,String str){
			StringBuilder sb=new StringBuilder(str);
			char tmp=sb.charAt(a);
			sb.setCharAt(a, sb.charAt(b));
			sb.setCharAt(b, tmp);
			return sb.toString();
		}
		class Pair implements Comparable<Pair>{
			String s1,s2;
			Pair(String s1,String s2){
				this.s1=s1;
				this.s2=s2;
			}
			@Override public int compareTo(Pair p){
				if(s1==p.s2 && s2==p.s1)	return 0;
				return s1.compareTo(p.s1)!=0?s1.compareTo(p.s1) :s2.compareTo(p.s2);
			}
			@Override public String toString(){
				return s1+","+s2;
			}
		}
	}
	
	
	// Gap
	class AOJ1245{
		AOJ1245(){
			int N=sc.nextInt();
			while(--N>=0)	solve();
		}
		void solve(){
			StringBuilder init=new StringBuilder(),fin=new StringBuilder();
			for(int i=1; i<=4; i++){
				init.append("##");
				for(int j=1; j<=7; j++){
					init.append(sc.nextInt());
					fin.append(i);	fin.append(j);
				}
				fin.append("##");
			}
			for(int i=0; i<32; i++){
				if(init.charAt(i*2+1)=='1')	nSwap(i*2,(init.charAt(i*2)-'0'-1)*16,init);
			}
			int ans=-1;
			PriorityQueue<State1> open=new PriorityQueue<State1>();
			open.add(new State1(init,0));
			HashMap<String,Integer> closed=new HashMap<String, Integer>();
			closed.put(init.toString(),0);
			while(!open.isEmpty()){
				State1 now=open.poll();
				if(now.sb.toString().equals(fin.toString())){
					ans=now.step;
					break;
				}
				for(int i=0; i<32; i++){
					if(now.sb.charAt(i*2)=='#' && now.sb.charAt((i-1)*2)!='#'){
						int s=now.sb.charAt((i-1)*2)-'0',v=now.sb.charAt((i-1)*2+1)-'0';
						if(v>=7)	continue;
						boolean bf=false;
						for(int j=0; j<32; j++){
							if(now.sb.charAt(j*2)-'0'==s && now.sb.charAt(j*2+1)-'0'==v+1){
								StringBuilder tmp=new StringBuilder(now.sb);
								nSwap(i*2,j*2,tmp);
								if(tmp.toString().equals(fin.toString())){
									ans=now.step+1;
									open.clear();
									bf=true;
									break;
								}
								if(closed.containsKey(tmp.toString()) && closed.get(tmp.toString())<=now.step+1)	break;
								open.add(new State1(tmp,now.step+1));
								closed.put(tmp.toString(),now.step+1);
								break;
							}
						}
						if(bf)	break;
					}
				}
			}
			System.out.println(ans);
		}
		void nSwap(int a,int b,StringBuilder sb){
			if(a==b)	return;
			swap(a,b,sb);
			swap(++a,++b,sb);
		}
		void swap(int a,int b,StringBuilder sb){
			char tmp=sb.charAt(a);
			sb.setCharAt(a, sb.charAt(b));
			sb.setCharAt(b, tmp);
		}
		class State1 implements Comparable<State1>{
			StringBuilder sb;
			int step;
			State1(StringBuilder sb,int step){
				this.sb=sb;	this.step=step;
			}
			@Override public int compareTo(State1 o) {
				return this.step-o.step;
			}
		}
	}
	
	class AOJ1258{
		final int INF=Integer.MAX_VALUE/4;
		AOJ1258(){
			while(true){
				int M=sc.nextInt(),C=sc.nextInt(),N=sc.nextInt();
				if(((M|C)|N)==0)	break;
				System.out.println(solve(M,C,N));
			}
		}
		int solve(int M,int C,int N){
			LinkedList<LinkedList<Integer>> q=new LinkedList<LinkedList<Integer>>();
			for(int i=0; i<N; i++){
				q.add(new LinkedList<Integer>());
				int K=sc.nextInt();
				for(int j=0; j<K; j++)	q.getLast().add(sc.nextInt());
			}
			Store store=new Store(M,C);
			int ans=0;
			while(!q.isEmpty()){
				int r=q.getFirst().poll();
				ans+=store.take(r);
				ans+=store.put(r);
				//debug
				//System.out.println(store);
				if(q.getFirst().isEmpty())	q.removeFirst();
				else	q.addLast(q.poll());
			}
			return ans;
		}
		class Store{
			int M,C,time;
			ArrayList<ArrayList<Book>> desks;
			Store(int m,int c){
				this.M=m;	this.C=c;	this.time=0;
				desks=new ArrayList<ArrayList<Book>>();
				for(int i=0; i<M; i++)	desks.add(new ArrayList<Book>());
			}
			int take(int r){
				int ret=M+1;
				for(int i=0; i<M; i++){
					for(int j=0; j<desks.get(i).size(); j++){
						if(desks.get(i).get(j).id==r){
							desks.get(i).remove(j);
							ret=i+1;
							break;
						}
					}
					if(ret<M+1)	break;
				}
				return ret;
			}
			int put(int r){
				int ret=M+1;
				if(desks.get(0).size()<C){
					desks.get(0).add(new Book(r,time++));
					ret=1;
				}else{
					ret=0;
					Pair tmpIdx=new Pair(M,0);
					for(int i=1; i<M; i++){
						if(desks.get(i).size()<C){
							tmpIdx.first=i;
							desks.get(i).add(new Book(INF,INF));
							tmpIdx.second=desks.get(i).size()-1;
							break;
						}
					}
					ret+=tmpIdx.first+1;
					int oldestTime=desks.get(0).get(0).t,oldestIdx=0;
					for(int i=1; i<desks.get(0).size(); i++){
						if(oldestTime>desks.get(0).get(i).t){
							oldestTime=desks.get(0).get(i).t;
							oldestIdx=i;
						}
					}
					Book oldest=desks.get(0).remove(oldestIdx);
					ret+=1;
					int empIdx=M;
					for(int i=1; i<M; i++){
						if(desks.get(i).size()<C){
							desks.get(i).add(oldest);
							empIdx=i;
							break;
						}
					}
					ret+=empIdx+1;
					if(tmpIdx.first<M)	desks.get(tmpIdx.first).remove(tmpIdx.second);
					ret+=tmpIdx.first+1;
					desks.get(0).add(new Book(r,time++));
					ret+=1;
				}
				return ret;
			}
			@Override public String toString(){return desks.toString();}
		}
		class Book{
			int id,t;
			Book(int id,int t){this.id=id;this.t=t;}
			@Override public String toString(){return "ID"+id+" T"+t;}
		}
		class Pair implements Comparable<Pair>{
			int first,second;
			Pair(int first,int second){this.first=first; this.second=second;}
			@Override public String toString(){return "("+first+","+second+")";}
			@Override public int compareTo(Pair p){
				if(this.first<p.first)	return -1;
				if(this.first>p.first)	return 1;
				if(this.second<p.second)	return -1;
				if(this.second>p.second)	return 1;
				return 0;
			}
			@Override public int hashCode(){
				return 17+31*first+second;
			}
			@Override public boolean equals(Object obj){
				if(this==obj)	return true;
				if(obj==null)	return false;
				if(this.getClass() != obj.getClass())	return false;
				Pair p=(Pair)obj;
				if(this.first==p.first&&this.second==p.second)	return true;
				return false;
			}
		}
	}
	
	class AOJ1262{
		final double INF=Double.MAX_VALUE/4.0;
		AOJ1262(){
			while(true){
				int N=sc.nextInt();
				if(N==0)	break;
				System.out.printf("%.4f\n",solve(N));
			}
		}
		double solve(int N){
			int[] a=new int[N+1];
			for(int i=1; i<=N; i++)	a[i]=sc.nextInt();
			double b=sc.nextDouble();
			int r=sc.nextInt();
			double v=sc.nextDouble(),e=sc.nextDouble(),f=sc.nextDouble();
			double[][] dp=new double[N+1][N+1];
			for(int i=1; i<=N; i++)for(int j=0; j<=N; j++)dp[i][j]=INF;
			//flash(dp,N);
			double tmp=0.0;
			for(int i=0; i<a[1]; i++)	tmp+=exp(i,r,v,e,f);
			dp[1][0]=tmp;
			for(int w=1; w<N; w++){
				for(int h=0; h<w; h++){
					int d=a[w+1]-a[w],x=a[w]-a[h];
					double exp=0.0;
					for(int i=0; i<d; i++)	exp+=exp(x++,r,v,e,f);
					//debug
					//System.out.println(exp);
					dp[w+1][h]=dp[w][h]+exp;
					double exp2=0.0;
					for(int i=0; i<d; i++)	exp2+=exp(i,r,v,e,f);
					dp[w+1][w]=min(dp[w+1][w], dp[w][h]+exp2+b);
				}
				//debug
				//System.out.println("new "+dp[w+1][w]);
			}
			//flash(dp,N);
			double ans=INF;
			for(int i=0; i<=N; i++)	ans=min(ans,dp[N][i]);
			return ans;
		}
		double exp(int x,double r,double v,double e,double f){
			return x>=r?(1/(v-e*(x-r))):(1/(v-f*(r-x)));
		}
		void flash(double[][] dp,int N){
			for(int y=0; y<=N; y++){
				for(int x=0; x<=N; x++)	System.out.printf("%3.3f ",dp[x][y]>=INF?-1:dp[x][y]);
				System.out.println();
			}
		}
	}
}