import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;
public class Main {
	static Scanner scn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static Mathplus mp = new Mathplus();
	static PrintWriter ot = new PrintWriter(System.out);
	static Random rand = new Random();
	static StringManager sm = new StringManager(" ");
	static long mod = 1000000007;
	static long modmod = mod * mod;
	static long inf = (long)1e17;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[] dx8 = {-1,-1,-1,0,0,1,1,1};
	static int[] dy8 = {-1,0,1,-1,1,-1,0,1};
	static char[] dc = {'R','D','L','U'};
	static String sp = " ";
	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		Graph g = new Graph(N);
		for(int i=0;i<N;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for(int i = 0; i < N-1; i++){
			for(int j = i+1; j < N; j++){
				g.addWeightedEdge(i,j,Math.min(Math.abs(x[i]-x[j]), Math.abs(y[i]-y[j])));
			}
		}
		long L = g.Kruskal();
		System.out.println(L);
	}
}


class UnionFindTree {
	int[] root;
	int[] rank;
	int[] size;
	int[] edge;
	int num;
	UnionFindTree(int N){
		root = new int[N];
		rank = new int[N];
		size = new int[N];
		edge = new int[N];
		num = N;
		for(int i=0;i<N;i++){
			root[i] = i;
			size[i] = 1;
		}
	}
	public boolean isRoot(int x) {
		return x==find(x);
	}
	public int extraEdge(int x) {
		int r = find(x);
		return edge[r] - size[r] + 1;
	}
	public int find(int x){
		if(root[x]==x){
			return x;
		}else{
			return find(root[x]);
		}
	}

	public void unite(int x,int y){
		x = find(x);
		y = find(y);
		if(x==y){
			edge[x]++;
			return;
		}else{
			num--;
			if(rank[x]<rank[y]){
				root[x] = y;
				size[y] += size[x];
				edge[y] += edge[x]+1;
			}else{
				root[y] = x;
				size[x] += size[y];
				edge[x] += edge[y]+1;
				if(rank[x]==rank[y]){
					rank[x]++;
				}
			}
		}
	}

	public boolean same(int x,int y){
		return find(x)==find(y);
	}

}
class LightUnionFindTree {
	int[] par;
	int num;
	LightUnionFindTree(int N){
		par = new int[N];
		num = N;
		for(int i=0;i<N;i++){
			par[i] = -1;
		}
	}
	public boolean isRoot(int x) {
		return x==find(x);
	}
	
	public int find(int x){
		if(par[x]<0){
			return x;
		}else{
			return find(par[x]);
		}
	}

	public void unite(int x,int y){
		x = find(x);
		y = find(y);
		if(x==y){
			return;
		}else{
			num--;
			if(par[x]<par[y]){
				par[x] += par[y];
				par[y] = x;
			}else{
				par[y] += par[x];
				par[x] = y;
			}
		}
	}

	public boolean same(int x,int y){
		return find(x)==find(y);
	}

}

class ParticalEternalLastingUnionFindTree extends UnionFindTree{
	int[] time;
	int now;
	ParticalEternalLastingUnionFindTree(int N){
		super(N);
		time = new int[N];
		for(int i=0;i<N;i++) {
			time[i] = 1000000007;
		}
	}

	public int find(int t,int i) {
		if(time[i]>t) {
			return i;
		}else {
			return find(t,root[i]);
		}
	}

	public void unite(int x,int y,int t) {
		now = t;
		x = find(t,x);
		y = find(t,y);
		if(x==y)return;
		if(rank[x]<rank[y]){
			root[x] = y;
			size[y] += size[x];
			time[x] = t;
		}else{
			root[y] = x;
			size[x] += size[y];
			if(rank[x]==rank[y]){
				rank[x]++;
			}
			time[y] = t;
		}
	}

	public int sametime(int x,int y) {
		if(find(now,x)!=find(now,y)) return -1;
		int ok = now;
		int ng = 0;
		while(ok-ng>1) {
			int mid = (ok+ng)/2;
			if(find(mid,x)==find(mid,y)) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}


}
class Graph {
	ArrayList<Edge>[] list;
	int size;
	TreeSet<LinkEdge> Edges = new TreeSet<LinkEdge>(new LinkEdgeComparator());

	@SuppressWarnings("unchecked")
	Graph(int N){
		size = N;
		list = new ArrayList[N];
		for(int i=0;i<N;i++){
			list[i] = new ArrayList<Edge>();
		}
	}

	public long[] dicount(int s) {
		long[] L = new long[size];
		long[] c = new long[size];
		int mod = 1000000007;
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		int[] v = new int[size];
		L[s] = 0;
		c[s] = 1;
		PriorityQueue<LongIntPair> Q = new PriorityQueue<LongIntPair>(new LongIntComparator());
		Q.add(new LongIntPair(0,s));

		while(!Q.isEmpty()){

			LongIntPair C = Q.poll();

			if(v[C.b]==0){
				L[C.b] = C.a;
				v[C.b] = 1;
				for(Edge D:list[C.b]) {
					//System.out.println(C.b +" "+ D.to);
					if(L[D.to]==-1||L[D.to]>L[C.b]+D.cost) {
						L[D.to]=L[C.b]+D.cost;
						c[D.to] = c[C.b];
						Q.add(new LongIntPair(L[C.b]+D.cost,D.to));
					}else if(L[D.to]==L[C.b]+D.cost) {
						c[D.to] += c[C.b];
					}
					c[D.to] %= mod;

				}
			}
		}
		return c;
	}

