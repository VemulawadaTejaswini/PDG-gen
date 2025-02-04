import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

class Main{
    
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;

public static class Edge{
int to;
int cost;
public Edge(int to){
this.to=to;
}
public Edge(int to,int cost){
this.to=to; this.cost=cost;
}
}

public static class Pair{
int x;
int y;
public Pair(int x,int y){
this.x=x; this.y=y;
}
static final Comparator<Pair> DISTANCE_ORDER=new Comp();
private static class Comp implements Comparator<Pair>{
public int compare(Pair p1,Pair p2){
return (p1.x>p2.x)?1:(p1.x<p2.x)?-1:0;
}
}
}

class MyArrayList extends ArrayList<Edge>{}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line.split(" ")[0]);
int k=Integer.parseInt(line.split(" ")[1]);
int[] c=new int[n];
int[] d=new int[n];
int[] dist=new int[n];
boolean[] visited=new boolean[n];
boolean[][] cg=new boolean[n][n];
MyArrayList[] array=new MyArrayList[n];
for(int i=0;i<n;i++){
line=br.readLine();
c[i]=Integer.parseInt(line.split(" ")[0]);
d[i]=Integer.parseInt(line.split(" ")[1]);
array[i]=new MyArrayList();
}
MyArrayList[] carray=array.clone();
for(int i=0;i<k;i++){
line=br.readLine();
int a=Integer.parseInt(line.split(" ")[0]);
int b=Integer.parseInt(line.split(" ")[1]);
array[a-1].add(new Edge(b-1));
array[b-1].add(new Edge(a-1));
}
for(int i=0;i<n;i++) bfs(i,d[i],visited,cg,array);
for(int i=0;i<n;i++){
for(int j=0;j<n&&j!=i;j++){
if(cg[i][j]) carray[i].add(new Edge(j,c[i]));
}
}
dijkstra(dist,carray);
out.println(dist[n-1]);
out.flush();
}
}

public static void bfs(int s,int t,boolean[] visited,boolean[][] cg,MyArrayList[] array){
Arrays.fill(visited,false);
ArrayList<Edge> list;
Deque<Pair> que=new ArrayDeque<Pair>();
que.offerLast(new Pair(s,t));
while(!que.isEmpty()){
Pair p=que.pollFirst();
int ns=p.x;
int nt=p.y;
list=array[ns];
if(nt>=0||list.size()==0) continue;
visited[ns]=true;
for(int i=0;i<list.size();i++){
Edge e=list.get(i);
if(!visited[e.to]) que.offerLast(new Pair(e.to,nt-1));
}
}
}

public static void dijkstra(int[] dist,MyArrayList[] array){
PriorityQueue<Pair> pque=new PriorityQueue<Pair>(10,Pair.DISTANCE_ORDER);
Arrays.fill(dist,INF);
dist[0]=0;
pque.offer(new Pair(0,0));
while(!pque.isEmpty()){
Pair p=pque.poll();
int v=p.y;
ArrayList<Edge> list=array[v];
if(dist[v]<p.x||list.size()==0) continue;
for(int i=0;i<list.size();i++){
Edge e=list.get(i);
if(d[e.to]>d[v]+e.cost){
d[e.to]=d[v]+e.cost;
pque.offer(new Pair(d[e.to],e.to));
}
}
}
}
}