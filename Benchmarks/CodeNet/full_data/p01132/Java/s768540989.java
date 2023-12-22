import java.util.*;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2007();
	}
}

class AOJ2007{
	final Scanner sc = new Scanner(System.in);
	int n;
	int[] d={10,50,100,500};
	AOJ2007(){
		int cnt=0;
		while(sc.hasNext()){
			n=sc.nextInt();
			if(n==0)	break;
			if(cnt++>0)	System.out.println();
			solve();
		}
	}
	void solve(){
		int[] h=new int[4];
		int sum=0;
		for(int i=0; i<4; ++i){
			h[i]=sc.nextInt();
			sum+=h[i];
		}
		
		int ans=100;
		int[] o=new int[4];
		for(int i=0; i<=h[0]; ++i)for(int j=0; j<=h[1]; ++j)for(int k=0; k<=h[2]; ++k)for(int l=0; l<=h[3]; ++l){
			int[] tmp={i,j,k,l};
//			System.out.println("A"+Arrays.toString(tmp));
			int ret=solve2( tmp );
			if(ret>=0 && ans > sum-(i+j+k+l)+ret){
				o[0]=i;	o[1]=j; o[2]=k; o[3]=l;
				ans=(sum-(i+j+k+l)+ret);
//				System.out.println("B"+(sum-(i+j+k+l)));
			}
//			System.out.println("ret"+ret+" ans"+ans);
		}
		
		for(int i=0; i<4; ++i){
			if(o[i]>0){
				System.out.println(d[i]+" "+o[i]);
			}
		}
		
	}
	int solve2(int[] s){
		int sum=0;
		for(int i=0; i<4; ++i)sum+=s[i]*d[i];
		int diff=sum-n;
//		System.out.println("sum"+sum+" diff"+diff);
		if(diff<0)	return -1;
		int[] t=new int[4];
		for(int i=3; i>=0; --i){
			while(diff>=d[i]){
				diff-=d[i];
				++t[i];
			}
		}
		
		int ret=0;
		for(int i=0; i<4; ++i){
			if(s[i]>0 && t[i]>0)	return -1;
			ret+=t[i];
		}
//		System.out.println("R"+Arrays.toString(t));
		return ret;
	}
}

class AOJ2006{
	final Scanner sc = new Scanner(System.in);
	char[][] dic = {{},{'.',',','!','?',' '},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	int[] mod={5,3,3,3,3,3,4,3,4};
	AOJ2006(){
		int n=sc.nextInt();
		while(--n>=0)	solve();
	}
	void solve(){
		char[] c=sc.next().toCharArray();
		int[] a=new int[c.length];
		for(int i=0; i<c.length; ++i)a[i]=c[i]-'0';
		int p=0;
		StringBuilder ans=new StringBuilder();
		while(p<a.length){
			int b=a[p],cnt=0;
			++p;
			if(b==0)	continue;
			while(a[p]!=0){
				++cnt;
				++p;
			}
			ans.append(dic[b][cnt%mod[b-1]]);
		}
		System.out.println(ans);
	}
}

class AOJ2011{
	final Scanner sc = new Scanner(System.in);
	AOJ2011(){
		while(sc.hasNext()){
			n=sc.nextInt();
			if(n==0)	break;
			solve();
		}
	}
	int n;
	ArrayList<ArrayList<Integer>> f;
	void solve(){
		f=new ArrayList<ArrayList<Integer>>(n);
		for(int i=0; i<=30; ++i)f.add(new ArrayList<Integer>());
		for(int i=0; i<n; ++i){
			int m=sc.nextInt();
			for(int j=0; j<m; ++j){
				int d=sc.nextInt();
				f.get(d).add(i);
			}
		}
		
//		System.out.println(f);
		
		int l=-1,r=31,c=0;
		while(l+1<r){
			c=(l+r)/2;
			int[] init=new int[n];
			for(int j=0; j<n; ++j)init[j]=1;
			if( dfs(init, 1, c) ){
				r=c;
			}else{
				l=c;
			}
		}
		System.out.println(r>30? -1: r);
		
//		for(int i=1; i<=30; ++i){
//			int[] init=new int[n];
//			for(int j=0; j<n; ++j)init[j]=1;
//			if( dfs(init,1,i) ){
//				System.out.println(i);
//				return;
//			}
//		}
//		System.out.println(-1);
	}
	boolean dfs(int[] list,int depth,int lim){
		
//		System.out.println(depth+" "+Arrays.toString(list));
		
		for(int i=0; i<n; ++i)if(list[i]>=n)	return true;
		
		if(depth>lim)	return false;
		
		ArrayList<Integer> cand=f.get(depth);
		if(cand.size()>=2){
			for(int i=0; i<cand.size(); ++i){
				int[] prev=new int[cand.size()];
				prev[0]=list[cand.get(i)];
				int k=1;
				for(int j=0; j<cand.size(); ++j){
					if(i==j)	continue;
					prev[k++]=list[cand.get(j)];
					list[cand.get(i)]+=list[cand.get(j)];
					list[cand.get(j)]=0;
				}
				if( dfs(list, depth+1, lim) )	return true;
				list[cand.get(i)]=prev[0];
				k=1;
				for(int j=0; j<cand.size(); ++j){
					if(i==j)	continue;
					list[cand.get(j)]=prev[k++];
				}
			}
		}else{
			if( dfs(list, depth+1, lim) )	return true;
		}
		
		return false;
		
	}
}

class AOJ2005{
	final Scanner sc = new Scanner(System.in);
	AOJ2005(){
		while(sc.hasNext()){
			int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt(),g1=sc.nextInt(),g2=sc.nextInt();
			if(n==0)	break;
			--s; --g1; --g2;
			solve(n,m,s,g1,g2);
		}
	}
	final int INF=Integer.MAX_VALUE/4;
	void solve(int n,int m,int s,int g1,int g2){
		int[][] g=new int[n][n];
		for(int i=0; i<n; ++i)for(int j=0; j<n; ++j)	g[i][j]=INF;
		for(int i=0; i<m; ++i){
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			--a; --b;
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
					if(i!=g1)	o1.add(new S1(i,tmp));
					c1.get(i).add(tmp);
				}
			}
		}
		
		
		
		HashSet<String> cand=new HashSet<String>();
		cand.addAll(c1.get(g1));
		c1=null;
		System.gc();
		
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
//					System.out.println("G2");
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
			
//			System.out.println(cost1+" "+cost2);
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