	public long[] roots(int s) {
		int[] in = new int[size];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		long[] N = new long[size];
		long mod = 1000000007;
		for(int i=0;i<size;i++) {
			for(Edge e:list[i])in[e.to]++;
		}
		for(int i=0;i<size;i++) {
			if(in[i]==0)q.add(i);
		}
		N[s] = 1;
		while(!q.isEmpty()) {
			int v = q.poll();
			for(Edge e:list[v]) {
				N[e.to] += N[v];
				if(N[e.to]>=mod)N[e.to]-= mod;
				in[e.to]--;
				if(in[e.to]==0)q.add(e.to);
			}
		}
		return N;
		
	}







	void addEdge(int a,int b){
		list[a].add(new Edge(b,1));
	}

	void addWeightedEdge(int a,int b,long c){
		list[a].add(new Edge(b,c));
	}

	void addEgdes(int[] a,int[] b){
		for(int i=0;i<a.length;i++){
			list[a[i]].add(new Edge(b[i],1));
		}
	}

	void addWeightedEdges(int[] a ,int[] b ,int[] c){
		for(int i=0;i<a.length;i++){
			list[a[i]].add(new Edge(b[i],c[i]));
		}
	}
	long[] bfs(int s){
		long[] L = new long[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		L[s] = 0;
		ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
		Q.add(s);

		while(!Q.isEmpty()){
			int v = Q.poll();
			for(Edge e:list[v]){
				int w = e.to;
				long c = e.cost;
				if(L[w]==-1){
					L[w] = L[v] + c;
					Q.add(w);
				}
			}
		}
		return L;
	}
	
	
	long[][] bfswithrev(int s){
		long[][] L = new long[2][size];
		for(int i=0;i<size;i++){
			L[0][i] = -1;
			L[1][i] = -1;
		}
		L[0][s] = 0;
		ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
		Q.add(s);

		while(!Q.isEmpty()){
			int v = Q.poll();
			for(Edge e:list[v]){
				int w = e.to;
				long c = e.cost;
				if(L[0][w]==-1){
					L[0][w] = L[0][v] + c;
					L[1][w] = v;
					Q.add(w);
				}
			}
		}
		return L;
	}
	long[] bfs2(int[] d,int s){
		long[] L = new long[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		int p = 0;
		L[s] = 0;
		d[s] = p;
		p++;
		ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
		Q.add(s);

		while(!Q.isEmpty()){
			int v = Q.poll();
			for(Edge e:list[v]){
				int w = e.to;
				long c = e.cost;
				if(L[w]==-1){
					d[w] = p;
					p++;
					L[w] = L[v] + c;
					Q.add(w);
				}
			}
		}
		return L;
	}
	boolean bfs3(int s,long[] L, int[] vi){
		
		if(vi[s]==1) return true;
		
		vi[s] = 1;
		ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
		Q.add(s);
 
		while(!Q.isEmpty()){
			int v = Q.poll();
			for(Edge e:list[v]){
				int w = e.to;
				long c = e.cost;
				if(vi[e.to]==0) {
					L[e.to] = (int)c - L[v];
					Q.add(w);
					vi[e.to] = 1;
				}else {
					if(L[e.to]!=(int)c - L[v]) {	
						return false;
					}
				}
			}
		}
		return true;
	}
	int[] isTwoColor(){
		int[] L = new int[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		L[0] = 0;
		ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
		Q.add(0);

		while(!Q.isEmpty()){
			int v = Q.poll();
			for(Edge e:list[v]){
				int w = e.to;
				if(L[w]==-1){
					L[w] = 1-L[v];
					Q.add(w);
				}else{
					if(L[v]+L[w]!=1){
						L[0] = -2;
					}
				}
			}
		}
		return L;
	}
	void isTwoColor2(int i,int[] L){
		
		
		L[i] = 0;
		ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
		Q.add(i);

		while(!Q.isEmpty()){
			int v = Q.poll();
			for(Edge e:list[v]){
				int w = e.to;
				if(L[w]==-1){
					L[w] = 1-L[v];
					Q.add(w);
				}else{
					if(L[v]+L[w]!=1){
						L[0] = -2;
					}
				}
			}
		}
	}

	long[] dijkstra(int s){
		long[] L = new long[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		int[] v = new int[size];
		L[s] = 0;
		PriorityQueue<LongIntPair> Q = new PriorityQueue<LongIntPair>(new LongIntComparator());
		Q.add(new LongIntPair(0,s));

		while(!Q.isEmpty()){

			LongIntPair C = Q.poll();

			if(v[C.b]==0){
				L[C.b] = C.a;
				v[C.b] = 1;
				for(Edge D:list[C.b]) {
					if(L[D.to]==-1||L[D.to]>L[C.b]+D.cost) {
						L[D.to]=L[C.b]+D.cost;
						Q.add(new LongIntPair(L[C.b]+D.cost,D.to));
					}

				}
			}
		}
		return L;
	}
	public long[] dijkstra2(int s, long mid) {
		long[] L = new long[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		int[] v = new int[size];
		L[s] = 0;
		PriorityQueue<LongIntPair> Q = new PriorityQueue<LongIntPair>(new LongIntComparator());
		Q.add(new LongIntPair(0,s));
		int lg = 1000000007;
		while(!Q.isEmpty()){
			LongIntPair C = Q.poll();

			if(v[C.b]==0){
				L[C.b] = C.a;
				v[C.b] = 1;
				for(Edge D:list[C.b]) {
					if((L[D.to]==-1||L[D.to]>L[C.b]+D.cost%lg)&&L[C.b]+D.cost/lg<=mid) {
						L[D.to]=L[C.b]+D.cost%lg;
						Q.add(new LongIntPair(L[C.b]+D.cost%lg,D.to));
					}
				}
			}
		}
		return L;
	}
	
	

	



	ArrayList<Graph> makeapart(){
		ArrayList<Graph> ans = new ArrayList<Graph>();
		boolean[] b = new boolean[size];
		int[] num = new int[size];
		for(int i=0;i<size;i++){
			if(b[i])continue;
			int sz = 0;
			ArrayList<Integer> l = new ArrayList<Integer>();
			ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
			Q.add(i);
			b[i] = true;
			while(!Q.isEmpty()){
				int v = Q.poll();
				num[v] = sz;
				sz++;
				l.add(v);
				for(Edge e:list[v]){
					if(!b[e.to]){
						Q.add(e.to);
						b[e.to] = true;
					}
				}
			}
			Graph H = new Graph(sz);
			for(int e:l){
				for(Edge E:list[e]){
					H.addWeightedEdge(num[e],num[E.to],E.cost);
				}
			}
			ans.add(H);

		}
		return ans;
	}

	long[] bellmanFord(int s) {
		long inf = 1000000000;
		inf *= inf;
		long[] d = new long[size];
		boolean[] n = new boolean[size];
		d[s] = 0;
		for(int i=1;i<size;i++){
			d[i] = inf;
			d[i] *= d[i];
		}
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size;j++){
				for(Edge E:list[j]){
					if(d[j]!=inf&&d[E.to]>d[j]+E.cost){
						d[E.to]=d[j]+E.cost;
					}
				}
			}
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				for(Edge e:list[j]){
					if(d[j]==inf) continue;
					if(d[e.to]>d[j]+e.cost) {
						d[e.to]=d[j]+e.cost;
						n[e.to] = true;
					}
					if(n[j])n[e.to] = true;
				}
			}
		}
		for(int i=0;i<size;i++) {
			if(n[i])d[i] = inf;
		}
		return d;
	}

	long[][] WarshallFloyd(long[][] a){
		int n = a.length;
		long[][] ans = new long[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans[i][j] = a[i][j]==0?(long)1e16:a[i][j];
				if(i==j)ans[i][j]=0;
			}
		}
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					ans[i][j] = Math.min(ans[i][j],ans[i][k]+ans[k][j]);
				}
			}
		}
		return ans;
	}
	long[] maxtra(int s,long l){
		long[] L = new long[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		int[] v = new int[size];
		L[s] = -1;

		PriorityQueue<Pair> Q = new PriorityQueue<Pair>(new SampleComparator());
		Q.add(new Pair(l,s));

		while(!Q.isEmpty()){

			Pair C = Q.poll();
			if(v[(int)C.b]==0){
				L[(int)C.b] = C.a;
				v[(int) C.b] = 1;
				for(Edge D:list[(int) C.b])Q.add(new Pair(Math.max(L[(int)C.b],D.cost),D.to));
			}
		}

		return L;
	}
	long[] mintra(int s){
		long[] L = new long[size];
		for(int i=0;i<size;i++){
			L[i] = -1;
		}
		int[] v = new int[size];
		L[s] = s;

		PriorityQueue<Pair> Q = new PriorityQueue<Pair>(new SampleComparator().reversed());
		Q.add(new Pair(s,s));

		while(!Q.isEmpty()){

			Pair C = Q.poll();
			if(v[(int)C.b]==0){
				L[(int)C.b] = C.a;
				v[(int) C.b] = 1;
				for(Edge D:list[(int) C.b])Q.add(new Pair(Math.min(L[(int)C.b],D.cost),D.to));
			}
		}

		return L;
	}
	long Kruskal(){
		long r = 0;
		for(int i=0;i<size;i++) {
			for(Edge e:list[i]) {
				Edges.add(new LinkEdge(e.cost,i,e.to));
			}
		}
		UnionFindTree UF = new UnionFindTree(size);
		for(LinkEdge e:Edges){
			if(e.a>=0&&e.b>=0) {
				if(!UF.same(e.a,e.b)){
					//System.out.println("a : " + e.a + " b : " + e.b + " c : " + e.L);
					r += e.L;
					UF.unite(e.a,e.b);
				}
			}
		}
		return r;
	}

	ArrayList<Integer> Kahntsort(){

		ArrayList<Integer> ans = new ArrayList<Integer>();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int[] in = new int[size];
		for(int i=0;i<size;i++) {
			for(Edge e:list[i])in[e.to]++;
		}
		for(int i=0;i<size;i++) {
			if(in[i]==0)q.add(i);
		}
		while(!q.isEmpty()) {
			int v = q.poll();
			ans.add(v);
			for(Edge e:list[v]) {
				in[e.to]--;
				if(in[e.to]==0)q.add(e.to);
			}
		}
		for(int i=0;i<size;i++) {
			if(in[i]>0)return new ArrayList<Integer>();
		}
		return ans;
	}
	public Stack<Integer> findCycle() {
		Stack<Integer> ans = new Stack<Integer>();
		boolean[] v = new boolean[size];
		boolean[] f = new boolean[size];
		for(int i=0;i<size;i++) {
			if(findCycle(i,ans,v,f))break;
		}
		return ans;
	}
	private boolean findCycle(int i, Stack<Integer>ans, boolean[] v,boolean[] f) {
		v[i] = true;
		ans.push(i);
		for(Edge e:list[i]) {
			if(f[e.to]) continue;
			if(v[e.to]&&!f[e.to]) {
				return true;
			}
			if(findCycle(e.to,ans,v,f))return true;
		}
		ans.pop();
		f[i] = true;
		return false;
		
	}
	RootedTree dfsTree(int i) {
		int[] u = new int[size];
		RootedTree r = new RootedTree(size);
		dfsTree(i,u,r);
		return r;

	}

	private void dfsTree(int i, int[] u, RootedTree r) {
		u[i] = 1;
		for(Edge e:list[i]) {
			if(u[e.to]==0) {
				r.list[i].add(e);
				u[e.to] = 1;
				dfsTree(e.to,u,r);
			}
		}

	}
}


