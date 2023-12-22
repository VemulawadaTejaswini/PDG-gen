
import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		//new F();
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ0221(), "", STACK_SIZE).start();
	}
	
	class AOJ0221 implements Runnable{
		@Override public void run(){
			while(sc.hasNext()){
				int m=sc.nextInt(),n=sc.nextInt();
				if((m|n)==0)	break;
				solve(m,n);
			}
		}
		void solve(int M,int N){
			ArrayList<Integer> player=new ArrayList<Integer>(M);
			for(int i=1; i<=M; i++)	player.add(i);
			int idx=0;
			for(int i=1; i<=N; i++){
				String in=sc.next();
				if(player.size()<=1)	continue;
				if(i%3==0 && i%5==0){
					if(in.equals("FizzBuzz"))	++idx;
					else	player.remove(idx);
				}else if(i%3==0){
					if(in.equals("Fizz"))	++idx;
					else	player.remove(idx);
				}else if(i%5==0){
					if(in.equals("Buzz"))	++idx;
					else	player.remove(idx);
				}else{
					try{
						int n=Integer.parseInt(in);
						if(i==n)	++idx;
						else	player.remove(idx);
					}catch(Exception e){
						player.remove(idx);
					}
				}
				idx%=player.size();
			}
			for(int i=0; i<player.size(); i++)	System.out.print(player.get(i)+(i+1<player.size()?" ":"\n"));
		}
	}
	
	class D implements Runnable{
		final int INF=1<<29;
		int N;
		int[][] map;
		boolean[] leaf;
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		D(){}
//		D(){
//			while(sc.hasNext()){
//				N=sc.nextInt();
//				if(N==0)	break;
//				solve();
//			}
//		}
		void solve(){
			map=new int[N+1][N+1];
			leaf=new boolean[N+1];
			for(int i=0; i<=N; i++)for(int j=0; j<=N; j++)map[i][j]=INF;
			for(int i=0; i<N-1; i++){
				int a=sc.nextInt(),b=sc.nextInt(),t=sc.nextInt();
				map[a][b]=t;
			}
			int sum=DFS(1,0);
//			System.out.println(DFS(1,0));
			int[][] map2=new int[N+1][N+1];
			for(int i=0; i<=N; i++)for(int j=0; j<=N; j++)map2[i][j]=map[i][j];
			for(int i=0; i<=N; i++){
				for(int j=0; j<=N; j++){
					for(int k=0; k<=N; k++){
						map2[j][k]=min(map2[j][k], map2[j][i]+map2[i][k]);
					}
				}
			}
//			System.out.println(Arrays.toString(map2[1]));
			int max=0;
			for(int i=2; i<=N; i++){
				if(map2[1][i]>=INF || leaf[i])	continue;
				max=max(max,map2[1][i]);
			}
//			System.out.println("sum:"+sum+" max:"+max);
			System.out.println(2*sum-max);
		}
		int DFS(int now,int last){
			int ret=0,n=0;
			for(int i=1; i<=N; i++){
				if(i==now)	continue;
				if(!(map[now][i]<INF))	continue;
				int tmp=DFS(i,now);
				ret+=map[now][i]+tmp;
				++n;
//				System.out.println("now:"+now+" to:"+i+" tmp:"+tmp+" map"+map[now][i]);
			}
			ret-=n>0?0:map[last][now];
			if(n<=0)	leaf[now]=true;
			return ret;
		}
	}
	
	class E implements Runnable{
		@Override public void run(){
			while(sc.hasNext()){
				int N=sc.nextInt();
				if(N==0)	break;
				solve(N);
			}
		}
		E(){}
//		E(){
//			while(sc.hasNext()){
//				int N=sc.nextInt();
//				if(N==0)	break;
//				solve(N);
//			}
//		}
		void solve(int N){
			int[] d=new int[N],v=new int[N];
			for(int i=0; i<N; i++){
				d[i]=sc.nextInt();
				v[i]=sc.nextInt();
			}
			long vvv=v[0],ddd=d[0];
			for(int i=1; i<N; i++){
				long vv=v[i]*vvv;
				long d1=d[i]*vvv,d2=ddd*v[i];
				long d3=lcm(min(d1,d2),max(d1,d2));
				long gcd=gcd(d3,vv);
				vvv=vv/gcd;
				ddd=d3/gcd;
			}
			for(int i=0; i<N; i++){
				System.out.println(((long)v[i]*ddd/vvv)/(long)d[i]);
			}
		}
		long gcd(long x,long y){
			if(y==0)	return x;
			return gcd(y,x%y);
		}
		long lcm(long x,long y){
			return x/gcd(x,y)*y;
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
	

}