import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2005();
	}
	
	final int INF=Integer.MAX_VALUE/4;
	
	class AOJ2005{
		AOJ2005(){
			while(sc.hasNext()){
				int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt(),g1=sc.nextInt(),g2=sc.nextInt();
				if(n==0)	break;
				--s; --g1; --g2;
				solve(n,m,s,g1,g2);
			}
		}
		void solve(int n,int m,int s,int g1,int g2){
			int[][] g=new int[n][n];
			for(int i=0; i<n; ++i)for(int j=0; j<n; ++j)	g[i][j]=INF;
			for(int i=0; i<m; ++i){
				int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
				--a;	--b;
				g[a][b]=c;
			}
			
			ArrayList<HashSet<String>> c1=new ArrayList<HashSet<String>>(n);
			for(int i=0; i<n; ++i)	c1.add(new HashSet<String>());
			
			LinkedList<S1> o1=new LinkedList<S1>();
			o1.add(new S1(s,new String()));
			
			while(!o1.isEmpty()){
				S1 now=o1.poll();
				for(int i=0; i<n; ++i){
					if(now.p==i || g[now.p][i]>=INF)	continue;
					String tmp=now.s+i;
					if(!c1.get(i).contains(tmp)){
						o1.add(new S1(i,tmp));
						c1.get(i).add(tmp);
					}
				}
			}
			
			HashSet<String> cand=c1.get(g1);
			int ans=INF;
			for(String str:cand){
				
				int[][] gg=new int[n][n];
				for(int i=0; i<n; ++i)for(int j=0; j<n; ++j)gg[i][j]=g[i][j];
				
				int prev=s,cost1=0;
				for(int i=0; i<str.length(); ++i){
					cost1+=gg[prev][str.charAt(i)-'0'];
					gg[prev][str.charAt(i)-'0']=0;
					prev=str.charAt(i)-'0';
				}
				
				PriorityQueue<S2> o2=new PriorityQueue<S2>();
				o2.add(new S2(s,0));
				int[] c2=new int[n];
				for(int i=0; i<n; ++i)c2[i]=INF;
				
				int cost2=0;
				while(!o2.isEmpty()){
					S2 now=o2.poll();
					if(now.p==g2){
//						System.out.println("G2");
						cost2=now.c;
						break;
					}
					for(int i=0; i<n; ++i){
						if(now.p==i || gg[now.p][i]>=INF)	continue;
						int nc=now.c+gg[now.p][i];
						if(c2[i]<=nc)	continue;
						o2.add(new S2(i, nc));
						c2[i]=nc;
						
					}
				}
				
//				System.out.println(cost1+" "+cost2);
				ans=min(ans,cost1+cost2);
				
			}
			
			System.out.println(ans);
			
		}
		class E{
			int d,c;
			E(int d,int c){
				this.d=d;
				this.c=c;
			}
		}
		class S1{
			int p;
			String s;
			S1(int p,String s){
				this.p=p;
				this.s=s;
			}
		}
		class S2 implements Comparable<S2>{
			int p,c;
			S2(int p,int c){
				this.p=p;
				this.c=c;
			}
			@Override public int compareTo(S2 o){
				return this.c-o.c;
			}
		}
	}

}