class Tree extends Graph{
	
	int[] trans;
	
	public Tree(int N) {
		super(N);
	}

	
	long[] tyokkei(){
		long[] a = bfs(0);

		
		int md = -1;
		long m = 0;
		for(int i=0;i<size;i++){
			if(m<a[i]){
				m = a[i];
				md = i;
			}
		}

		long[] b = bfs(md);
		int md2 = -1;
		long m2 = 0;
		for(int i=0;i<size;i++){
			if(m2<b[i]){
				m2 = b[i];
				md2 = i;
			}
		}
		long[] r = {m2,md,md2};
		return r;
	}

}

class RootedTree extends Graph{
	RootedTree(int N){
		super(N);
	}
}
class LinkEdge{
	long L;
	int a ;
	int b;
	int id;
	LinkEdge(long l,int A,int B){
		L = l;
		a = A;
		b = B;
	}
	LinkEdge(long l,int A,int B,int i){
		L = l;
		a = A;
		b = B;
		id = i;
	}
	public boolean equals(Object o){
		LinkEdge O = (LinkEdge) o;
		return O.a==this.a&&O.b==this.b&&O.L==this.L;
	}

	public int hashCode(){
		return Objects.hash(L,a,b);
	}
}

class DoubleLinkEdge{
	double D;
	int a;
	int b;
	DoubleLinkEdge(double d,int A,int B){
		D = d;
		a = A;
		b = B;
	}
	public boolean equals(Object o){
		DoubleLinkEdge O = (DoubleLinkEdge) o;
		return O.a==this.a&&O.b==this.b&&O.D==this.D;
	}
 
