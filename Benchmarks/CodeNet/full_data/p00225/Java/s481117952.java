import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		//new I();
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new F(), "", STACK_SIZE).start();
	}
	
	class I{
		int INF = 1 << 24;
		I(){			
			//1615 start
			while(true){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				if((x|y|z) == 0) break;
				int [] vx = new int[x];
				for(int i = 0 ; i < x; i++){
					vx[i] = sc.nextInt();
				}
				int [][] map = new int[y][2];
				for(int i = 0 ; i < z; i++){
					int n = sc.nextInt();
					int e = sc.nextInt();
					int a = sc.nextInt();
					map[n][0] = e;
					map[n][1] = a;
				}
				
				double [] rate = new double[y + 1];
				int [] m = new int[y+1];
				double [] p = new double[y+1];
				rate[0] = 1.0;
				for(int i = 0; i < y; i++){
					
					for(int j = 0; j < vx.length; j++){
						int xx = i + vx[i];
						if(xx >= y){
							//goal
							rate[y] += (rate[i] / x);
							p[y] += p[i] /  (rate[i] / x);
						}
						
						if(map[xx][0] == 0){
							p[xx] += p[i] / (rate[i] / x);
							rate[xx] += rate[i] / x;
						}
						else{
							//event
							if(map[xx][0] == 1){
								int move = xx + map[xx][1];
								if(move > y){
									move = y;
								}
								rate[move] += rate[i] / x;
								p[y] += p[i] / (rate[i] / x);
							}
							else{
								int money = map[xx][1];
								if(map[xx][0] == 3){
									money = -money;
								}
								
								
							}
						}
					}
				}
			}
		}
	}
	
	class F implements Runnable{
		@Override public void run() {
			while(sc.hasNext()){
				int N=sc.nextInt();
				if(N==0)	break;
				System.out.println(solve(N)?"OK":"NG");
			}
		}
		F(){}
//		F(){
//			while(sc.hasNext()){
//				int N=sc.nextInt();
//				if(N==0)	break;
//				System.out.println(solve(N)?"OK":"NG");
//			}
//		}
		
		boolean solve(int N){
			String[] s=new String[N];
			for(int i=0; i<N; i++)	s[i]=sc.next();
			ArrayList<ArrayList<State1>> head=new ArrayList<ArrayList<State1>>(),
										tail=new ArrayList<ArrayList<State1>>();
			for(int i=0; i<(int)'z'-'a'; i++){
				head.add(new ArrayList<State1>());
				tail.add(new ArrayList<State1>());
			}
			for(int i=0; i<N; i++){
				head.get(s[i].charAt(0)-'a').add(new State1(i,s[i]));
				tail.get(s[i].charAt(s[i].length()-1)-'a').add(new State1(i,s[i]));
			}
			
			// TODO ok
			//System.out.println("head\n"+head);
			//System.out.println("tail\n"+tail);
			
			for(int i=0; i<(int)'z'-'a'; i++){
				boolean[] used=new boolean[N];
				for(int j=0; j<head.get(i).size(); j++){
					State1 h=head.get(i).remove(0);
					used[h.idx]=true;
					for(int k=0; k<tail.get(h.str.charAt(0)-'a').size(); k++){
						State1 t=tail.get(h.str.charAt(0)-'a').remove(0);
						// TODO ok
						//System.out.println("START2"+h+" "+t);
						if(!used[t.idx]){
							used[t.idx]=true;
							// TODO ok
							//System.out.println("START"+h+" "+t);
							if(DFS(N-2,head,tail,h.str.charAt(h.str.length()-1),t.str.charAt(0),used)){
								return true;
							}
							used[t.idx]=false;
						}
						tail.get(h.str.charAt(0)-'a').add(t);
					}
					head.get(i).add(h);
					used[h.idx]=false;
				}
			}
			return false;
		}
		boolean DFS(int remain,ArrayList<ArrayList<State1>> head,
						ArrayList<ArrayList<State1>> tail,char e,char s,boolean[] used){
			if(remain<=2){
				// TODO ok
				//System.out.println("END r:"+remain+" e:"+e+" s:"+s);
				if(head.get(e-'a').size()<=0)	return false;
				if(tail.get(s-'a').size()<=0)	return false;
				return true;
			}
			int N=head.get(e-'a').size(),M=tail.get(s-'a').size();
			LinkedList<State1> hstack=new LinkedList<State1>();
			for(int i=0; i<N; i++){
				hstack.push(head.get(e-'a').remove(0));
				if(used[hstack.peek().idx])	continue;
				char ee=hstack.peek().str.charAt(hstack.peek().str.length()-1);
				used[hstack.peek().idx]=true;
				LinkedList<State1> tstack=new LinkedList<State1>();
				for(int j=0; j<M; j++){
					tstack.push(tail.get(s-'a').remove(0));
					if(used[tstack.peek().idx])		continue;
					char ss=tstack.peek().str.charAt(0);
					used[tstack.peek().idx]=true;
					if(DFS(remain-2,head,tail,ee,ss,used))	return true;
					tail.get(s-'a').add(tstack.peek());
					used[tstack.pop().idx]=false;
				}
				for(State1 s1:tstack)	tail.get(s-'a').add(s1);
				head.get(e-'a').add(hstack.peek());
				used[hstack.pop().idx]=false;
			}
			for(State1 s1:hstack) head.get(e-'a').add(s1);
			return false;
		}
		class State1{
			int idx;
			String str;
			State1(int idx,String str){
				this.idx=idx;
				this.str=str;
			}
			@Override public String toString(){
				return "("+idx+":"+str+")";
			}
		}
	}
	
	class C{
		int n, m;
		C(){
			while(true){
				n = sc.nextInt();
				m = sc.nextInt();
				if((n|m) == 0 )break;
				int [][] data  = new int[n][n];
				for(int i = 0 ; i < n; i++){
					for(int j = 0 ; j < n; j++){
						data[i][j] = sc.nextInt();
					}
				}
				int [][][] mlist = new int[4][m][m];
				for(int i = 0 ; i < m; i++){
					for(int j = 0 ; j < m; j++){
						mlist[0][i][j] = sc.nextInt();
					}
				}
				//4-th
				for(int  i = 1 ; i < 4; i++){
					for(int y = 0 ; y < m; y++){
						for(int x = 0; x < m; x++){
							mlist[i][x][m- y - 1] = mlist[i-1][y][x];
						}
					}
				}
				
				//debug
//				for(int times = 0;times < 4; times++){
//					for(int i = 0 ; i < m; i++){
//						for(int j = 0 ; j < m; j++){
//							System.out.print(mlist[times][i][j]);
//						}
//						System.out.println();
//					}
//					System.out.println("----");
//					
//				}
				
				int [] xx = new int[4];
				int [] yy = new int[4];
				for(int times = 0 ; times < 4; times++){
					boolean flg = true;
					for(int i = 0 ; i < m; i++){
						for(int j = 0 ; j < m; j++){
							if(mlist[times][i][j] == -1){
								
							}
							else{
								xx[times] = j;
								yy[times] = i;
								flg = false;
								break;
							}
						}
						if(! flg){
							break;
						}
					}
					
				}
				
				//comp
				int ansx = 1 << 24, ansy = 1 << 24;
				for(int i = 0; i < n; i++){
					for(int j = 0 ; j < n; j++){
						for(int time = 0; time < 4; time++){
							boolean res = comp(i,j, data, mlist[time]);
							
							if(res){
								int candx = j + xx[time];
								int candy = i + yy[time];
//								System.out.println("i =" + i + "j = " + j + " " + time);
//								System.out.println(xx[time] + " " + yy[time]);
								if(ansy > candy || (ansy == candy && ansx > candx )){
									
									ansx = candx;
									ansy = candy;
								}
							}
						}
					}
				}
				if(ansx == 1 << 24){
					System.out.println("NA");
				}
				else{
					
					System.out.println((ansx + 1) + " " + (ansy + 1));
				}
			}
		}

		private boolean comp(int y, int x, int[][] data, int[][] mlist) {
			for(int i = 0 ; i < m;i++){
				for(int j = 0 ; j < m; j++){
					if(mlist[i][j] == -1)continue;
					if(i + y < n && j + x < n){
						
						if(data[i + y][j + x] == mlist[i][j]){
							
						}
						else{
							return false;
						}
					}
					else{
						return false;
					}
				}
			}
			return true;
		}
	}
	
	class B{
		final int MAX=1000001,INF=1<<29;
		int N,X;
		boolean[] prime;
		B(){
			prime=sieve(MAX);
			while(sc.hasNext()){
				N=sc.nextInt();
				X=sc.nextInt();
				if((N|X)==0)	break;
				solve();
			}
		}
		boolean[] sieve(int MAX){
			boolean[] list=new boolean[MAX+1];
			list[0]=true;
			list[1]=true;
			for(int i=2; i*i<=MAX; i++){
				if(!list[i])for(int j=i+i; j<=MAX; j+=i)list[j]=true;
			}
			return list;
		}
		void solve(){
			TreeSet<Integer> aa=new TreeSet<Integer>();
			for(int i=0; i<N; i++)	aa.add(sc.nextInt());
			N=aa.size();
			int[] a=new int[N];
			int idx=0;
			for(int i:aa)	a[idx++]=i;
			int[] dp=new int[X+1];
			int ans=-1;
			for(int i=0; i<N; i++){
				for(int j=1; j<=X; j++){
					if(j<a[i]){
						dp[j]=dp[j-1];
					}else{
						int tmp=dp[j-a[i]]+a[i]<=X?dp[j-a[i]]+a[i]:0;
						dp[j]=max(dp[j], tmp);
						if(!prime[tmp])ans=max(ans,tmp);
					}
				}
			}
			//System.out.println(Arrays.toString(dp));
			System.out.println(ans>0?ans:"NA");
		}
	}
	
	class B2{
		final int MAX=1000001,INF=1<<29;
		int N,X;
		boolean[] prime;
		int[] vtd;
		B2(){
			prime=sieve(MAX);
			while(sc.hasNext()){
				N=sc.nextInt();
				X=sc.nextInt();
				if((N|X)==0)	break;
				solve();
			}
		}
		boolean[] sieve(int MAX){
			boolean[] list=new boolean[MAX+1];
			list[0]=true;
			list[1]=true;
			for(int i=2; i*i<=MAX; i++){
				if(!list[i])for(int j=i+i; j<=MAX; j+=i)list[j]=true;
			}
			return list;
		}
		void solve(){
			int[] a=new int[N];
			for(int i=0; i<N; i++)	a[i]=sc.nextInt();
			int[][] dp=new int[N+1][X+1];
			int ans=-1;
			for(int i=0; i<N; i++){
				for(int j=0; j<=X; j++){
					if(j<a[i]){
						dp[i+1][j]=dp[i][j];
					}else{
						dp[i+1][j]=max(dp[i][j], dp[i+1][j-a[i]]+a[i]);
						if(!prime[dp[i+1][j]])ans=max(ans,dp[i+1][j]);
					}
				}
			}
			System.out.println(ans>0?ans:"NA");
		}
	}
}