	public int hashCode(){
		return Objects.hash(D,a,b);
	}
}
 

class Edge{
	int to;
	long cost;
	Edge(int a,long b){
		to = a;
		cost = b;
	}
}

class DoubleLinkEdgeComparator implements Comparator<DoubleLinkEdge>{
	public int compare(DoubleLinkEdge P, DoubleLinkEdge Q) {
		return Double.compare(P.D,Q.D);
	}
}

class LinkEdgeComparator implements Comparator<LinkEdge>{
	public int compare(LinkEdge P, LinkEdge Q) {
		return Long.compare(P.L,Q.L);
	}
}


class Pair{
	long a;
	long b;

	Pair(long p,long q){
		this.a = p;
		this.b = q;
	}

	public boolean equals(Object o){
		Pair O = (Pair) o;
		return O.a==this.a&&O.b==this.b;
	}

	public int hashCode(){
		return Objects.hash(a,b);
	}
}

class SampleComparator implements Comparator<Pair>{
	public int compare(Pair P, Pair Q) {
		long t = P.a-Q.a;
		if(t==0){
			if(P.b==Q.b)return 0;
			return P.b>Q.b?1:-1;

		}
		return t>=0?1:-1;
	}
}


class LongIntPair{
	long a;
	int b;

	LongIntPair(long p,int q){
		this.a = p;
		this.b = q;
	}

	public boolean equals(Object o){
		LongIntPair O = (LongIntPair) o;
		return O.a==this.a&&O.b==this.b;

	}

	public int hashCode(){
		return Objects.hash(a,b);
	}
}

class LongIntComparator implements Comparator<LongIntPair>{
	public int compare(LongIntPair P, LongIntPair Q) {
		long t = P.a-Q.a;
		if(t==0){
			if(P.b>Q.b){
				return 1;
			}else{
				return -1;
			}
		}
		return t>=0?1:-1;
	}
}


class IntIntPair{
	int a;
	int b;

	IntIntPair(int p,int q){
		this.a = p;
		this.b = q;
	}
	IntIntPair(int p,int q,String s){
		if(s.equals("sort")) {
			this.a = Math.min(p,q);
			this.b = Math.max(p,q);
		}
	}

	
	public boolean equals(Object o){
		IntIntPair O = (IntIntPair) o;
		return O.a==this.a&&O.b==this.b;

	}

	public int hashCode(){
		return Objects.hash(a,b);
	}
}



class IntIntComparator implements Comparator<IntIntPair>{
	public int compare(IntIntPair P, IntIntPair Q) {
		int t = P.a-Q.a;
		if(t==0){
			return P.b-Q.b;
		}
		return t;
	}
}

class CIPair{
	char c;
	int i;
	CIPair(char C,int I){
		c = C;
		i = I;
	}
	public boolean equals(Object o){
		CIPair O = (CIPair) o;
		return O.c==this.c&&O.i==this.i;
	}
	public int hashCode(){
		return Objects.hash(c,i);
	}
}




class DoublePair{
	double a;
	double b;

	DoublePair(double p,double q){
		this.a = p;
		this.b = q;
	}

	public boolean equals(Object o){
		DoublePair O = (DoublePair) o;
		return O.a==this.a&&O.b==this.b;

	}

	public int hashCode(){
		return Objects.hash(a,b);
	}
}
class Triplet{
	long a;
	long b;
	long c;
	Triplet(long p,long q,long r){
		a = p;
		b = q;
		c = r;
	}
	public boolean equals(Object o){
		Triplet O = (Triplet) o;
		return O.a==this.a&&O.b==this.b&&O.c==this.c?true:false;

	}

	public int hashCode(){
		return Objects.hash(a,b,c);
	}
}

class TripletComparator implements Comparator<Triplet>{
	public int compare(Triplet P, Triplet Q) {
		long t = P.a-Q.a;
		if(t==0){
			long tt = P.b-Q.b;
			if(tt==0) {
				if(P.c>Q.c) {
					return 1;
				}else if(P.c<Q.c){
					return -1;
				}else {
					return 0;
				}
			}
			return tt>0?1:-1;
		}
		return t>=0?1:-1;
	}
}
class DDComparator implements Comparator<DoublePair>{
	public int compare(DoublePair P, DoublePair Q) {
		return P.a-Q.a>=0?1:-1;
	}
}

class DoubleTriplet{
	double a;
	double b;
	double c;

	DoubleTriplet(double p,double q,double r){
		this.a = p;
		this.b = q;
		this.c = r;
	}

	public boolean equals(Object o){
		DoubleTriplet O = (DoubleTriplet) o;
		return O.a==this.a&&O.b==this.b&&O.c==this.c;

	}

	public int hashCode(){
		return Objects.hash(a,b,c);
	}
}

class DoubleTripletComparator implements Comparator<DoubleTriplet>{
	public int compare(DoubleTriplet P, DoubleTriplet Q) {
		if(P.a==Q.a) return 0;
		return P.a-Q.a>0?1:-1;
	}
}


class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }
    private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }
    
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }
    
    Graph nextyukoGraph(int n,int m) {
    	Graph G = new Graph(n);
    	for(int i=0;i<m;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		G.addEdge(a,b);
    	}
    	return G;
    }
    
    Graph nextGraph(int n,int m) {
    	Graph G = new Graph(n);
    	for(int i=0;i<m;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		G.addEdge(a,b);
    		G.addEdge(b,a);
    	}
    	return G;
    }
    
    Graph nextWeightedGraph(int n,int m) {
    	Graph G = new Graph(n);
    	for(int i=0;i<m;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		long c = nextLong();
    		G.addWeightedEdge(a,b,c);
    		G.addWeightedEdge(b,a,c);
    	}
    	return G;
    }
    
    Tree nextTree(int n) {
    	Tree T = new Tree(n);
    	for(int i=0;i<n-1;i++) {
    		int a = nextInt()-1;
    		int b = nextInt()-1;
    		T.addEdge(a,b);
    		T.addEdge(b,a);
    	}
    	return T;
    }
}


class Mathplus{
	long mod = 1000000007;
	long[] fac;
	long[] revfac;
	long[][] comb;
	long[] pow;
	long[] revpow;
	boolean isBuild = false;
	boolean isBuildc = false;
	boolean isBuildp = false;
	int mindex = -1;
	int maxdex = -1;
	int graydiff = 0;
	int graymark = 0;
	

	int color(int[][] diff,int N) {

		int[] val = new int[1<<N];
		val[0] = 1;
		for(int i=0;i<(1<<N);i++) {
			for(int j=0;j<N;j++) {
				if(contains(i,j)) {
					if(val[bitremove(i,j)]==1) {
						boolean b = true;
						for(int k=0;k<N;k++) {
							if(contains(i,k)&&diff[j][k]==1) {
								b = false;
							}
						}
						if(b)val[i] = 1;
					}
					break;
				}
			}
		}
		int[] dp = new int[1<<N];
		Arrays.fill(dp,N+1);;
		dp[0] = 0;
		for(int i=0;i<(1<<N);i++) {
			for(int j=i;j>0;j=(j-1)&i) {
				if(val[j]==1)dp[i]=Math.min(dp[i],dp[i^j]+1);
			}
		}
		return dp[(1<<N)-1];
	}

	public void timeout() throws InterruptedException {
		Thread.sleep(10000);
	}

	public int gray(int i) {
		for(int j=0;j<20;j++) {
			if(contains(i,j)) {
				graydiff = j;
				if(contains(i,j+1))graymark=-1;
				else graymark = 1;
				break;
			}
		}
		return i ^ (i>>1);
			

	}

	public void hakidashi(long[] A) {
		Arrays.sort(A);
		int N = A.length;
		int[] index = new int[61];
		for(int i=0;i<=60;i++){
			index[i] = -1;
		}
		int searching = 60;
		int [] used = new int[N];
		while(searching>=0){
			boolean b = true;
			for(int i=N-1;i>=0;i--){
				for(int j=60;j>searching;j--){
					if((A[i]>>j&1)==1){
						if(i!=index[j]&&index[j]!=-1){
							A[i] ^= A[index[j]];
							//System.out.println(i+" changed by " + index[j]);
							//System.out.println(A[i]);
						}
					}
				}
				if((A[i]>>searching&1)==1&&used[i]==0){
					//System.out.println("find " + searching+" is "+i);
					index[searching] = i;
					searching--;
					used[i] = 1;
					b = false;
					if(searching==-1){
						searching = 0;
					}
				}
			}
			if(b){
				searching--;
			}

		}

		for(int i=N-1;i>=0;i--){
			for(int j=60;j>=searching;j--){
				if((A[i]>>j&1)==1){
					if(i!=index[j]&&index[j]!=-1){
						A[i] ^= A[index[j]];
					}
				}
			}
		}

		Arrays.sort(A);
		
	}

	public void printjudge(boolean b, String y, String n) {
		System.out.println(b?y:n);
	}
	public void printYN(boolean b) {
		printjudge(b,"Yes","No");
	}
	public void printyn(boolean b) {
		printjudge(b,"yes","no");
	}
	
	public void reverse(int[] x) {
		int[] r = new int[x.length];
		for(int i=0;i<x.length;i++)r[i] = x[x.length-1-i];
		for(int i=0;i<x.length;i++)x[i] = r[i];
	}
	public void reverse(long[] x) {
		long[] r = new long[x.length];
		for(int i=0;i<x.length;i++)r[i] = x[x.length-1-i];
		for(int i=0;i<x.length;i++)x[i] = r[i];
	}

	public DoubleTriplet Line(double x1,double y1,double x2,double y2) {
		double a = y1-y2;
		double b = x2-x1;
		double c = x1*y2-x2*y1;
		return new DoubleTriplet(a,b,c);
	}
	public double putx(DoubleTriplet T,double x) {
		return -(T.a*x+T.c)/T.b;
	}
	public double puty(DoubleTriplet T,double y) {
		return -(T.b*y+T.c)/T.a;
	}
	public double Distance(DoublePair P,DoublePair Q) {
		return Math.sqrt((P.a-Q.a) * (P.a-Q.a) + (P.b-Q.b) * (P.b-Q.b));
	}
	public double DistanceofPointandLine(DoublePair P,Triplet T) {
		return Math.abs(P.a*T.a+P.b*T.b+T.c) / Math.sqrt(T.a*T.a+T.b*T.b);
	}
	public boolean cross(long ax, long ay, long bx, long by, long cx, long cy, long dx, long dy) {
		 long ta = (cx - dx) * (ay - cy) + (cy - dy) * (cx - ax);
		 long tb = (cx - dx) * (by - cy) + (cy - dy) * (cx - bx);
		 long tc = (ax - bx) * (cy - ay) + (ay - by) * (ax - cx);
		 long td = (ax - bx) * (dy - ay) + (ay - by) * (ax - dx);
		 return((tc>=0&&td<=0)||(tc<=0&&td>=0))&&((ta>=0&&tb<=0)||(ta<=0&&tb>=0));
	}
	public boolean dcross(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		 double ta = (cx - dx) * (ay - cy) + (cy - dy) * (cx - ax);
		 double tb = (cx - dx) * (by - cy) + (cy - dy) * (cx - bx);
		 double tc = (ax - bx) * (cy - ay) + (ay - by) * (ax - cx);
		 double td = (ax - bx) * (dy - ay) + (ay - by) * (ax - dx);
		 return((tc>=0&&td<=0)||(tc<=0&&td>=0))&&((ta>=0&&tb<=0)||(ta<=0&&tb>=0));
	}

	void buildFac(){
		fac = new long[10000003];
		revfac = new long[10000003];
		fac[0] = 1;
		for(int i=1;i<=10000002;i++){
			fac[i] = (fac[i-1] * i)%mod;
		}
		revfac[10000002] = rev(fac[10000002])%mod;
		for(int i=10000001;i>=0;i--) {
			revfac[i] = (revfac[i+1] * (i+1))%mod;
		}
		isBuild = true;
	}
	void buildFacn(int n){
		fac = new long[n+1];
		revfac = new long[n+1];
		fac[0] = 1;
		for(int i=1;i<=n;i++){
			fac[i] = (fac[i-1] * i)%mod;
		}
		revfac[n] = rev(fac[n])%mod;
		for(int i=n-1;i>=0;i--) {
			revfac[i] = (revfac[i+1] * (i+1))%mod;
		}
		isBuild = true;
	}
	public long[] buildrui(int[] a) {
		int n = a.length;
		long[] ans = new long[n];
		ans[0] = a[0];
		for(int i=1;i<n;i++) {
			ans[i] = ans[i-1] + a[i];
		}
		return ans;
	}
	public int[][] ibuildrui(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		int[][] ans = new int[n][m];
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] = a[i][j];
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] += ans[i][j-1] + ans[i-1][j] - ans[i-1][j-1];
			}
		}
		return ans;
	}
	public void buildruin(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				a[i][j] += a[i][j-1] + a[i-1][j] - a[i-1][j-1];
			}
		}
	}
	public long[][] buildrui(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		long[][] ans = new long[n][m];
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] = a[i][j];
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				ans[i][j] += ans[i][j-1] + ans[i-1][j] - ans[i-1][j-1];
			}
		}
		return ans;
	}
	public int getrui(int[][] r,int a,int b,int c,int d) {
		return r[c][d] - r[a-1][d] - r[c][b-1] + r[a-1][b-1];
	}
	public long getrui(long[][] r,int a,int b,int c,int d) {
		if(a<0||b<0||c>=r.length||d>=r[0].length) return mod;
		return r[c][d] - r[a-1][d] - r[c][b-1] + r[a-1][b-1];
	}
	
	long divroundup(long n,long d) {
		if(n==0)return 0;
		return (n-1)/d+1;
	}
	public long sigma(long i) {
		return i*(i+1)/2;
	}
	public int digit(long i) {
		int ans = 1;
		while(i>=10) {
			i /= 10;
			ans++;
		}
		return ans;

	}
	public int digitsum(long n) {
		int ans = 0;
		while(n>0) {
			ans += n%10;
			n /= 10;
		}
		return ans;
	}
	public int popcount(int i) {
		int ans = 0;
		while(i>0) {
			ans += i%2;
			i /= 2;
		}
		return ans;
	}
	public boolean contains(int S,int i) {return (S>>i&1)==1;}
	public int bitremove(int S,int i) {return S&(~(1<<i));}
	public int bitadd(int S,int i) {return S|(1<<i);}
	public boolean isSubSet(int S,int T) {return (S-T)==(S^T);}
	public boolean isDisjoint(int S,int T) {return (S+T)==(S^T);}
	public boolean contains(long S,int i) {return (S>>i&1)==1;}
	public long bitremove(long S,int i) {return S&(~(1<<i));}
	public long bitadd(long S,int i) {return S|(1<<i);}
	public boolean isSubSet(long S,long T) {return (S-T)==(S^T);}
	public boolean isDisjoint(long S,long T) {return (S+T)==(S^T);}
	public int isBigger(int[] d, int i) {
		int ok = d.length;
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(int[] d, int i) {
		int ok = -1;
		int ng = d.length;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isBigger(long[] d, long i) {
		int ok = d.length;
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(long[] d, long i) {
		int ok = -1;
		int ng = d.length;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d[mid]<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isBigger(ArrayList<Long> d, long i) {
		int ok = d.size();
		int ng = -1;
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d.get(mid)>i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public int isSmaller(ArrayList<Long> d, long i) {
		int ok = -1;
		int ng = d.size();
		while(Math.abs(ok-ng)>1) {
			int mid = (ok+ng)/2;
			if(d.get(mid)<i) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	public HashSet<Integer> primetable(int m) {
		HashSet<Integer> pt = new HashSet<Integer>();
		for(int i=2;i<=m;i++) {
			boolean b = true;
			for(int d:pt) {
				if(i%d==0) {
					b = false;
					break;
				}
			}
			if(b) {
				pt.add(i);
			}
		}
		return pt;
	}
	public ArrayList<Integer> primetablearray(int m) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		for(int i=2;i<=m;i++) {
			q.add(i);

		}
		boolean[] b = new boolean[m+1];
		while(!q.isEmpty()) {
			int e = q.poll();
			if(!b[e]) {
				al.add(e);
				for(int j=1;e*j<=1000000;j++) {
					b[e*j] = true;
				}
			}
		}
		return al;
	}
	
	public boolean isprime(int e) {
		if(e==1) return false;
		for(int i=2;i*i<=e;i++) {
			if(e%i==0) return false;
		}
		return true;
	}
	public MultiSet Factrization(int e) {
		MultiSet ret = new MultiSet();
		for(int i=2;i*i<=e;i++) {
			while(e%i==0) {
				ret.add(i);
				e /= i;
			}
		}
		if(e!=1)ret.add(e);
		return ret;
	}
	public HashMap<Integer,Integer> hipPush(ArrayList<Integer> l){
		HashMap<Integer,Integer> r = new HashMap<Integer,Integer>();
		TreeSet<Integer> s = new TreeSet<Integer>();
		for(int e:l)s.add(e);
		int p = 0;
		for(int e:s) {
			r.put(e,p);
			p++;
		}
		return r;
	}
	public TreeMap<Integer,Integer> thipPush(ArrayList<Integer> l){
		TreeMap<Integer,Integer> r = new TreeMap<Integer,Integer>();
		Collections.sort(l);
		int b = -(1000000007+9393);
		int p = 0;
		for(int e:l) {
			if(b!=e) {
				r.put(e,p);
				p++;
			}
			b=e;
		}
		return r;
	}
	int[] count(int[] a) {
		int[] c = new int[max(a)+1];
		for(int i=0;i<a.length;i++) {
			c[a[i]]++;
		}
		return c;
	}
	long max(long[] a){
		long M = Long.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(M<a[i]){
				M =a[i];
				maxdex = i;
			}
		}
		return M;
	}
	int max(int[] a){
		int M = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(M<a[i]){
				M =a[i];
				maxdex = i;
			}
		}
		return M;
	}
	long min(long[] a){
		long m = Long.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(m>a[i]){
				m =a[i];
				mindex = i;
			}
		}
		return m;
	}
	int min(int[] a){
		int m = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(m>a[i]){
				m =a[i];
				mindex = i;
			}
		}
		return m;
	}
	long sum(long[] a){
		long s = 0;
		for(int i=0;i<a.length;i++)s += a[i];
		return s;
	}
	long sum(int[] a){
		long s = 0;
		for(int i=0;i<a.length;i++)s += a[i];
		return s;
	}
	long gcd(long a, long b){
		a = Math.abs(a);
		b = Math.abs(b);
		if(a==0)return b;
		if(b==0)return a;
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}
	int igcd(int a, int b) {
		if(a%b==0) return b;
		else return igcd(b,a%b);
	}
	long lcm(long a, long b) {return a / gcd(a,b) * b;}
	public long perm(int a,int num) {
		if(!isBuild)buildFac();
		return fac[a]*(rev(fac[a-num]))%mod;
	}
	void buildComb(int N) {
		comb = new long[N+1][N+1];
		comb[0][0] = 1;
		for(int i=1;i<=N;i++) {
			comb[i][0] = 1;
			for(int j=1;j<N;j++) {
				comb[i][j] = comb[i-1][j-1]+comb[i-1][j];
				if(comb[i][j]>mod)comb[i][j]-=mod;
			}
			comb[i][i] = 1;
		}
	}
	public long comb(int a,int num){
		if(a-num<0)return 0;
		if(num<0)return 0;
		if(!isBuild)buildFac();
		return fac[a] * ((revfac[num]*revfac[a-num])%mod)%mod;
	}
	long mulchoose(int n,int k) {
		if(k==0) return 1;
		return comb(n+k-1,k);
	}
	long rev(long l) {return pow(l,mod-2);}

	void buildpow(int l,int i) {
		pow = new long[i+1];
		pow[0] = 1;
		for(int j=1;j<=i;j++) {
			pow[j] = pow[j-1]*l;
			if(pow[j]>mod)pow[j] %= mod;
		}
	}
	void buildrevpow(int l,int i) {
		revpow = new long[i+1];
		revpow[0] = 1;
		for(int j=1;j<=i;j++) {
			revpow[j] = revpow[j-1]*l;
			if(revpow[j]>mod) revpow[j] %= mod;
		}
	}
	long pow(long l, long i) {
		if(i==0)return 1;
		else{
			if(i%2==0){
				long val = pow(l,i/2);
				return val * val % mod;
			}
			else return pow(l,i-1) * l % mod;
		}
	}
	long mon(int i) {
		long ans = 0;
		for(int k=2;k<=i;k++) {
			ans += (k%2==0?1:-1) * revfac[k];
			ans += mod;
		}
		ans %= mod;
		ans *= fac[i];
		return ans%mod;
	}
	
	
	long dictnum(int[] A) {
		int N = A.length;
		long ans = 0;
		BinaryIndexedTree bit = new BinaryIndexedTree(N+1);
		buildFacn(N);
		for(int i=1;i<=N;i++) {
			bit.add(i,1);
		}
		for(int i=1;i<=N;i++) {
			int a = A[i-1];
			ans += bit.sum(a-1) * fac[N-i] % mod;
			bit.add(a,-1);
		}
		return (ans+1)%mod;
	}

}

 